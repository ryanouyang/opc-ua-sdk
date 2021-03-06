package com.inductiveautomation.opcua.sdk.server.namespaces.loader;

import java.util.Optional;

import com.inductiveautomation.opcua.sdk.core.Reference;
import com.inductiveautomation.opcua.sdk.server.api.UaNamespace;
import com.inductiveautomation.opcua.sdk.server.model.UaReferenceTypeNode;
import com.inductiveautomation.opcua.stack.core.types.builtin.ExpandedNodeId;
import com.inductiveautomation.opcua.stack.core.types.builtin.LocalizedText;
import com.inductiveautomation.opcua.stack.core.types.builtin.NodeId;
import com.inductiveautomation.opcua.stack.core.types.builtin.QualifiedName;
import com.inductiveautomation.opcua.stack.core.types.builtin.unsigned.UInteger;
import com.inductiveautomation.opcua.stack.core.types.enumerated.NodeClass;

public class UaReferenceTypeLoader {

    private final UaNamespace namespace;

    public UaReferenceTypeLoader(UaNamespace namespace) {
        this.namespace = namespace;
    }

    private void buildNode0() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=31"), new QualifiedName(0, "References"), new LocalizedText("en", "References"), Optional.of(new LocalizedText("en", "The abstract base type for all references.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), true, true, Optional.of(new LocalizedText("en", "References")));
        node.addReference(new Reference(NodeId.parse("i=31"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=31"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=33"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=31"), NodeId.parse("i=35"), ExpandedNodeId.parse("svr=0;i=91"), NodeClass.Object, false));
        this.namespace.addNode(node);
    }

    private void buildNode1() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=32"), new QualifiedName(0, "NonHierarchicalReferences"), new LocalizedText("en", "NonHierarchicalReferences"), Optional.of(new LocalizedText("en", "The abstract base type for all non-hierarchical references.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), true, false, Optional.of(new LocalizedText("en", "NonHierarchicalReferences")));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=31"), NodeClass.ReferenceType, false));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=37"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=38"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=39"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=40"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=41"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=3065"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=51"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=52"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=53"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=54"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=117"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=9004"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=9005"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=32"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=9006"), NodeClass.ReferenceType, true));
        this.namespace.addNode(node);
    }

    private void buildNode2() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=33"), new QualifiedName(0, "HierarchicalReferences"), new LocalizedText("en", "HierarchicalReferences"), Optional.of(new LocalizedText("en", "The abstract base type for all hierarchical references.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), true, false, Optional.of(new LocalizedText("en", "HierarchicalReferences")));
        node.addReference(new Reference(NodeId.parse("i=33"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=31"), NodeClass.ReferenceType, false));
        node.addReference(new Reference(NodeId.parse("i=33"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=34"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=33"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=35"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=33"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=36"), NodeClass.ReferenceType, true));
        this.namespace.addNode(node);
    }

    private void buildNode3() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=34"), new QualifiedName(0, "HasChild"), new LocalizedText("en", "HasChild"), Optional.of(new LocalizedText("en", "The abstract base type for all non-looping hierarchical references.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "ChildOf")));
        node.addReference(new Reference(NodeId.parse("i=34"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=33"), NodeClass.ReferenceType, false));
        node.addReference(new Reference(NodeId.parse("i=34"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=44"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=34"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=45"), NodeClass.ReferenceType, true));
        this.namespace.addNode(node);
    }

    private void buildNode4() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=35"), new QualifiedName(0, "Organizes"), new LocalizedText("en", "Organizes"), Optional.of(new LocalizedText("en", "The type for hierarchical references that are used to organize nodes.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "OrganizedBy")));
        node.addReference(new Reference(NodeId.parse("i=35"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=33"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode5() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=36"), new QualifiedName(0, "HasEventSource"), new LocalizedText("en", "HasEventSource"), Optional.of(new LocalizedText("en", "The type for non-looping hierarchical references that are used to organize event sources.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "EventSourceOf")));
        node.addReference(new Reference(NodeId.parse("i=36"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=33"), NodeClass.ReferenceType, false));
        node.addReference(new Reference(NodeId.parse("i=36"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=48"), NodeClass.ReferenceType, true));
        this.namespace.addNode(node);
    }

    private void buildNode6() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=37"), new QualifiedName(0, "HasModellingRule"), new LocalizedText("en", "HasModellingRule"), Optional.of(new LocalizedText("en", "The type for references from instance declarations to modelling rule nodes.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "ModellingRuleOf")));
        node.addReference(new Reference(NodeId.parse("i=37"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode7() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=38"), new QualifiedName(0, "HasEncoding"), new LocalizedText("en", "HasEncoding"), Optional.of(new LocalizedText("en", "The type for references from data type nodes to to data type encoding nodes.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "EncodingOf")));
        node.addReference(new Reference(NodeId.parse("i=38"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode8() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=39"), new QualifiedName(0, "HasDescription"), new LocalizedText("en", "HasDescription"), Optional.of(new LocalizedText("en", "The type for references from data type encoding nodes to data type description nodes.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "DescriptionOf")));
        node.addReference(new Reference(NodeId.parse("i=39"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode9() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=40"), new QualifiedName(0, "HasTypeDefinition"), new LocalizedText("en", "HasTypeDefinition"), Optional.of(new LocalizedText("en", "The type for references from a instance node its type defintion node.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "TypeDefinitionOf")));
        node.addReference(new Reference(NodeId.parse("i=40"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode10() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=41"), new QualifiedName(0, "GeneratesEvent"), new LocalizedText("en", "GeneratesEvent"), Optional.of(new LocalizedText("en", "The type for references from a node to an event type that is raised by node.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "GeneratesEvent")));
        node.addReference(new Reference(NodeId.parse("i=41"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode11() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=44"), new QualifiedName(0, "Aggregates"), new LocalizedText("en", "Aggregates"), Optional.of(new LocalizedText("en", "The type for non-looping hierarchical references that are used to aggregate nodes into complex types.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "AggregatedBy")));
        node.addReference(new Reference(NodeId.parse("i=44"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=34"), NodeClass.ReferenceType, false));
        node.addReference(new Reference(NodeId.parse("i=44"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=46"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=44"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=47"), NodeClass.ReferenceType, true));
        node.addReference(new Reference(NodeId.parse("i=44"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=56"), NodeClass.ReferenceType, true));
        this.namespace.addNode(node);
    }

    private void buildNode12() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=45"), new QualifiedName(0, "HasSubtype"), new LocalizedText("en", "HasSubtype"), Optional.of(new LocalizedText("en", "The type for non-looping hierarchical references that are used to define sub types.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "HasSupertype")));
        node.addReference(new Reference(NodeId.parse("i=45"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=34"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode13() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=46"), new QualifiedName(0, "HasProperty"), new LocalizedText("en", "HasProperty"), Optional.of(new LocalizedText("en", "The type for non-looping hierarchical reference from a node to its property.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "PropertyOf")));
        node.addReference(new Reference(NodeId.parse("i=46"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=44"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode14() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=47"), new QualifiedName(0, "HasComponent"), new LocalizedText("en", "HasComponent"), Optional.of(new LocalizedText("en", "The type for non-looping hierarchical reference from a node to its component.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "ComponentOf")));
        node.addReference(new Reference(NodeId.parse("i=47"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=44"), NodeClass.ReferenceType, false));
        node.addReference(new Reference(NodeId.parse("i=47"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=49"), NodeClass.ReferenceType, true));
        this.namespace.addNode(node);
    }

    private void buildNode15() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=48"), new QualifiedName(0, "HasNotifier"), new LocalizedText("en", "HasNotifier"), Optional.of(new LocalizedText("en", "The type for non-looping hierarchical references that are used to indicate how events propagate from node to node.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "NotifierOf")));
        node.addReference(new Reference(NodeId.parse("i=48"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=36"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode16() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=49"), new QualifiedName(0, "HasOrderedComponent"), new LocalizedText("en", "HasOrderedComponent"), Optional.of(new LocalizedText("en", "The type for non-looping hierarchical reference from a node to its component when the order of references matters.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "OrderedComponentOf")));
        node.addReference(new Reference(NodeId.parse("i=49"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=47"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode17() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=51"), new QualifiedName(0, "FromState"), new LocalizedText("en", "FromState"), Optional.of(new LocalizedText("en", "The type for a reference to the state before a transition.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "ToTransition")));
        node.addReference(new Reference(NodeId.parse("i=51"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode18() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=52"), new QualifiedName(0, "ToState"), new LocalizedText("en", "ToState"), Optional.of(new LocalizedText("en", "The type for a reference to the state after a transition.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "FromTransition")));
        node.addReference(new Reference(NodeId.parse("i=52"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode19() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=53"), new QualifiedName(0, "HasCause"), new LocalizedText("en", "HasCause"), Optional.of(new LocalizedText("en", "The type for a reference to a method that can cause a transition to occur.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "MayBeCausedBy")));
        node.addReference(new Reference(NodeId.parse("i=53"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode20() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=54"), new QualifiedName(0, "HasEffect"), new LocalizedText("en", "HasEffect"), Optional.of(new LocalizedText("en", "The type for a reference to an event that may be raised when a transition occurs.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "MayBeEffectedBy")));
        node.addReference(new Reference(NodeId.parse("i=54"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode21() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=56"), new QualifiedName(0, "HasHistoricalConfiguration"), new LocalizedText("en", "HasHistoricalConfiguration"), Optional.of(new LocalizedText("en", "The type for a reference to the historical configuration for a data variable.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "HistoricalConfigurationOf")));
        node.addReference(new Reference(NodeId.parse("i=56"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=44"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode22() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=117"), new QualifiedName(0, "HasSubStateMachine"), new LocalizedText("en", "HasSubStateMachine"), Optional.of(new LocalizedText("en", "The type for a reference to a substate for a state.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "SubStateMachineOf")));
        node.addReference(new Reference(NodeId.parse("i=117"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode23() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=9004"), new QualifiedName(0, "HasTrueSubState"), new LocalizedText("en", "HasTrueSubState"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "IsTrueSubStateOf")));
        node.addReference(new Reference(NodeId.parse("i=9004"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode24() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=9005"), new QualifiedName(0, "HasFalseSubState"), new LocalizedText("en", "HasFalseSubState"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "IsFalseSubStateOf")));
        node.addReference(new Reference(NodeId.parse("i=9005"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode25() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=9006"), new QualifiedName(0, "HasCondition"), new LocalizedText("en", "HasCondition"), Optional.empty(), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "IsConditionOf")));
        node.addReference(new Reference(NodeId.parse("i=9006"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
        this.namespace.addNode(node);
    }

    private void buildNode26() {
        UaReferenceTypeNode node = new UaReferenceTypeNode(this.namespace, NodeId.parse("i=3065"), new QualifiedName(0, "AlwaysGeneratesEvent"), new LocalizedText("en", "AlwaysGeneratesEvent"), Optional.of(new LocalizedText("en", "The type for references from a node to an event type that is always raised by node.")), Optional.of(UInteger.valueOf(0L)), Optional.of(UInteger.valueOf(0L)), false, false, Optional.of(new LocalizedText("en", "AlwaysGeneratesEvent")));
        node.addReference(new Reference(NodeId.parse("i=3065"), NodeId.parse("i=45"), ExpandedNodeId.parse("svr=0;i=32"), NodeClass.ReferenceType, false));
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
    }

}
