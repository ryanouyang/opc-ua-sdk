package com.inductiveautomation.opcua.sdk.server.namespaces.loader;

import java.util.Optional;

import com.inductiveautomation.opcua.sdk.core.Reference;
import com.inductiveautomation.opcua.sdk.server.api.UaNamespace;
import com.inductiveautomation.opcua.sdk.server.model.UaObjectNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.AddressSpaceFileNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.AggregateConfigurationNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.AggregateFunctionNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.BaseObjectNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.DataTypeEncodingNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.DataTypeSystemNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.ExclusiveLimitStateMachineNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.FolderNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.HistoricalDataConfigurationNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.HistoryServerCapabilitiesNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.LockNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.ModellingRuleNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.NamespaceMetadataNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.NamespacesNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.OperationLimitsNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.ServerCapabilitiesNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.ServerDiagnosticsNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.ServerNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.ServerRedundancyNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.SessionDiagnosticsObjectNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.SessionsDiagnosticsSummaryNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.ShelvedStateMachineNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.StateNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.TransitionNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.TrustListNode;
import com.inductiveautomation.opcua.sdk.server.model.objects.VendorServerInfoNode;
import com.inductiveautomation.opcua.stack.core.types.builtin.ExpandedNodeId;
import com.inductiveautomation.opcua.stack.core.types.builtin.LocalizedText;
import com.inductiveautomation.opcua.stack.core.types.builtin.NodeId;
import com.inductiveautomation.opcua.stack.core.types.builtin.QualifiedName;
import com.inductiveautomation.opcua.stack.core.types.builtin.unsigned.UByte;
import com.inductiveautomation.opcua.stack.core.types.builtin.unsigned.UInteger;
import com.inductiveautomation.opcua.stack.core.types.enumerated.NodeClass;

public class UaObjectLoader {

    private final UaNamespace namespace;

    public UaObjectLoader(UaNamespace namespace) {
        this.namespace = namespace;
    }

