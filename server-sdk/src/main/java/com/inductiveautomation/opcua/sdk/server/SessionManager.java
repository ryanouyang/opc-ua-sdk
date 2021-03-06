/*
 * Copyright 2014 Inductive Automation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.inductiveautomation.opcua.sdk.server;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.security.KeyPair;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.math.DoubleMath;
import com.google.common.primitives.Bytes;
import com.inductiveautomation.opcua.sdk.server.identity.IdentityValidator;
import com.inductiveautomation.opcua.sdk.server.services.ServiceAttributes;
import com.inductiveautomation.opcua.stack.core.StatusCodes;
import com.inductiveautomation.opcua.stack.core.UaException;
import com.inductiveautomation.opcua.stack.core.UaRuntimeException;
import com.inductiveautomation.opcua.stack.core.application.services.AttributeServiceSet;
import com.inductiveautomation.opcua.stack.core.application.services.MethodServiceSet;
import com.inductiveautomation.opcua.stack.core.application.services.MonitoredItemServiceSet;
import com.inductiveautomation.opcua.stack.core.application.services.NodeManagementServiceSet;
import com.inductiveautomation.opcua.stack.core.application.services.QueryServiceSet;
import com.inductiveautomation.opcua.stack.core.application.services.ServiceRequest;
import com.inductiveautomation.opcua.stack.core.application.services.SessionServiceSet;
import com.inductiveautomation.opcua.stack.core.application.services.SubscriptionServiceSet;
import com.inductiveautomation.opcua.stack.core.application.services.ViewServiceSet;
import com.inductiveautomation.opcua.stack.core.channel.ServerSecureChannel;
import com.inductiveautomation.opcua.stack.core.security.SecurityAlgorithm;
import com.inductiveautomation.opcua.stack.core.security.SecurityPolicy;
import com.inductiveautomation.opcua.stack.core.types.builtin.ByteString;
import com.inductiveautomation.opcua.stack.core.types.builtin.DiagnosticInfo;
import com.inductiveautomation.opcua.stack.core.types.builtin.NodeId;
import com.inductiveautomation.opcua.stack.core.types.builtin.StatusCode;
import com.inductiveautomation.opcua.stack.core.types.structured.ActivateSessionRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.ActivateSessionResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.AddNodesRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.AddNodesResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.AddReferencesRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.AddReferencesResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.AnonymousIdentityToken;
import com.inductiveautomation.opcua.stack.core.types.structured.BrowseNextRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.BrowseNextResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.BrowseRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.BrowseResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.CallRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.CallResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.CancelRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.CancelResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.CloseSessionRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.CloseSessionResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.CreateMonitoredItemsRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.CreateMonitoredItemsResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.CreateSessionRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.CreateSessionResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.CreateSubscriptionRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.CreateSubscriptionResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.DeleteMonitoredItemsRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.DeleteMonitoredItemsResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.DeleteNodesRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.DeleteNodesResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.DeleteReferencesRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.DeleteReferencesResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.DeleteSubscriptionsRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.DeleteSubscriptionsResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.EndpointDescription;
import com.inductiveautomation.opcua.stack.core.types.structured.HistoryReadRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.HistoryReadResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.HistoryUpdateRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.HistoryUpdateResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.IssuedIdentityToken;
import com.inductiveautomation.opcua.stack.core.types.structured.ModifyMonitoredItemsRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.ModifyMonitoredItemsResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.ModifySubscriptionRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.ModifySubscriptionResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.PublishRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.PublishResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.QueryFirstRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.QueryFirstResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.QueryNextRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.QueryNextResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.ReadRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.ReadResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.RegisterNodesRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.RegisterNodesResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.RepublishRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.RepublishResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.SetMonitoringModeRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.SetMonitoringModeResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.SetPublishingModeRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.SetPublishingModeResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.SetTriggeringRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.SetTriggeringResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.SignatureData;
import com.inductiveautomation.opcua.stack.core.types.structured.SignedSoftwareCertificate;
import com.inductiveautomation.opcua.stack.core.types.structured.TransferSubscriptionsRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.TransferSubscriptionsResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.TranslateBrowsePathsToNodeIdsRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.TranslateBrowsePathsToNodeIdsResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.UnregisterNodesRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.UnregisterNodesResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.UserIdentityToken;
import com.inductiveautomation.opcua.stack.core.types.structured.UserNameIdentityToken;
import com.inductiveautomation.opcua.stack.core.types.structured.UserTokenPolicy;
import com.inductiveautomation.opcua.stack.core.types.structured.WriteRequest;
import com.inductiveautomation.opcua.stack.core.types.structured.WriteResponse;
import com.inductiveautomation.opcua.stack.core.types.structured.X509IdentityToken;
import com.inductiveautomation.opcua.stack.core.util.CertificateUtil;
import com.inductiveautomation.opcua.stack.core.util.NonceUtil;
import com.inductiveautomation.opcua.stack.core.util.SignatureUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.inductiveautomation.opcua.stack.core.types.builtin.unsigned.Unsigned.uint;

public class SessionManager implements
        AttributeServiceSet,
        MethodServiceSet,
        MonitoredItemServiceSet,
        NodeManagementServiceSet,
        QueryServiceSet,
        SessionServiceSet,
        SubscriptionServiceSet,
        ViewServiceSet {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final Map<NodeId, Session> createdSessions = Maps.newConcurrentMap();
    private final Map<NodeId, Session> activeSessions = Maps.newConcurrentMap();
    private final Map<NodeId, Session> inactiveSessions = Maps.newConcurrentMap();

    private final OpcUaServer server;

    public SessionManager(OpcUaServer server) {
        this.server = server;
    }

    public List<Session> getActiveSessions() {
        return Lists.newArrayList(activeSessions.values());
    }

    public List<Session> getInactiveSessions() {
        return Lists.newArrayList(inactiveSessions.values());
    }

    private Session session(ServiceRequest<?, ?> service) throws UaException {
        long secureChannelId = service.getSecureChannel().getChannelId();
        NodeId authToken = service.getRequest().getRequestHeader().getAuthenticationToken();

        Session session = activeSessions.get(authToken);

        if (session == null) {
            session = createdSessions.remove(authToken);

            if (session == null) {
                throw new UaException(StatusCodes.Bad_SessionIdInvalid);
            } else {
                if (session.getSecureChannelId() != secureChannelId) {
                    createdSessions.put(authToken, session);
                    throw new UaException(StatusCodes.Bad_SecurityChecksFailed);
                } else {
                    throw new UaException(StatusCodes.Bad_SessionNotActivated);
                }
            }
        }

        if (session.getSecureChannelId() != secureChannelId) {
            throw new UaException(StatusCodes.Bad_SecurityChecksFailed);
        }

        session.updateLastActivity();

        service.attr(ServiceAttributes.ServerKey).set(server);
        service.attr(ServiceAttributes.SessionKey).set(session);

        return session;
    }

    //region Session Services
    @Override
    public void onCreateSession(ServiceRequest<CreateSessionRequest, CreateSessionResponse> serviceRequest) throws UaException {
        CreateSessionRequest request = serviceRequest.getRequest();

        long maxSessionCount = server.getConfig().getLimits().getMaxSessionCount().longValue();
        if (createdSessions.size() + activeSessions.size() >= maxSessionCount) {
            serviceRequest.setServiceFault(StatusCodes.Bad_TooManySessions);
            return;
        }

        ByteString serverNonce = NonceUtil.generateNonce(32);
        NodeId authenticationToken = new NodeId(0, NonceUtil.generateNonce(32));
        long maxRequestMessageSize = serviceRequest.getServer().getChannelConfig().getMaxMessageSize();
        double revisedSessionTimeout = Math.max(5000, Math.min(30000, request.getRequestedSessionTimeout()));

        ServerSecureChannel secureChannel = serviceRequest.getSecureChannel();

        ByteString serverCertificate = serviceRequest.getSecureChannel().getEndpointDescription().getServerCertificate();
        SignedSoftwareCertificate[] serverSoftwareCertificates = server.getSoftwareCertificates();
        EndpointDescription[] serverEndpoints = server.getEndpointDescriptions();

        ByteString clientNonce = request.getClientNonce();
        if (clientNonce.isNotNull() && clientNonce.length() < 32) {
            throw new UaException(StatusCodes.Bad_NonceInvalid);
        }

        ByteString clientCertificate = request.getClientCertificate();
        if (clientCertificate.isNotNull()) {
            String applicationUri = request.getClientDescription().getApplicationUri();
            X509Certificate certificate = CertificateUtil.decodeCertificate(clientCertificate.bytes());

            validateApplicationUri(applicationUri, certificate);
        }

        SecurityPolicy securityPolicy = secureChannel.getSecurityPolicy();
        SignatureData serverSignature = getServerSignature(
                clientNonce,
                clientCertificate,
                securityPolicy,
                secureChannel.getKeyPair()
        );

        NodeId sessionId = new NodeId(1, "Session:" + UUID.randomUUID());
        Duration sessionTimeout = Duration.ofMillis(DoubleMath.roundToLong(revisedSessionTimeout, RoundingMode.UP));
        Session session = new Session(server, sessionId, sessionTimeout, secureChannel.getChannelId());
        createdSessions.put(authenticationToken, session);

        session.addLifecycleListener((s, remove) -> {
            createdSessions.remove(authenticationToken);
            activeSessions.remove(authenticationToken);
        });

        session.setLastNonce(serverNonce);

        CreateSessionResponse response = new CreateSessionResponse(
                serviceRequest.createResponseHeader(),
                sessionId,
                authenticationToken,
                revisedSessionTimeout,
                serverNonce,
                serverCertificate,
                serverEndpoints,
                serverSoftwareCertificates,
                serverSignature,
                uint(maxRequestMessageSize)
        );

        serviceRequest.setResponse(response);
    }

    /**
     * Validate that the application URI matches the SubjectAltName URI in the given certificate.
     *
     * @param applicationUri the URI to match.
     * @param certificate    the certificate to match against.
     * @throws UaException if the certificate is invalid, does not contain a uri, or contains a uri that does not match.
     */
    private void validateApplicationUri(String applicationUri, X509Certificate certificate) throws UaException {
        try {
            Collection<List<?>> subjectAltNames = certificate.getSubjectAlternativeNames();
            if (subjectAltNames == null) subjectAltNames = Collections.emptyList();

            for (List<?> idAndValue : subjectAltNames) {
                if (idAndValue != null && idAndValue.size() == 2) {
                    if (idAndValue.get(0).equals(6)) {
                        String certificateUri = (String) idAndValue.get(1);
                        if (!applicationUri.equals(certificateUri)) {
                            String message = String.format(
                                    "Certificate URI does not match. certificateUri=%s, applicationUri=%s",
                                    certificateUri, applicationUri);

                            logger.warn(message);

                            throw new UaException(StatusCodes.Bad_CertificateUriInvalid, message);
                        }
                        return;
                    }
                }
            }

            String message = String.format("Certificate URI not found. applicationUri=%s", applicationUri);

            logger.warn(message);

            throw new UaException(StatusCodes.Bad_CertificateUriInvalid, message);
        } catch (CertificateParsingException e) {
            logger.warn("Error parsing client certificate.", e);

            throw new UaException(StatusCodes.Bad_CertificateInvalid);
        }
    }

    @Override
    public void onActivateSession(ServiceRequest<ActivateSessionRequest, ActivateSessionResponse> serviceRequest) throws UaException {
        ActivateSessionRequest request = serviceRequest.getRequest();

        ServerSecureChannel secureChannel = serviceRequest.getSecureChannel();
        long secureChannelId = secureChannel.getChannelId();
        NodeId authToken = request.getRequestHeader().getAuthenticationToken();
        SignedSoftwareCertificate[] clientSoftwareCertificates = request.getClientSoftwareCertificates();

        Session session = createdSessions.get(authToken);

        if (session == null) {
            session = activeSessions.get(authToken);

            if (session == null) {
                throw new UaException(StatusCodes.Bad_SessionIdInvalid);
            } else {
                if (session.getSecureChannelId() == secureChannelId) {
                    /*
                     * Identity change
                     */
                    Object tokenObject = request.getUserIdentityToken().getObject();
                    Object identityObject = validateIdentityToken(secureChannel, session, tokenObject);
                    session.setIdentityObject(identityObject);

                    StatusCode[] results = new StatusCode[clientSoftwareCertificates.length];
                    Arrays.fill(results, StatusCode.GOOD);

                    ByteString serverNonce = NonceUtil.generateNonce(32);

                    session.setLastNonce(serverNonce);

                    ActivateSessionResponse response = new ActivateSessionResponse(
                            serviceRequest.createResponseHeader(),
                            serverNonce,
                            results,
                            new DiagnosticInfo[0]
                    );

                    serviceRequest.setResponse(response);
                } else {
                    /*
                     * Associate session with new secure channel if client certificate and identity token match.
                     */
                    ByteString certificateBytes = secureChannel.getRemoteCertificateBytes();

                    if (request.getUserIdentityToken() == null || request.getUserIdentityToken().getObject() == null) {
                        throw new UaException(StatusCodes.Bad_IdentityTokenInvalid, "identity token not provided");
                    }

                    Object tokenObject = request.getUserIdentityToken().getObject();
                    Object identityObject = validateIdentityToken(secureChannel, session, tokenObject);

                    if (identityObject.equals(session.getIdentityObject()) &&
                            certificateBytes.equals(session.getClientCertificateBytes())) {

                        session.setSecureChannelId(secureChannelId);

                        logger.debug("Session id={} is now associated with secureChannelId={}",
                                session.getSessionId(), secureChannelId);

                        StatusCode[] results = new StatusCode[clientSoftwareCertificates.length];
                        Arrays.fill(results, StatusCode.GOOD);

                        ByteString serverNonce = NonceUtil.generateNonce(32);

                        session.setLastNonce(serverNonce);

                        ActivateSessionResponse response = new ActivateSessionResponse(
                                serviceRequest.createResponseHeader(),
                                serverNonce,
                                results,
                                new DiagnosticInfo[0]
                        );

                        serviceRequest.setResponse(response);
                    } else {
                        throw new UaException(StatusCodes.Bad_SecurityChecksFailed);
                    }
                }
            }
        } else {
            if (secureChannelId != session.getSecureChannelId()) {
                throw new UaException(StatusCodes.Bad_SecurityChecksFailed);
            }

            if (request.getUserIdentityToken() == null || request.getUserIdentityToken().getObject() == null) {
                throw new UaException(StatusCodes.Bad_IdentityTokenInvalid, "identity token not provided");
            }

            Object tokenObject = request.getUserIdentityToken().getObject();
            Object identityObject = validateIdentityToken(secureChannel, session, tokenObject);
            session.setIdentityObject(identityObject);

            createdSessions.remove(authToken);
            activeSessions.put(authToken, session);

            session.setClientCertificateBytes(secureChannel.getRemoteCertificateBytes());

            StatusCode[] results = new StatusCode[clientSoftwareCertificates.length];
            Arrays.fill(results, StatusCode.GOOD);

            ByteString serverNonce = NonceUtil.generateNonce(32);

            session.setLastNonce(serverNonce);

            ActivateSessionResponse response = new ActivateSessionResponse(
                    serviceRequest.createResponseHeader(),
                    serverNonce,
                    results,
                    new DiagnosticInfo[0]
            );

            serviceRequest.setResponse(response);
        }
    }

    private Object validateIdentityToken(ServerSecureChannel secureChannel, Session session, Object tokenObject) throws UaException {
        IdentityValidator identityValidator = server.getConfig().getIdentityValidator();
        UserTokenPolicy tokenPolicy = validatePolicyId(tokenObject);

        if (tokenObject instanceof AnonymousIdentityToken) {
            AnonymousIdentityToken token = (AnonymousIdentityToken) tokenObject;

            return identityValidator.validateAnonymousToken(token, tokenPolicy, secureChannel, session);
        } else if (tokenObject instanceof UserNameIdentityToken) {
            UserNameIdentityToken token = (UserNameIdentityToken) tokenObject;

            return identityValidator.validateUsernameToken(token, tokenPolicy, secureChannel, session);
        } else if (tokenObject instanceof X509IdentityToken) {
            X509IdentityToken token = (X509IdentityToken) tokenObject;

            return identityValidator.validateX509Token(token, tokenPolicy, secureChannel, session);
        } else if (tokenObject instanceof IssuedIdentityToken) {
            IssuedIdentityToken token = (IssuedIdentityToken) tokenObject;

            return identityValidator.validateIssuedIdentityToken(token, tokenPolicy, secureChannel, session);
        } else {
            throw new UaException(StatusCodes.Bad_IdentityTokenInvalid);
        }
    }

    private UserTokenPolicy validatePolicyId(Object tokenObject) throws UaException {
        if (tokenObject instanceof UserIdentityToken) {
            UserIdentityToken token = (UserIdentityToken) tokenObject;
            String policyId = token.getPolicyId();

            for (UserTokenPolicy policy : server.getUserTokenPolicies()) {
                if (policyId.equals(policy.getPolicyId())) {
                    return policy;
                }
            }

            throw new UaException(StatusCodes.Bad_IdentityTokenInvalid, "policy not found: " + policyId);
        } else {
            throw new UaException(StatusCodes.Bad_IdentityTokenInvalid);
        }
    }

    @Override
    public void onCloseSession(ServiceRequest<CloseSessionRequest, CloseSessionResponse> service) throws UaException {
        session(service).onCloseSession(service);

        activeSessions.remove(service.getRequest().getRequestHeader().getAuthenticationToken());
    }

    @Override
    public void onCancel(ServiceRequest<CancelRequest, CancelResponse> service) throws UaException {
        session(service).onCancel(service);
    }

    private SignatureData getServerSignature(ByteString clientNonce,
                                             ByteString clientCertificate,
                                             SecurityPolicy securityPolicy,
                                             KeyPair keyPair) throws UaException {

        if (clientNonce.isNull() || clientCertificate.isNull() || keyPair == null) {
            return new SignatureData(null, null);
        }

        try {
            SecurityAlgorithm algorithm = securityPolicy.getAsymmetricSignatureAlgorithm();

            byte[] data = Bytes.concat(clientCertificate.bytes(), clientNonce.bytes());

            byte[] signature = SignatureUtil.sign(
                    algorithm,
                    keyPair.getPrivate(),
                    ByteBuffer.wrap(data)
            );

            return new SignatureData(algorithm.getUri(), ByteString.of(signature));
        } catch (UaRuntimeException e) {
            throw new UaException(StatusCodes.Bad_SecurityChecksFailed);
        }
    }
    //endregion

    //region Attribute Services
    @Override
    public void onRead(ServiceRequest<ReadRequest, ReadResponse> service) throws UaException {
        Session session = session(service);

        session.getAttributeServices().onRead(service);
    }

    @Override
    public void onWrite(ServiceRequest<WriteRequest, WriteResponse> service) throws UaException {
        Session session = session(service);

        session.getAttributeServices().onWrite(service);
    }

    @Override
    public void onHistoryRead(ServiceRequest<HistoryReadRequest, HistoryReadResponse> service) throws UaException {
        Session session = session(service);

        session.getAttributeServices().onHistoryRead(service);
    }

    @Override
    public void onHistoryUpdate(ServiceRequest<HistoryUpdateRequest, HistoryUpdateResponse> service) throws UaException {
        Session session = session(service);

        session.getAttributeServices().onHistoryUpdate(service);
    }
    //endregion

    //region View Services
    @Override
    public void onBrowse(ServiceRequest<BrowseRequest, BrowseResponse> service) throws UaException {
        Session session = session(service);

        session.getViewServices().onBrowse(service);
    }

    @Override
    public void onBrowseNext(ServiceRequest<BrowseNextRequest, BrowseNextResponse> service) throws UaException {
        Session session = session(service);

        session.getViewServices().onBrowseNext(service);
    }

    @Override
    public void onTranslateBrowsePaths(ServiceRequest<TranslateBrowsePathsToNodeIdsRequest, TranslateBrowsePathsToNodeIdsResponse> service) throws UaException {
        Session session = session(service);

        session.getViewServices().onTranslateBrowsePaths(service);
    }

    @Override
    public void onRegisterNodes(ServiceRequest<RegisterNodesRequest, RegisterNodesResponse> service) throws UaException {
        Session session = session(service);

        session.getViewServices().onRegisterNodes(service);
    }

    @Override
    public void onUnregisterNodes(ServiceRequest<UnregisterNodesRequest, UnregisterNodesResponse> service) throws UaException {
        Session session = session(service);

        session.getViewServices().onUnregisterNodes(service);
    }
    //endregion

    //region NodeManagement Services
    @Override
    public void onAddNodes(ServiceRequest<AddNodesRequest, AddNodesResponse> service) throws UaException {
        Session session = session(service);

        session.getNodeManagementServices().onAddNodes(service);
    }

    @Override
    public void onAddReferences(ServiceRequest<AddReferencesRequest, AddReferencesResponse> service) throws UaException {
        Session session = session(service);

        session.getNodeManagementServices().onAddReferences(service);
    }

    @Override
    public void onDeleteNodes(ServiceRequest<DeleteNodesRequest, DeleteNodesResponse> service) throws UaException {
        Session session = session(service);

        session.getNodeManagementServices().onDeleteNodes(service);
    }

    @Override
    public void onDeleteReferences(ServiceRequest<DeleteReferencesRequest, DeleteReferencesResponse> service) throws UaException {
        Session session = session(service);

        session.getNodeManagementServices().onDeleteReferences(service);
    }
    //endregion

    //region Subscription Services
    @Override
    public void onCreateSubscription(ServiceRequest<CreateSubscriptionRequest, CreateSubscriptionResponse> service) throws UaException {
        Session session = session(service);

        session.getSubscriptionServices().onCreateSubscription(service);
    }

    @Override
    public void onModifySubscription(ServiceRequest<ModifySubscriptionRequest, ModifySubscriptionResponse> service) throws UaException {
        Session session = session(service);

        session.getSubscriptionServices().onModifySubscription(service);
    }

    @Override
    public void onSetPublishingMode(ServiceRequest<SetPublishingModeRequest, SetPublishingModeResponse> service) throws UaException {
        Session session = session(service);

        session.getSubscriptionServices().onSetPublishingMode(service);
    }

    @Override
    public void onPublish(ServiceRequest<PublishRequest, PublishResponse> service) throws UaException {
        Session session = session(service);

        session.getSubscriptionServices().onPublish(service);
    }

    @Override
    public void onRepublish(ServiceRequest<RepublishRequest, RepublishResponse> service) throws UaException {
        Session session = session(service);

        session.getSubscriptionServices().onRepublish(service);
    }

    @Override
    public void onTransferSubscriptions(ServiceRequest<TransferSubscriptionsRequest, TransferSubscriptionsResponse> service) throws UaException {
        Session session = session(service);

        session.getSubscriptionServices().onTransferSubscriptions(service);
    }

    @Override
    public void onDeleteSubscriptions(ServiceRequest<DeleteSubscriptionsRequest, DeleteSubscriptionsResponse> service) throws UaException {
        Session session = session(service);

        session.getSubscriptionServices().onDeleteSubscriptions(service);
    }
    //endregion

    //region MonitoredItem Services
    @Override
    public void onCreateMonitoredItems(ServiceRequest<CreateMonitoredItemsRequest, CreateMonitoredItemsResponse> service) throws UaException {
        Session session = session(service);

        session.getMonitoredItemServices().onCreateMonitoredItems(service);
    }

    @Override
    public void onModifyMonitoredItems(ServiceRequest<ModifyMonitoredItemsRequest, ModifyMonitoredItemsResponse> service) throws UaException {
        Session session = session(service);

        session.getMonitoredItemServices().onModifyMonitoredItems(service);
    }

    @Override
    public void onSetMonitoringMode(ServiceRequest<SetMonitoringModeRequest, SetMonitoringModeResponse> service) throws UaException {
        Session session = session(service);

        session.getMonitoredItemServices().onSetMonitoringMode(service);
    }

    @Override
    public void onSetTriggering(ServiceRequest<SetTriggeringRequest, SetTriggeringResponse> service) throws UaException {
        Session session = session(service);

        session.getMonitoredItemServices().onSetTriggering(service);
    }

    @Override
    public void onDeleteMonitoredItems(ServiceRequest<DeleteMonitoredItemsRequest, DeleteMonitoredItemsResponse> service) throws UaException {
        Session session = session(service);

        session.getMonitoredItemServices().onDeleteMonitoredItems(service);
    }
    //endregion

    //region Method Services
    @Override
    public void onCall(ServiceRequest<CallRequest, CallResponse> service) throws UaException {
        Session session = session(service);

        session.getMethodServices().onCall(service);
    }
    //endregion

    //region Query Services
    @Override
    public void onQueryFirst(ServiceRequest<QueryFirstRequest, QueryFirstResponse> service) throws UaException {
        Session session = session(service);

        session.getQueryServices().onQueryFirst(service);
    }

    @Override
    public void onQueryNext(ServiceRequest<QueryNextRequest, QueryNextResponse> service) throws UaException {
        Session session = session(service);

        session.getQueryServices().onQueryNext(service);
    }
    //endregion

}
