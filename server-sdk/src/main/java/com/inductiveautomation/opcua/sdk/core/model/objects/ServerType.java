package com.inductiveautomation.opcua.sdk.core.model.objects;

import com.inductiveautomation.opcua.sdk.core.model.variables.ServerStatusType;
import com.inductiveautomation.opcua.stack.core.types.builtin.unsigned.UByte;

public interface ServerType extends BaseObjectType {

    String[] getServerArray();

    String[] getNamespaceArray();

    UByte getServiceLevel();

    Boolean getAuditing();

    ServerStatusType getServerStatus();

    ServerCapabilitiesType getServerCapabilities();

    ServerDiagnosticsType getServerDiagnostics();

    VendorServerInfoType getVendorServerInfo();

    ServerRedundancyType getServerRedundancy();

    NamespacesType getNamespaces();

    void setServerArray(String[] serverArray);

    void setNamespaceArray(String[] namespaceArray);

    void setServiceLevel(UByte serviceLevel);

    void setAuditing(Boolean auditing);

    void atomicSet(Runnable runnable);

}