    private void buildNode0() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=8251"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=8251"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=7594"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=8251"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7656"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=8251"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode1() {
        UaObjectNode node = new ModellingRuleNode(this.namespace, NodeId.parse("i=78"), new QualifiedName(0, "Mandatory"), new LocalizedText("en", "Mandatory"), Optional.of(new LocalizedText("en", "Specifies that an instance with the attributes and references of the instance declaration must appear when a type is instantiated.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12169"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=111"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=112"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=77"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=112"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2005"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2006"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2007"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3074"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3075"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3076"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3077"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3078"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3079"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3080"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3081"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3082"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3083"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3084"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3085"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2008"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2742"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2009"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3086"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3087"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3088"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3089"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3090"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3091"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3092"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3093"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3094"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2010"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3095"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3096"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3097"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3098"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3099"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3100"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3101"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3102"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3104"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3105"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3106"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3107"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3108"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3110"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3111"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3112"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3113"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3114"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2011"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2012"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3115"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11490"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11491"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2014"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2016"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2017"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2732"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2733"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2734"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3049"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2019"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2754"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2021"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3116"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3117"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3118"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3119"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3120"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3121"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3122"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3124"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3125"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3126"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3127"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3128"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2023"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2744"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3129"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3130"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2025"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2027"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2028"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12098"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12099"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12100"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12101"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12102"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12103"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12104"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12105"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12106"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12107"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12108"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12109"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12110"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12111"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12112"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12113"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12114"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12115"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12116"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12117"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12118"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12119"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12120"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12121"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12122"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12123"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12124"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12125"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12126"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12127"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12128"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12129"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12130"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12131"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12132"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12133"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12134"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12135"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12136"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12137"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12138"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12139"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12140"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12141"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12142"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12143"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12144"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12145"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12146"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12147"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12148"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12149"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12150"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12151"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12152"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2030"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3131"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3132"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3133"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3134"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3135"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3136"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3137"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3138"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3139"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3140"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3141"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3142"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3143"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8898"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11891"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3151"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3152"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3153"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3154"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3155"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3156"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3157"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3158"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3159"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3160"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3161"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3162"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3163"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3164"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3165"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3166"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3167"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3168"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3169"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3170"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3171"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3172"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3173"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3174"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3175"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3176"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3177"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3178"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2031"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3179"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3180"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3181"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3182"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3183"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3184"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3185"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3186"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3187"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2032"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2035"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2037"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2038"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2040"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11948"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11576"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11577"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11578"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11579"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11580"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11581"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11582"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11583"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11584"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11585"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11586"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11587"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11588"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11589"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11590"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11591"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11592"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11593"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11594"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11617"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11618"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11619"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11620"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11621"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11622"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11623"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11625"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11626"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11627"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11628"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11629"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11630"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11631"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11632"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11633"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11634"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11635"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11636"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11637"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11638"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11639"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11640"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11641"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11642"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11643"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11647"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11648"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11649"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11650"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11651"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11652"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11653"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11676"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11677"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11678"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11679"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11680"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11681"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11682"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11683"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11684"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11685"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11686"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11687"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11688"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11689"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11690"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11691"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11692"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11693"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11694"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2042"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2043"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2044"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2045"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2046"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2047"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3190"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2050"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2051"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2053"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2054"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2055"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2056"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2057"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2745"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2061"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2746"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2062"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2063"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2065"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2066"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2070"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2072"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2073"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2747"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2074"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2749"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2076"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2077"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11485"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2079"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2081"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2083"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2084"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2092"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2094"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2096"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2098"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2750"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2101"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2102"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2103"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2751"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2128"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2129"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11696"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2134"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2739"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12502"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12503"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2139"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2140"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2141"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2142"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3698"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3699"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3700"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3701"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3702"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3703"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2752"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2753"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3052"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3053"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3054"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3055"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3056"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3057"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2151"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2152"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2153"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2154"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2155"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2156"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2157"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2159"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2160"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2161"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2162"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2163"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2166"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11697"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11698"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11699"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2173"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2174"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2175"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2176"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2177"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8888"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2179"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2180"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2181"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2182"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2183"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2184"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2185"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2186"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2187"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2188"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2189"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2190"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2191"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2998"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2193"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8889"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8890"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8891"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8892"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8893"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8894"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8895"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8896"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8897"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8902"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2198"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2199"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2200"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2201"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2202"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2203"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2204"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3050"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2205"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2206"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2207"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2208"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2209"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8900"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11892"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2217"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2218"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2219"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2220"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2221"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2222"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2223"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2224"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2225"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2226"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2227"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2228"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2229"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2230"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2231"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2232"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2233"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2234"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2235"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2236"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2237"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2238"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2239"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2240"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2241"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2242"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2730"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2731"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2245"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2246"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2247"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2248"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2249"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2250"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2251"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2252"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3058"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11488"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2769"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3720"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3724"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2756"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2763"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2772"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3728"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3732"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2761"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2768"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2308"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2312"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2774"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3754"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2775"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3746"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2776"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3750"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2777"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2778"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11940"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2369"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2374"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2375"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2377"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11241"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11461"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12025"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12026"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12027"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12028"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12037"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12046"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12055"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12056"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12065"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12066"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12067"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12076"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8996"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9003"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11112"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11113"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9009"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9010"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3874"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9011"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9012"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9020"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9021"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9022"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9023"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9024"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9025"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9026"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9028"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9027"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9029"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9030"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3876"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9035"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9036"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9055"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9056"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2831"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9064"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9065"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9066"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9067"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9068"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9069"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9070"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9073"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9074"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9093"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9094"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9103"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9111"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9112"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9114"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9118"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9119"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9160"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9161"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11120"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9170"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9179"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9180"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9185"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9189"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9211"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9212"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9213"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9214"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9215"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9115"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=6098"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=6100"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=6101"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11322"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11323"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11324"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11325"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11326"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11327"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2947"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2948"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2949"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2991"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9330"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9332"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9334"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9336"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11340"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11341"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11342"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11343"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9398"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9399"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9455"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9456"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9457"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9462"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9963"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9964"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10021"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10030"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10039"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10048"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10522"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9905"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11158"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=4170"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11851"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11852"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8945"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11853"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8962"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11854"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11855"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3830"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3831"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3833"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3835"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3836"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3838"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3839"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2393"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2395"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3840"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3841"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3842"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3843"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3844"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3845"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3846"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3847"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3848"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3849"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2401"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2403"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2405"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2407"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2409"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2411"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2413"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2415"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2417"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2419"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2421"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2423"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2425"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2426"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2427"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2428"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2429"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2430"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2379"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11875"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3825"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3826"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2381"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2382"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2383"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2384"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2385"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2386"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2387"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2388"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2389"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2390"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3059"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11168"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11169"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11170"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11171"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2323"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2331"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2332"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11268"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11269"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2334"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2335"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2336"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2337"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2338"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11278"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11279"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11280"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11501"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11270"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11172"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3025"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3028"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3003"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3029"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3030"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3026"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3031"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3032"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3033"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3027"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3015"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3016"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3017"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3034"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3020"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3021"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3023"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3024"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12232"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12233"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12234"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12235"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12236"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12237"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12238"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12239"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12240"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12241"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12242"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12243"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12278"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12303"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12304"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12306"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12308"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12310"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12357"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12358"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12359"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12360"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12361"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12362"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12363"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12364"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12365"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12366"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12367"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12368"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12369"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12370"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12371"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12389"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12407"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12412"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12413"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12414"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12415"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12416"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12417"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12418"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12419"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12420"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12421"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12422"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12423"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12424"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12425"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12426"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12427"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12428"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12429"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12430"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12431"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12432"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12433"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12434"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12435"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12436"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12437"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12438"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12446"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12447"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12448"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12449"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12450"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12451"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12452"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12453"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12454"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12455"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12456"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12457"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12458"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12459"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12460"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12461"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12462"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12463"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12464"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12465"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12466"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12473"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12474"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12475"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12476"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11188"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11189"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11190"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11191"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8922"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=8923"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=7591"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11878"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=7597"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=7595"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=7596"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=7598"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11881"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11882"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=7599"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=7605"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11884"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11885"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11886"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=7611"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=7612"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12078"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=78"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=7614"), NodeClass.Variable, false));
        this.namespace.addNode(node);
    }

    private void buildNode2() {
        UaObjectNode node = new ModellingRuleNode(this.namespace, NodeId.parse("i=79"), new QualifiedName(0, "MandatoryShared"), new LocalizedText("en", "MandatoryShared"), Optional.of(new LocalizedText("en", "Specifies that a reference to a shared instance must appear in when a type is instantiated.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=79"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=116"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=79"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=77"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=79"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=116"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=79"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2394"), NodeClass.Variable, false));
        this.namespace.addNode(node);
    }

    private void buildNode3() {
        UaObjectNode node = new ModellingRuleNode(this.namespace, NodeId.parse("i=80"), new QualifiedName(0, "Optional"), new LocalizedText("en", "Optional"), Optional.of(new LocalizedText("en", "Specifies that an instance with the attributes and references of the instance declaration may appear when a type is instantiated.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=104"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=105"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=106"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=107"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=113"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=77"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=113"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11527"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11489"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11549"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11550"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11551"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2022"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11565"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12161"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12162"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11567"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12163"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12164"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11569"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11570"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11571"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11572"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11573"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11574"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11615"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11624"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11675"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11701"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2770"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2757"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2758"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2759"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2764"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2765"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2766"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11456"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2773"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2366"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2367"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2370"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2371"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12024"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9000"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9001"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11110"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11111"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9015"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9016"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9017"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9060"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9098"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9102"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9107"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9113"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9164"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9165"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9166"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9169"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9174"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9178"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9184"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9188"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9216"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11124"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11125"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11126"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11127"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9461"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=9465"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10020"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10025"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10029"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10034"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10038"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10043"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10047"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=10052"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2399"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=3850"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11876"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2324"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2325"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2326"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2327"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=2328"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11499"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11500"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12305"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12307"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12309"), NodeClass.Method, false));
        node.addReference(new Reference(NodeId.parse("i=80"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12445"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode4() {
        UaObjectNode node = new ModellingRuleNode(this.namespace, NodeId.parse("i=83"), new QualifiedName(0, "ExposesItsArray"), new LocalizedText("en", "ExposesItsArray"), Optional.of(new LocalizedText("en", "Specifies that an instance appears for each element of the containing array variable.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=83"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=114"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=83"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=77"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=83"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=114"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode5() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=84"), new QualifiedName(0, "Root"), new LocalizedText("en", "Root"), Optional.of(new LocalizedText("en", "The root of the server address space.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=84"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=84"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=85"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=84"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=86"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=84"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=87"), NodeClass.Object, true));
        this.namespace.addNode(node);
    }

    private void buildNode6() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=85"), new QualifiedName(0, "Objects"), new LocalizedText("en", "Objects"), Optional.of(new LocalizedText("en", "The browse entry point when looking for objects in the server address space.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=85"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=84"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=85"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=85"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, true));
        this.namespace.addNode(node);
    }

    private void buildNode7() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=86"), new QualifiedName(0, "Types"), new LocalizedText("en", "Types"), Optional.of(new LocalizedText("en", "The browse entry point when looking for types in the server address space.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=86"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=84"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=86"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=86"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=88"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=86"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=89"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=86"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=90"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=86"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=91"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=86"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=3048"), NodeClass.Object, true));
        this.namespace.addNode(node);
    }

    private void buildNode8() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=87"), new QualifiedName(0, "Views"), new LocalizedText("en", "Views"), Optional.of(new LocalizedText("en", "The browse entry point when looking for views in the server address space.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=87"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=84"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=87"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode9() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=88"), new QualifiedName(0, "ObjectTypes"), new LocalizedText("en", "ObjectTypes"), Optional.of(new LocalizedText("en", "The browse entry point when looking for object types in the server address space.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=88"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=86"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=88"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=58"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=88"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode10() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=89"), new QualifiedName(0, "VariableTypes"), new LocalizedText("en", "VariableTypes"), Optional.of(new LocalizedText("en", "The browse entry point when looking for variable types in the server address space.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=89"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=86"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=89"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=62"), NodeClass.VariableType, true));
        node.addReference(new Reference(NodeId.parse("i=89"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode11() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=90"), new QualifiedName(0, "DataTypes"), new LocalizedText("en", "DataTypes"), Optional.of(new LocalizedText("en", "The browse entry point when looking for data types in the server address space.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=90"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=86"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=90"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=24"), NodeClass.DataType, true));
        node.addReference(new Reference(NodeId.parse("i=90"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=90"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=92"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=90"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=93"), NodeClass.Object, true));
        this.namespace.addNode(node);
    }

    private void buildNode12() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=91"), new QualifiedName(0, "ReferenceTypes"), new LocalizedText("en", "ReferenceTypes"), Optional.of(new LocalizedText("en", "The browse entry point when looking for reference types in the server address space.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=91"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=86"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=91"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=31"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=91"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode13() {
        UaObjectNode node = new DataTypeSystemNode(this.namespace, NodeId.parse("i=92"), new QualifiedName(0, "XML Schema"), new LocalizedText("en", "XML Schema"), Optional.of(new LocalizedText("en", "A type system which uses XML schema to describe the encoding of data types.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=92"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=90"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=92"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=75"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=92"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=8252"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode14() {
        UaObjectNode node = new DataTypeSystemNode(this.namespace, NodeId.parse("i=93"), new QualifiedName(0, "OPC Binary"), new LocalizedText("en", "OPC Binary"), Optional.of(new LocalizedText("en", "A type system which uses OPC binary schema to describe the encoding of data types.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=93"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=90"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=93"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=75"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=93"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=7617"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode15() {
        UaObjectNode node = new TrustListNode(this.namespace, NodeId.parse("i=12417"), new QualifiedName(0, "TrustList"), new LocalizedText("en", "TrustList"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12411"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12418"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12419"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12420"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12421"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12422"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12425"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12427"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12430"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12432"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12435"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12437"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12438"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=12283"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12411"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12418"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12419"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12420"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12421"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12422"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12425"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12427"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12430"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12432"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12435"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12437"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12417"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12438"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode16() {
        UaObjectNode node = new TrustListNode(this.namespace, NodeId.parse("i=12445"), new QualifiedName(0, "HttpsTrustList"), new LocalizedText("en", "HttpsTrustList"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12411"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12446"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12447"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12448"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12449"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12450"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12453"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12455"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12458"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12460"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12463"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12465"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12466"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=12283"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=80"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12411"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12446"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12447"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12448"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12449"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12450"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12453"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12455"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12458"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12460"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12463"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12465"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12445"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12466"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode17() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12494"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12494"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12328"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12494"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12495"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12494"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode18() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12498"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12498"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12328"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12498"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12499"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12498"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode19() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=297"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=297"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=296"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=297"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8285"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=297"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode20() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=298"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=298"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=296"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=298"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7650"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=298"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode21() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=300"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=300"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=299"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=300"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8294"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=300"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode22() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=301"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=301"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=299"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=301"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7659"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=301"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode23() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=305"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=305"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=304"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=305"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8297"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=305"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode24() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=306"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=306"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=304"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=306"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7662"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=306"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode25() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=309"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=309"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=308"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=309"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8300"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=309"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode26() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=310"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=310"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=308"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=310"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7665"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=310"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode27() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=313"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=313"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=312"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=313"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8303"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=313"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode28() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=314"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=314"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=312"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=314"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7668"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=314"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode29() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=317"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=317"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=316"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=317"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8306"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=317"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode30() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=318"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=318"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=316"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=318"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7671"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=318"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode31() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=320"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=320"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=319"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=320"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8309"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=320"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode32() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=321"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=321"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=319"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=321"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7674"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=321"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode33() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=323"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=323"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=322"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=323"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8312"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=323"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode34() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=324"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=324"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=322"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=324"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7677"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=324"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode35() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=326"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=326"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=325"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=326"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8315"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=326"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode36() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=327"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=327"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=325"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=327"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7680"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=327"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode37() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=332"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=332"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=331"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=332"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8321"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=332"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode38() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=333"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=333"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=331"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=333"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7686"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=333"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode39() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=336"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=336"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=335"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=336"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8324"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=336"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode40() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=337"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=337"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=335"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=337"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7689"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=337"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode41() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=339"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=339"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=338"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=339"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8327"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=339"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode42() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=340"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=340"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=338"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=340"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7692"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=340"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode43() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=342"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=342"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=341"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=342"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8330"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=342"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode44() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=343"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=343"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=341"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=343"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7695"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=343"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode45() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=345"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=345"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=344"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=345"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8333"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=345"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode46() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=346"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=346"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=344"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=346"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7698"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=346"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode47() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=377"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=377"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=376"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=377"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8363"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=377"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode48() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=378"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=378"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=376"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=378"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7728"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=378"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode49() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=380"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=380"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=379"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=380"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8366"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=380"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode50() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=381"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=381"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=379"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=381"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7731"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=381"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode51() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=383"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=383"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=382"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=383"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8369"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=383"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode52() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=384"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=384"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=382"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=384"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7734"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=384"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode53() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=386"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=386"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=385"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=386"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8372"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=386"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode54() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=387"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=387"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=385"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=387"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7737"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=387"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode55() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=400"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=400"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=399"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=400"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8384"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=400"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode56() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=401"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=401"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=399"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=401"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7749"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=401"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode57() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=403"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=403"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=402"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=403"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8387"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=403"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode58() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=404"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=404"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=402"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=404"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7752"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=404"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode59() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=406"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=406"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=405"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=406"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8390"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=406"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode60() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=407"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=407"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=405"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=407"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7755"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=407"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode61() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=433"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=433"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=432"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=433"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8417"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=433"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode62() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=434"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=434"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=432"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=434"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7782"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=434"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode63() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=584"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=584"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=583"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=584"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8564"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=584"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode64() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=585"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=585"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=583"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=585"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7929"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=585"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode65() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=587"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=587"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=586"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=587"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8567"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=587"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode66() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=588"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=588"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=586"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=588"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7932"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=588"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode67() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=590"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=590"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=589"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=590"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8570"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=590"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode68() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=591"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=591"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=589"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=591"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7935"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=591"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode69() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=593"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=593"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=592"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=593"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8573"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=593"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode70() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=594"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=594"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=592"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=594"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7938"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=594"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode71() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=596"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=596"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=595"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=596"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8576"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=596"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode72() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=597"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=597"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=595"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=597"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7941"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=597"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode73() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=599"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=599"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=598"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=599"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8579"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=599"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode74() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=600"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=600"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=598"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=600"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7944"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=600"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode75() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=602"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=602"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=601"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=602"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8582"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=602"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode76() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=603"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=603"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=601"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=603"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7947"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=603"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode77() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=660"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=660"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=659"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=660"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8639"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=660"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode78() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=661"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=661"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=659"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=661"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8004"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=661"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode79() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=720"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=720"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=719"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=720"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8702"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=720"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode80() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=8913"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=8913"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=8912"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=8913"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8918"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=8913"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode81() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=721"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=721"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=719"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=721"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8067"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=721"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode82() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=8917"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=8917"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=8912"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=8917"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8914"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=8917"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode83() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=726"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=726"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=725"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=726"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8708"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=726"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode84() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=727"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=727"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=725"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=727"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8073"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=727"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode85() {
        UaObjectNode node = new LockNode(this.namespace, NodeId.parse("i=8924"), new QualifiedName(0, "ServerLock"), new LocalizedText("en", "ServerLock"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=8924"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=8925"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=8924"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=8926"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=8924"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=8921"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=8924"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=8925"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=8924"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=8926"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode86() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=854"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=854"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=853"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=854"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8843"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=854"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode87() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=855"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=855"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=853"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=855"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8208"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=855"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode88() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=857"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=857"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=856"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=857"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8846"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=857"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode89() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=858"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=858"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=856"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=858"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8211"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=858"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode90() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=860"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=860"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=859"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=860"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8849"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=860"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode91() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=861"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=861"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=859"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=861"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8214"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=861"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode92() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=863"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=863"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=862"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=863"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8852"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=863"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode93() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=864"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=864"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=862"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=864"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8217"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=864"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode94() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=866"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=866"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=865"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=866"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8855"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=866"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode95() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=867"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=867"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=865"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=867"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8220"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=867"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode96() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=869"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=869"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=868"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=869"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8858"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=869"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode97() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=870"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=870"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=868"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=870"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8223"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=870"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode98() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=872"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=872"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=871"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=872"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8861"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=872"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode99() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=873"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=873"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=871"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=873"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8226"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=873"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode100() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=875"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=875"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=874"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=875"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8864"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=875"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode101() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=876"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=876"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=874"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=876"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8229"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=876"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode102() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=878"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=878"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=877"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=878"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8867"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=878"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode103() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=879"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=879"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=877"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=879"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8232"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=879"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode104() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=885"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=885"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=884"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=885"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8873"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=885"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode105() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=886"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=886"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=884"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=886"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8238"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=886"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode106() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=888"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=888"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=887"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=888"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8876"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=888"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode107() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=889"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=889"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=887"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=889"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8241"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=889"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode108() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=892"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=892"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=891"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=892"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8879"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=892"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode109() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=893"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=893"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=891"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=893"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8244"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=893"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode110() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=895"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=895"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=894"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=895"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8882"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=895"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode111() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=896"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=896"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=894"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=896"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8247"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=896"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode112() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=898"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=898"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=897"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=898"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8870"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=898"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode113() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=899"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=899"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=897"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=899"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8235"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=899"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode114() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=921"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=921"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=920"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=921"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8807"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=921"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode115() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=922"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=922"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=920"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=922"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8172"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=922"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode116() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=939"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=939"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=938"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=939"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8318"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=939"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode117() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=940"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=940"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=938"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=940"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=7683"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=940"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode118() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=949"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=949"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=948"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=949"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8711"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=949"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode119() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=950"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=950"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=948"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=950"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8076"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=950"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode120() {
        UaObjectNode node = new ShelvedStateMachineNode(this.namespace, NodeId.parse("i=9178"), new QualifiedName(0, "ShelvingState"), new LocalizedText("en", "ShelvingState"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2915"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=9004"), ExpandedNodeId.parse("svr=0;i=9118"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9179"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9184"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=9189"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9211"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9212"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9213"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=9004"), ExpandedNodeId.parse("svr=0;i=9118"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=80"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2915"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9179"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9184"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=9189"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9211"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9212"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=9178"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9213"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode121() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=9329"), new QualifiedName(0, "HighHigh"), new LocalizedText("en", "HighHigh"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=9329"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9329"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=9330"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9329"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9339"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9329"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9340"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9329"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=9329"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9329"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=9330"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9329"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9339"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9329"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9340"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode122() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=9331"), new QualifiedName(0, "High"), new LocalizedText("en", "High"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=9331"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9331"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=9332"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9331"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9339"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9331"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9340"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9331"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=9331"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9331"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=9332"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9331"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9339"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9331"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9340"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode123() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=9333"), new QualifiedName(0, "Low"), new LocalizedText("en", "Low"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=9333"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9333"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=9334"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9333"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9337"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9333"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9338"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9333"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=9333"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9333"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=9334"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9333"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9337"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9333"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9338"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode124() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=9335"), new QualifiedName(0, "LowLow"), new LocalizedText("en", "LowLow"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=9335"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9335"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=9336"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9335"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9337"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9335"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9338"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9335"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=9335"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9335"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=9336"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9335"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9337"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=9335"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9338"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode125() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=9337"), new QualifiedName(0, "LowLowToLow"), new LocalizedText("en", "LowLowToLow"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=9337"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9337"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9333"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9337"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9335"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9337"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11340"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9337"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9335"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9337"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9333"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9337"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=9337"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9337"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11340"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode126() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=9338"), new QualifiedName(0, "LowToLowLow"), new LocalizedText("en", "LowToLowLow"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=9338"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9338"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9333"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9338"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9335"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9338"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11341"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9338"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9333"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9338"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9335"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9338"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=9338"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9338"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11341"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode127() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=9339"), new QualifiedName(0, "HighHighToHigh"), new LocalizedText("en", "HighHighToHigh"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=9339"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9339"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9329"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9339"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9331"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9339"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11342"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9339"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9329"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9339"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9331"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9339"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=9339"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9339"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11342"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode128() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=9340"), new QualifiedName(0, "HighToHighHigh"), new LocalizedText("en", "HighToHighHigh"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=9340"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9340"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9329"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9340"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9331"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9340"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11343"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9340"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=9331"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9340"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=9329"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9340"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=9340"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9340"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11343"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode129() {
        UaObjectNode node = new ExclusiveLimitStateMachineNode(this.namespace, NodeId.parse("i=9455"), new QualifiedName(0, "LimitState"), new LocalizedText("en", "LimitState"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=9455"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9341"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9455"), NodeId.parse("i=9004"), ExpandedNodeId.parse("svr=0;i=9398"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=9455"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9456"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9455"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9461"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9455"), NodeId.parse("i=9004"), ExpandedNodeId.parse("svr=0;i=9398"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=9455"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=9318"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=9455"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=9455"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9341"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=9455"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9456"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=9455"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=9461"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode130() {
        UaObjectNode node = new ServerCapabilitiesNode(this.namespace, NodeId.parse("i=2009"), new QualifiedName(0, "ServerCapabilities"), new LocalizedText("en", "ServerCapabilities"), Optional.of(new LocalizedText("en", "Describes capabilities supported by the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3086"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3087"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3088"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3089"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3090"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3091"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3092"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3093"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3094"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2013"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3086"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3087"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3088"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3089"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3090"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3091"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3092"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3093"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2009"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3094"), NodeClass.Object, true));
        this.namespace.addNode(node);
    }

    private void buildNode131() {
        UaObjectNode node = new ServerDiagnosticsNode(this.namespace, NodeId.parse("i=2010"), new QualifiedName(0, "ServerDiagnostics"), new LocalizedText("en", "ServerDiagnostics"), Optional.of(new LocalizedText("en", "Reports diagnostics about the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3095"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3110"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3111"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3114"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2020"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3095"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3110"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3111"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2010"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3114"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode132() {
        UaObjectNode node = new VendorServerInfoNode(this.namespace, NodeId.parse("i=2011"), new QualifiedName(0, "VendorServerInfo"), new LocalizedText("en", "VendorServerInfo"), Optional.of(new LocalizedText("en", "Server information provided by the vendor.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2011"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2011"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2033"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2011"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2011"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, false));
        this.namespace.addNode(node);
    }

    private void buildNode133() {
        UaObjectNode node = new ServerRedundancyNode(this.namespace, NodeId.parse("i=2012"), new QualifiedName(0, "ServerRedundancy"), new LocalizedText("en", "ServerRedundancy"), Optional.of(new LocalizedText("en", "Describes the redundancy capabilities of the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2012"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2012"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3115"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2012"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2034"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2012"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2012"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2012"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3115"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode134() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=2019"), new QualifiedName(0, "ModellingRules"), new LocalizedText("en", "ModellingRules"), Optional.of(new LocalizedText("en", "A folder for the modelling rules supported by the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2019"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2013"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2019"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2019"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2019"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2013"), NodeClass.ObjectType, false));
        this.namespace.addNode(node);
    }

    private void buildNode135() {
        UaObjectNode node = new ServerNode(this.namespace, NodeId.parse("i=2253"), new QualifiedName(0, "Server"), new LocalizedText("en", "Server"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(1));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2254"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2255"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2256"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2267"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2994"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2268"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2274"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2295"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2296"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11715"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11492"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=85"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2254"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2255"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2256"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2267"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2994"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2268"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2274"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2295"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2296"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11715"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2253"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11492"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode136() {
        UaObjectNode node = new ServerCapabilitiesNode(this.namespace, NodeId.parse("i=2268"), new QualifiedName(0, "ServerCapabilities"), new LocalizedText("en", "ServerCapabilities"), Optional.of(new LocalizedText("en", "Describes capabilities supported by the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2269"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2271"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2272"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2735"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2736"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2737"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3704"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11702"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11703"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11704"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2996"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2997"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2013"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2269"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2271"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2272"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2735"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2736"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2737"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3704"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11702"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11703"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11704"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2996"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2997"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2268"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11192"), NodeClass.Object, true));
        this.namespace.addNode(node);
    }

    private void buildNode137() {
        UaObjectNode node = new ServerDiagnosticsNode(this.namespace, NodeId.parse("i=2274"), new QualifiedName(0, "ServerDiagnostics"), new LocalizedText("en", "ServerDiagnostics"), Optional.of(new LocalizedText("en", "Reports diagnostics about the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2275"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2289"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2290"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3706"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2294"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2020"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2275"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2289"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2290"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3706"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2274"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2294"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode138() {
        UaObjectNode node = new VendorServerInfoNode(this.namespace, NodeId.parse("i=2295"), new QualifiedName(0, "VendorServerInfo"), new LocalizedText("en", "VendorServerInfo"), Optional.of(new LocalizedText("en", "Server information provided by the vendor.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2295"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2295"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2033"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2295"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode139() {
        UaObjectNode node = new ServerRedundancyNode(this.namespace, NodeId.parse("i=2296"), new QualifiedName(0, "ServerRedundancy"), new LocalizedText("en", "ServerRedundancy"), Optional.of(new LocalizedText("en", "Describes the redundancy capabilities of the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3709"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11312"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11313"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11314"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2034"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=3709"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11312"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11313"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2296"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11314"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode140() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2341"), new QualifiedName(0, "Interpolative"), new LocalizedText("en", "Interpolative"), Optional.of(new LocalizedText("en", "At the beginning of each interval, retrieve the calculated value from the data points on either side of the requested timestamp.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2341"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode141() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2342"), new QualifiedName(0, "Average"), new LocalizedText("en", "Average"), Optional.of(new LocalizedText("en", "Retrieve the average value of the data over the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2342"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode142() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2343"), new QualifiedName(0, "TimeAverage"), new LocalizedText("en", "TimeAverage"), Optional.of(new LocalizedText("en", "Retrieve the time weighted average data over the interval using Interpolated Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2343"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode143() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2344"), new QualifiedName(0, "Total"), new LocalizedText("en", "Total"), Optional.of(new LocalizedText("en", "Retrieve the total (time integral) of the data over the interval using Interpolated Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2344"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode144() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2346"), new QualifiedName(0, "Minimum"), new LocalizedText("en", "Minimum"), Optional.of(new LocalizedText("en", "Retrieve the minimum raw value in the interval with the timestamp of the start of the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2346"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode145() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2347"), new QualifiedName(0, "Maximum"), new LocalizedText("en", "Maximum"), Optional.of(new LocalizedText("en", "Retrieve the maximum raw value in the interval with the timestamp of the start of the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2347"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode146() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2348"), new QualifiedName(0, "MinimumActualTime"), new LocalizedText("en", "MinimumActualTime"), Optional.of(new LocalizedText("en", "Retrieve the minimum value in the interval and the Timestamp of the minimum value.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2348"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode147() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2349"), new QualifiedName(0, "MaximumActualTime"), new LocalizedText("en", "MaximumActualTime"), Optional.of(new LocalizedText("en", "Retrieve the maximum value in the interval and the Timestamp of the maximum value.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2349"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode148() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2350"), new QualifiedName(0, "Range"), new LocalizedText("en", "Range"), Optional.of(new LocalizedText("en", "Retrieve the difference between the minimum and maximum Value over the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2350"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode149() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2351"), new QualifiedName(0, "AnnotationCount"), new LocalizedText("en", "AnnotationCount"), Optional.of(new LocalizedText("en", "Retrieve the number of Annotations in the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2351"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode150() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2352"), new QualifiedName(0, "Count"), new LocalizedText("en", "Count"), Optional.of(new LocalizedText("en", "Retrieve the number of raw values over the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2352"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode151() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2355"), new QualifiedName(0, "NumberOfTransitions"), new LocalizedText("en", "NumberOfTransitions"), Optional.of(new LocalizedText("en", "Retrieve the number of changes between zero and non-zero that a Boolean or Numeric value experienced in the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2355"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode152() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2357"), new QualifiedName(0, "Start"), new LocalizedText("en", "Start"), Optional.of(new LocalizedText("en", "Retrieve the value at the beginning of the interval using Interpolated Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2357"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode153() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2358"), new QualifiedName(0, "End"), new LocalizedText("en", "End"), Optional.of(new LocalizedText("en", "Retrieve the value at the end of the interval using Interpolated Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2358"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode154() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2359"), new QualifiedName(0, "Delta"), new LocalizedText("en", "Delta"), Optional.of(new LocalizedText("en", "Retrieve the difference between the Start and End value in the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2359"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode155() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2360"), new QualifiedName(0, "DurationGood"), new LocalizedText("en", "DurationGood"), Optional.of(new LocalizedText("en", "Retrieve the total duration of time in the interval during which the data is good.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2360"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode156() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2361"), new QualifiedName(0, "DurationBad"), new LocalizedText("en", "DurationBad"), Optional.of(new LocalizedText("en", "Retrieve the total duration of time in the interval during which the data is bad.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2361"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode157() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2362"), new QualifiedName(0, "PercentGood"), new LocalizedText("en", "PercentGood"), Optional.of(new LocalizedText("en", "Retrieve the percent of data (0 to 100) in the interval which has a good StatusCode.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2362"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode158() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2363"), new QualifiedName(0, "PercentBad"), new LocalizedText("en", "PercentBad"), Optional.of(new LocalizedText("en", "Retrieve the percent of data (0 to 100) in the interval which has a bad StatusCode.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2363"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode159() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=2364"), new QualifiedName(0, "WorstQuality"), new LocalizedText("en", "WorstQuality"), Optional.of(new LocalizedText("en", "Retrieve the worst StatusCode of data in the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2364"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode160() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=2400"), new QualifiedName(0, "Ready"), new LocalizedText("en", "Ready"), Optional.of(new LocalizedText("en", "The Program is properly initialized and may be started.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2401"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2408"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2410"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2414"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2422"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2424"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2401"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2408"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2410"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2414"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2422"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2400"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2424"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode161() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=2402"), new QualifiedName(0, "Running"), new LocalizedText("en", "Running"), Optional.of(new LocalizedText("en", "The Program is executing making progress towards completion.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2403"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2410"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2412"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2414"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2416"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2418"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2403"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2410"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2412"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2414"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2416"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2402"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2418"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode162() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=2404"), new QualifiedName(0, "Suspended"), new LocalizedText("en", "Suspended"), Optional.of(new LocalizedText("en", "The Program has been stopped prior to reaching a terminal state but may be resumed.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2405"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2416"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2418"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2420"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2422"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2405"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2416"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2418"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2420"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2404"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2422"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode163() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=2406"), new QualifiedName(0, "Halted"), new LocalizedText("en", "Halted"), Optional.of(new LocalizedText("en", "The Program is in a terminal or failed state, and it cannot be started or resumed without being reset.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2407"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2408"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2412"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2420"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2424"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2407"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2408"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2412"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2420"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2406"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2424"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode164() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2408"), new QualifiedName(0, "HaltedToReady"), new LocalizedText("en", "HaltedToReady"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2400"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2406"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2409"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2406"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2400"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2430"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2378"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2409"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2408"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2430"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode165() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2410"), new QualifiedName(0, "ReadyToRunning"), new LocalizedText("en", "ReadyToRunning"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2400"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2402"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2411"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2400"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2402"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2426"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2378"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2411"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2410"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2426"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode166() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2412"), new QualifiedName(0, "RunningToHalted"), new LocalizedText("en", "RunningToHalted"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2402"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2406"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2413"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2402"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2406"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2429"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2378"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2413"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2412"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2429"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode167() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2414"), new QualifiedName(0, "RunningToReady"), new LocalizedText("en", "RunningToReady"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2414"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2414"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2400"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2414"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2402"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2414"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2415"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2414"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2402"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2414"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2400"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2414"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2378"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2414"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2414"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2414"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2415"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode168() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2416"), new QualifiedName(0, "RunningToSuspended"), new LocalizedText("en", "RunningToSuspended"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2402"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2404"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2417"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2402"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2404"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2427"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2378"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2417"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2416"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2427"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode169() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2418"), new QualifiedName(0, "SuspendedToRunning"), new LocalizedText("en", "SuspendedToRunning"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2402"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2404"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2419"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2404"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2402"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2428"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2378"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2419"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2418"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2428"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode170() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2420"), new QualifiedName(0, "SuspendedToHalted"), new LocalizedText("en", "SuspendedToHalted"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2404"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2406"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2421"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2404"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2406"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2429"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2378"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2421"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2420"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2429"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode171() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2422"), new QualifiedName(0, "SuspendedToReady"), new LocalizedText("en", "SuspendedToReady"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2422"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2422"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2400"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2422"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2404"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2422"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2423"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2422"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2404"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2422"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2400"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2422"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2378"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2422"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2422"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2422"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2423"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode172() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2424"), new QualifiedName(0, "ReadyToHalted"), new LocalizedText("en", "ReadyToHalted"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2400"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2406"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2425"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2400"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2406"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2429"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2378"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=2425"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2424"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2429"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode173() {
        UaObjectNode node = new SessionsDiagnosticsSummaryNode(this.namespace, NodeId.parse("i=2744"), new QualifiedName(0, "SessionsDiagnosticsSummary"), new LocalizedText("en", "SessionsDiagnosticsSummary"), Optional.of(new LocalizedText("en", "A summary of session level diagnostics.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2744"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2020"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2744"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3129"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2744"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3130"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2744"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2026"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2744"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2744"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2020"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2744"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3129"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2744"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3130"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode174() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=2754"), new QualifiedName(0, "AggregateFunctions"), new LocalizedText("en", "AggregateFunctions"), Optional.of(new LocalizedText("en", "A folder for the real time aggregates supported by the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2754"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2013"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2754"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2754"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2754"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2013"), NodeClass.ObjectType, false));
        this.namespace.addNode(node);
    }

    private void buildNode175() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=2930"), new QualifiedName(0, "Unshelved"), new LocalizedText("en", "Unshelved"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=6098"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2935"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2936"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2940"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2943"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=6098"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2935"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2936"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2940"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2930"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2943"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode176() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=2932"), new QualifiedName(0, "TimedShelved"), new LocalizedText("en", "TimedShelved"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=6100"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2935"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2940"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2942"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2945"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=6100"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2935"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2940"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2942"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2932"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2945"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode177() {
        UaObjectNode node = new StateNode(this.namespace, NodeId.parse("i=2933"), new QualifiedName(0, "OneShotShelved"), new LocalizedText("en", "OneShotShelved"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=6101"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2936"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2942"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2943"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2945"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2307"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=6101"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2936"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2942"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2943"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2933"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2945"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode178() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2935"), new QualifiedName(0, "UnshelvedToTimedShelved"), new LocalizedText("en", "UnshelvedToTimedShelved"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2930"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2932"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11322"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2930"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2932"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2915"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2949"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11322"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2935"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2949"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode179() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2936"), new QualifiedName(0, "UnshelvedToOneShotShelved"), new LocalizedText("en", "UnshelvedToOneShotShelved"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2930"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2933"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11323"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2930"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2933"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2915"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2948"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11323"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2936"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2948"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode180() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2940"), new QualifiedName(0, "TimedShelvedToUnshelved"), new LocalizedText("en", "TimedShelvedToUnshelved"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2930"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2932"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11324"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2932"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2930"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2915"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2947"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11324"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2940"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2947"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode181() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2942"), new QualifiedName(0, "TimedShelvedToOneShotShelved"), new LocalizedText("en", "TimedShelvedToOneShotShelved"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2932"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2933"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11325"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2932"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2933"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2915"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2948"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11325"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2942"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2948"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode182() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2943"), new QualifiedName(0, "OneShotShelvedToUnshelved"), new LocalizedText("en", "OneShotShelvedToUnshelved"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2930"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2933"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11326"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2933"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2930"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2915"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2947"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11326"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2943"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2947"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode183() {
        UaObjectNode node = new TransitionNode(this.namespace, NodeId.parse("i=2945"), new QualifiedName(0, "OneShotShelvedToTimedShelved"), new LocalizedText("en", "OneShotShelvedToTimedShelved"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2932"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2933"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11327"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=51"), ExpandedNodeId.parse("svr=0;i=2933"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=52"), ExpandedNodeId.parse("svr=0;i=2932"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=54"), ExpandedNodeId.parse("svr=0;i=2915"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2949"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2310"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2929"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11327"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=2945"), NodeId.parse("i=53"), ExpandedNodeId.parse("svr=0;i=2949"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode184() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=11172"), new QualifiedName(0, "AggregateFunctions"), new LocalizedText("en", "AggregateFunctions"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11172"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2330"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=11172"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11172"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=11172"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2330"), NodeClass.ObjectType, false));
        this.namespace.addNode(node);
    }

    private void buildNode185() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=2996"), new QualifiedName(0, "ModellingRules"), new LocalizedText("en", "ModellingRules"), Optional.of(new LocalizedText("en", "A folder for the modelling rules supported by the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2996"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2268"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2996"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2996"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2268"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode186() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=2997"), new QualifiedName(0, "AggregateFunctions"), new LocalizedText("en", "AggregateFunctions"), Optional.of(new LocalizedText("en", "A folder for the real time aggregates supported by the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=2997"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2268"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=2997"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=2997"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2268"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode187() {
        UaObjectNode node = new HistoryServerCapabilitiesNode(this.namespace, NodeId.parse("i=11192"), new QualifiedName(0, "HistoryServerCapabilities"), new LocalizedText("en", "HistoryServerCapabilities"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11193"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11242"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11273"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11274"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11196"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11197"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11198"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11199"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11200"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11281"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11282"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11283"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11502"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11275"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11201"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2268"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2330"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11193"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11242"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11273"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11274"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11196"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11197"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11198"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11199"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11200"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11281"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11282"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11283"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11502"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11275"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11192"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11201"), NodeClass.Object, true));
        this.namespace.addNode(node);
    }

    private void buildNode188() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=11201"), new QualifiedName(0, "AggregateFunctions"), new LocalizedText("en", "AggregateFunctions"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11201"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11192"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=11201"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11201"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11192"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode189() {
        UaObjectNode node = new HistoricalDataConfigurationNode(this.namespace, NodeId.parse("i=11202"), new QualifiedName(0, "HA Configuration"), new LocalizedText("en", "HA Configuration"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11202"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11203"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=11202"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11208"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11202"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2318"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11202"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11203"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=11202"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11208"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode190() {
        UaObjectNode node = new AggregateConfigurationNode(this.namespace, NodeId.parse("i=11203"), new QualifiedName(0, "AggregateConfiguration"), new LocalizedText("en", "AggregateConfiguration"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11202"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11204"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11205"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11206"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11207"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=11187"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11202"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11204"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11205"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11206"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11203"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11207"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode191() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=3048"), new QualifiedName(0, "EventTypes"), new LocalizedText("en", "EventTypes"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=3048"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=86"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=3048"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=2041"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=3048"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode192() {
        UaObjectNode node = new AggregateConfigurationNode(this.namespace, NodeId.parse("i=3059"), new QualifiedName(0, "AggregateConfiguration"), new LocalizedText("en", "AggregateConfiguration"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11168"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11169"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11170"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11171"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=11187"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11168"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11169"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11170"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3059"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11171"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode193() {
        UaObjectNode node = new BaseObjectNode(this.namespace, NodeId.parse("i=3062"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.of(new LocalizedText("en", "The default binary encoding for a data type.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=3062"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=58"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode194() {
        UaObjectNode node = new BaseObjectNode(this.namespace, NodeId.parse("i=3063"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.of(new LocalizedText("en", "The default XML encoding for a data type.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=3063"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=58"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode195() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=3093"), new QualifiedName(0, "ModellingRules"), new LocalizedText("en", "ModellingRules"), Optional.of(new LocalizedText("en", "A folder for the modelling rules supported by the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=3093"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2009"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=3093"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=3093"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=3093"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2009"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode196() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11285"), new QualifiedName(0, "TimeAverage2"), new LocalizedText("en", "TimeAverage2"), Optional.of(new LocalizedText("en", "Retrieve the time weighted average data over the interval using Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11285"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode197() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=3094"), new QualifiedName(0, "AggregateFunctions"), new LocalizedText("en", "AggregateFunctions"), Optional.of(new LocalizedText("en", "A folder for the real time aggregates supported by the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=3094"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2009"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=3094"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=3094"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=3094"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2009"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode198() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11286"), new QualifiedName(0, "Minimum2"), new LocalizedText("en", "Minimum2"), Optional.of(new LocalizedText("en", "Retrieve the minimum value in the interval including the Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11286"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode199() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11287"), new QualifiedName(0, "Maximum2"), new LocalizedText("en", "Maximum2"), Optional.of(new LocalizedText("en", "Retrieve the maximum value in the interval including the Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11287"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode200() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11288"), new QualifiedName(0, "Range2"), new LocalizedText("en", "Range2"), Optional.of(new LocalizedText("en", "Retrieve the difference between the Minimum2 and Maximum2 value over the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11288"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode201() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11292"), new QualifiedName(0, "WorstQuality2"), new LocalizedText("en", "WorstQuality2"), Optional.of(new LocalizedText("en", "Retrieve the worst StatusCode of data in the interval including the Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11292"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode202() {
        UaObjectNode node = new SessionsDiagnosticsSummaryNode(this.namespace, NodeId.parse("i=3111"), new QualifiedName(0, "SessionsDiagnosticsSummary"), new LocalizedText("en", "SessionsDiagnosticsSummary"), Optional.of(new LocalizedText("en", "A summary of session level diagnostics.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=3111"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2010"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=3111"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3112"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3111"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3113"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3111"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2026"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=3111"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=3111"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2010"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=3111"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3112"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3111"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3113"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode203() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11304"), new QualifiedName(0, "Total2"), new LocalizedText("en", "Total2"), Optional.of(new LocalizedText("en", "Retrieve the total (time integral) of the data over the interval using Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11304"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode204() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11305"), new QualifiedName(0, "MinimumActualTime2"), new LocalizedText("en", "MinimumActualTime2"), Optional.of(new LocalizedText("en", "Retrieve the minimum value with the actual timestamp including the Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11305"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode205() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11306"), new QualifiedName(0, "MaximumActualTime2"), new LocalizedText("en", "MaximumActualTime2"), Optional.of(new LocalizedText("en", "Retrieve the maximum value with the actual timestamp including the Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11306"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode206() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11307"), new QualifiedName(0, "DurationInStateZero"), new LocalizedText("en", "DurationInStateZero"), Optional.of(new LocalizedText("en", "Retrieve the time a Boolean or numeric was in a zero state using Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11307"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode207() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11308"), new QualifiedName(0, "DurationInStateNonZero"), new LocalizedText("en", "DurationInStateNonZero"), Optional.of(new LocalizedText("en", "Retrieve the time a Boolean or numeric was in a non-zero state using Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11308"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode208() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11426"), new QualifiedName(0, "StandardDeviationSample"), new LocalizedText("en", "StandardDeviationSample"), Optional.of(new LocalizedText("en", "Retrieve the standard deviation for the interval for a sample of the population (n-1).")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11426"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode209() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11427"), new QualifiedName(0, "StandardDeviationPopulation"), new LocalizedText("en", "StandardDeviationPopulation"), Optional.of(new LocalizedText("en", "Retrieve the standard deviation for the interval for a complete population (n) which includes Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11427"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode210() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11428"), new QualifiedName(0, "VarianceSample"), new LocalizedText("en", "VarianceSample"), Optional.of(new LocalizedText("en", "Retrieve the variance for the interval as calculated by the StandardDeviationSample.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11428"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode211() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11429"), new QualifiedName(0, "VariancePopulation"), new LocalizedText("en", "VariancePopulation"), Optional.of(new LocalizedText("en", "Retrieve the variance for the interval as calculated by the StandardDeviationPopulation which includes Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11429"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode212() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11505"), new QualifiedName(0, "StartBound"), new LocalizedText("en", "StartBound"), Optional.of(new LocalizedText("en", "Retrieve the value at the beginning of the interval using Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11505"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode213() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11506"), new QualifiedName(0, "EndBound"), new LocalizedText("en", "EndBound"), Optional.of(new LocalizedText("en", "Retrieve the value at the end of the interval using Simple Bounding Values.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11506"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode214() {
        UaObjectNode node = new AggregateFunctionNode(this.namespace, NodeId.parse("i=11507"), new QualifiedName(0, "DeltaBounds"), new LocalizedText("en", "DeltaBounds"), Optional.of(new LocalizedText("en", "Retrieve the difference between the StartBound and EndBound value in the interval.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11507"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2340"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode215() {
        UaObjectNode node = new ModellingRuleNode(this.namespace, NodeId.parse("i=11508"), new QualifiedName(0, "OptionalPlaceholder"), new LocalizedText("en", "OptionalPlaceholder"), Optional.of(new LocalizedText("en", "Specifies that zero or more instances with the attributes and references of the instance declaration may appear when a type is instantiated.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11508"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11509"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11508"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=77"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11508"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11509"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11508"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11562"), NodeClass.Variable, false));
        node.addReference(new Reference(NodeId.parse("i=11508"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=12097"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=11508"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11646"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode216() {
        UaObjectNode node = new ModellingRuleNode(this.namespace, NodeId.parse("i=11510"), new QualifiedName(0, "MandatoryPlaceholder"), new LocalizedText("en", "MandatoryPlaceholder"), Optional.of(new LocalizedText("en", "Specifies that one or more instances with the attributes and references of the instance declaration must appear when a type is instantiated.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11510"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11511"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11510"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=77"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11510"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11511"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode217() {
        UaObjectNode node = new NamespacesNode(this.namespace, NodeId.parse("i=11527"), new QualifiedName(0, "Namespaces"), new LocalizedText("en", "Namespaces"), Optional.of(new LocalizedText("en", "Describes the namespaces supported by the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11527"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=11527"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=11645"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11527"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=80"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=11527"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2004"), NodeClass.ObjectType, false));
        this.namespace.addNode(node);
    }

    private void buildNode218() {
        UaObjectNode node = new OperationLimitsNode(this.namespace, NodeId.parse("i=11551"), new QualifiedName(0, "OperationLimits"), new LocalizedText("en", "OperationLimits"), Optional.of(new LocalizedText("en", "Defines the limits supported by the server for different operations.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11551"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2013"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=11551"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=11564"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11551"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=80"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=11551"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2013"), NodeClass.ObjectType, false));
        this.namespace.addNode(node);
    }

    private void buildNode219() {
        UaObjectNode node = new AddressSpaceFileNode(this.namespace, NodeId.parse("i=11624"), new QualifiedName(0, "NamespaceFile"), new LocalizedText("en", "NamespaceFile"), Optional.of(new LocalizedText("en", "A file containing the nodes of the namespace.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11616"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11625"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11626"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11627"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11628"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11629"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11632"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11634"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11637"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11639"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11642"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=11595"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=80"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11616"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11625"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11626"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11627"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11628"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11629"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11632"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11634"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11637"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11639"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11624"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11642"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode220() {
        UaObjectNode node = new NamespaceMetadataNode(this.namespace, NodeId.parse("i=11646"), new QualifiedName(0, "<NamespaceIdentifier>"), new LocalizedText("en", "<NamespaceIdentifier>"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11645"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11647"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11648"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11649"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11650"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11651"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11652"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11653"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=11616"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11508"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11645"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11647"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11648"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11649"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11650"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11651"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11652"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11646"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11653"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode221() {
        UaObjectNode node = new AddressSpaceFileNode(this.namespace, NodeId.parse("i=11675"), new QualifiedName(0, "AddressSpaceFile"), new LocalizedText("en", "AddressSpaceFile"), Optional.of(new LocalizedText("en", "A file containing the nodes of the namespace.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11645"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11676"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11677"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11678"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11679"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11680"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11683"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11685"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11688"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11690"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11693"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=11595"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=80"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11645"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11676"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11677"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11678"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11679"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11680"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11683"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11685"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11688"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11690"), NodeClass.Method, true));
        node.addReference(new Reference(NodeId.parse("i=11675"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=11693"), NodeClass.Method, true));
        this.namespace.addNode(node);
    }

    private void buildNode222() {
        UaObjectNode node = new OperationLimitsNode(this.namespace, NodeId.parse("i=11704"), new QualifiedName(0, "OperationLimits"), new LocalizedText("en", "OperationLimits"), Optional.of(new LocalizedText("en", "Defines the limits supported by the server for different operations.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2268"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11705"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12165"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12166"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11707"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12167"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12168"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11709"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11710"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11711"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11712"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11713"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11714"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=11564"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2268"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11705"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12165"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12166"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11707"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12167"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=12168"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11709"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11710"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11711"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11712"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11713"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11704"), NodeId.parse("i=46"), ExpandedNodeId.parse("svr=0;i=11714"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode223() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=7616"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=7616"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=7594"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=7616"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=8291"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=7616"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode224() {
        UaObjectNode node = new NamespacesNode(this.namespace, NodeId.parse("i=11715"), new QualifiedName(0, "Namespaces"), new LocalizedText("en", "Namespaces"), Optional.of(new LocalizedText("en", "Describes the namespaces supported by the server.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11715"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=11715"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=11645"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11715"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2253"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode225() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=11876"), new QualifiedName(0, "AggregateFunctions"), new LocalizedText("en", "AggregateFunctions"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11876"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2318"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=11876"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=11876"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=80"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=11876"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2318"), NodeClass.ObjectType, false));
        this.namespace.addNode(node);
    }

    private void buildNode226() {
        UaObjectNode node = new SessionsDiagnosticsSummaryNode(this.namespace, NodeId.parse("i=3706"), new QualifiedName(0, "SessionsDiagnosticsSummary"), new LocalizedText("en", "SessionsDiagnosticsSummary"), Optional.of(new LocalizedText("en", "A summary of session level diagnostics.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=3706"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2274"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=3706"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3707"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3706"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3708"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3706"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2026"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=3706"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2274"), NodeClass.Object, false));
        node.addReference(new Reference(NodeId.parse("i=3706"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3707"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=3706"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=3708"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode227() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=11949"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11949"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=11943"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=11949"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=11951"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11949"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode228() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=11950"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11950"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=11944"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=11950"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=11954"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11950"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode229() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=11957"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11957"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=11943"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=11957"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=11959"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11957"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode230() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=11958"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=11958"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=11944"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=11958"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=11962"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=11958"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode231() {
        UaObjectNode node = new BaseObjectNode(this.namespace, NodeId.parse("i=3850"), new QualifiedName(0, "FinalResultData"), new LocalizedText("en", "FinalResultData"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=3850"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=3850"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=58"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=3850"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=80"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=3850"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2391"), NodeClass.ObjectType, false));
        this.namespace.addNode(node);
    }

    private void buildNode232() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12081"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12081"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12079"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12081"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12083"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12081"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode233() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12082"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12082"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12080"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12082"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12086"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12082"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode234() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12089"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12089"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12079"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12089"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12091"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12089"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode235() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12090"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12090"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12080"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12090"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12094"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12090"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode236() {
        UaObjectNode node = new SessionDiagnosticsObjectNode(this.namespace, NodeId.parse("i=12097"), new QualifiedName(0, "<SessionPlaceholder>"), new LocalizedText("en", "<SessionPlaceholder>"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12097"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2026"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=12097"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12098"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12097"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12142"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12097"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12152"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12097"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=2029"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=12097"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=11508"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=12097"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=2026"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=12097"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12098"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12097"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12142"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12097"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12152"), NodeClass.Variable, true));
        this.namespace.addNode(node);
    }

    private void buildNode237() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12173"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12173"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12171"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12173"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12175"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12173"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode238() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12174"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12174"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12172"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12174"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12178"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12174"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode239() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12181"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12181"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12171"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12181"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12183"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12181"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode240() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12182"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12182"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12172"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12182"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12186"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12182"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode241() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12195"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12195"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12189"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12195"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12201"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12195"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode242() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12198"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12198"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12192"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12198"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12204"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12198"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode243() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12207"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12207"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12189"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12207"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12213"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12207"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode244() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12210"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12210"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12192"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12210"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12216"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12210"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode245() {
        UaObjectNode node = new FolderNode(this.namespace, NodeId.parse("i=12232"), new QualifiedName(0, "Applications"), new LocalizedText("en", "Applications"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12232"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12231"), NodeClass.ObjectType, false));
        node.addReference(new Reference(NodeId.parse("i=12232"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=61"), NodeClass.ObjectType, true));
        node.addReference(new Reference(NodeId.parse("i=12232"), NodeId.parse("i=37"), ExpandedNodeId.parse("svr=0;i=78"), NodeClass.Object, true));
        node.addReference(new Reference(NodeId.parse("i=12232"), NodeId.parse("i=47"), ExpandedNodeId.parse("svr=0;i=12231"), NodeClass.ObjectType, false));
        this.namespace.addNode(node);
    }

    private void buildNode246() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12253"), new QualifiedName(0, "Default XML"), new LocalizedText("en", "Default XML"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12253"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12252"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12253"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12254"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12253"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    private void buildNode247() {
        UaObjectNode node = new DataTypeEncodingNode(this.namespace, NodeId.parse("i=12257"), new QualifiedName(0, "Default Binary"), new LocalizedText("en", "Default Binary"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), UByte.valueOf(0));
        node.addReference(new Reference(NodeId.parse("i=12257"), NodeId.parse("i=38"), ExpandedNodeId.parse("svr=0;i=12252"), NodeClass.DataType, false));
        node.addReference(new Reference(NodeId.parse("i=12257"), NodeId.parse("i=39"), ExpandedNodeId.parse("svr=0;i=12258"), NodeClass.Variable, true));
        node.addReference(new Reference(NodeId.parse("i=12257"), NodeId.parse("i=40"), ExpandedNodeId.parse("svr=0;i=76"), NodeClass.ObjectType, true));
        this.namespace.addNode(node);
    }

    public void buildNodes() {
        buildNode0();
        buildNode1();
        buildNode2();
        buildNode3();
        buildNode4();
        buildNode5();
        buildNode6();
        buildNode7();
        buildNode8();
        buildNode9();
        buildNode10();
        buildNode11();
        buildNode12();
        buildNode13();
        buildNode14();
        buildNode15();
        buildNode16();
        buildNode17();
        buildNode18();
        buildNode19();
        buildNode20();
        buildNode21();
        buildNode22();
        buildNode23();
        buildNode24();
        buildNode25();
        buildNode26();
        buildNode27();
        buildNode28();
        buildNode29();
        buildNode30();
        buildNode31();
        buildNode32();
        buildNode33();
        buildNode34();
        buildNode35();
        buildNode36();
        buildNode37();
        buildNode38();
        buildNode39();
        buildNode40();
        buildNode41();
        buildNode42();
        buildNode43();
        buildNode44();
        buildNode45();
        buildNode46();
        buildNode47();
        buildNode48();
        buildNode49();
        buildNode50();
        buildNode51();
        buildNode52();
        buildNode53();
        buildNode54();
        buildNode55();
        buildNode56();
        buildNode57();
        buildNode58();
        buildNode59();
        buildNode60();
        buildNode61();
        buildNode62();
        buildNode63();
        buildNode64();
        buildNode65();
        buildNode66();
        buildNode67();
        buildNode68();
        buildNode69();
        buildNode70();
        buildNode71();
        buildNode72();
        buildNode73();
        buildNode74();
        buildNode75();
        buildNode76();
        buildNode77();
        buildNode78();
        buildNode79();
        buildNode80();
        buildNode81();
        buildNode82();
        buildNode83();
        buildNode84();
        buildNode85();
        buildNode86();
        buildNode87();
        buildNode88();
        buildNode89();
        buildNode90();
        buildNode91();
        buildNode92();
        buildNode93();
        buildNode94();
        buildNode95();
        buildNode96();
        buildNode97();
        buildNode98();
        buildNode99();
        buildNode100();
        buildNode101();
        buildNode102();
        buildNode103();
        buildNode104();
        buildNode105();
        buildNode106();
        buildNode107();
        buildNode108();
        buildNode109();
        buildNode110();
        buildNode111();
        buildNode112();
        buildNode113();
        buildNode114();
        buildNode115();
        buildNode116();
        buildNode117();
        buildNode118();
        buildNode119();
        buildNode120();
        buildNode121();
        buildNode122();
        buildNode123();
        buildNode124();
        buildNode125();
        buildNode126();
        buildNode127();
        buildNode128();
        buildNode129();
        buildNode130();
        buildNode131();
        buildNode132();
        buildNode133();
        buildNode134();
        buildNode135();
        buildNode136();
        buildNode137();
        buildNode138();
        buildNode139();
        buildNode140();
        buildNode141();
        buildNode142();
        buildNode143();
        buildNode144();
        buildNode145();
        buildNode146();
        buildNode147();
        buildNode148();
        buildNode149();
        buildNode150();
        buildNode151();
        buildNode152();
        buildNode153();
        buildNode154();
        buildNode155();
        buildNode156();
        buildNode157();
        buildNode158();
        buildNode159();
        buildNode160();
        buildNode161();
        buildNode162();
        buildNode163();
        buildNode164();
        buildNode165();
        buildNode166();
        buildNode167();
        buildNode168();
        buildNode169();
        buildNode170();
        buildNode171();
        buildNode172();
        buildNode173();
        buildNode174();
        buildNode175();
        buildNode176();
        buildNode177();
        buildNode178();
        buildNode179();
        buildNode180();
        buildNode181();
        buildNode182();
        buildNode183();
        buildNode184();
        buildNode185();
        buildNode186();
        buildNode187();
        buildNode188();
        buildNode189();
        buildNode190();
        buildNode191();
        buildNode192();
        buildNode193();
        buildNode194();
        buildNode195();
        buildNode196();
        buildNode197();
        buildNode198();
        buildNode199();
        buildNode200();
        buildNode201();
        buildNode202();
        buildNode203();
        buildNode204();
        buildNode205();
        buildNode206();
        buildNode207();
        buildNode208();
        buildNode209();
        buildNode210();
        buildNode211();
        buildNode212();
        buildNode213();
        buildNode214();
        buildNode215();
        buildNode216();
        buildNode217();
        buildNode218();
        buildNode219();
        buildNode220();
        buildNode221();
        buildNode222();
        buildNode223();
        buildNode224();
        buildNode225();
        buildNode226();
        buildNode227();
        buildNode228();
        buildNode229();
        buildNode230();
        buildNode231();
        buildNode232();
        buildNode233();
        buildNode234();
        buildNode235();
        buildNode236();
        buildNode237();
        buildNode238();
        buildNode239();
        buildNode240();
        buildNode241();
        buildNode242();
        buildNode243();
        buildNode244();
        buildNode245();
        buildNode246();
        buildNode247();
    }

}
