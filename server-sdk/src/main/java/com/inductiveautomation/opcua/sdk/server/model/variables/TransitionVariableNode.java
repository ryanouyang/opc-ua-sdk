package com.inductiveautomation.opcua.sdk.server.model.variables;

import java.util.Optional;

import com.inductiveautomation.opcua.sdk.core.model.UaMandatory;
import com.inductiveautomation.opcua.sdk.core.model.UaOptional;
import com.inductiveautomation.opcua.sdk.core.model.variables.TransitionVariableType;
import com.inductiveautomation.opcua.sdk.server.api.UaNamespace;
import com.inductiveautomation.opcua.sdk.server.util.UaVariableType;
import com.inductiveautomation.opcua.stack.core.types.builtin.DataValue;
import com.inductiveautomation.opcua.stack.core.types.builtin.DateTime;
import com.inductiveautomation.opcua.stack.core.types.builtin.LocalizedText;
import com.inductiveautomation.opcua.stack.core.types.builtin.NodeId;
import com.inductiveautomation.opcua.stack.core.types.builtin.QualifiedName;
import com.inductiveautomation.opcua.stack.core.types.builtin.Variant;
import com.inductiveautomation.opcua.stack.core.types.builtin.unsigned.UByte;
import com.inductiveautomation.opcua.stack.core.types.builtin.unsigned.UInteger;

@UaVariableType(name = "TransitionVariableType")
public class TransitionVariableNode extends BaseDataVariableNode implements TransitionVariableType {

    public TransitionVariableNode(UaNamespace namespace,
                                  NodeId nodeId,
                                  QualifiedName browseName,
                                  LocalizedText displayName,
                                  Optional<LocalizedText> description,
                                  Optional<UInteger> writeMask,
                                  Optional<UInteger> userWriteMask,
                                  DataValue value,
                                  NodeId dataType,
                                  Integer valueRank,
                                  Optional<UInteger[]> arrayDimensions,
                                  UByte accessLevel,
                                  UByte userAccessLevel,
                                  Optional<Double> minimumSamplingInterval,
                                  boolean historizing) {

        super(namespace, nodeId, browseName, displayName, description, writeMask, userWriteMask,
                value, dataType, valueRank, arrayDimensions, accessLevel, userAccessLevel, minimumSamplingInterval, historizing);

    }

    @Override
    @UaMandatory("Id")
    public Object getId() {
        Optional<Object> id = getProperty("Id");

        return id.orElse(null);
    }

    @Override
    @UaOptional("Name")
    public QualifiedName getName() {
        Optional<QualifiedName> name = getProperty("Name");

        return name.orElse(null);
    }

    @Override
    @UaOptional("Number")
    public UInteger getNumber() {
        Optional<UInteger> number = getProperty("Number");

        return number.orElse(null);
    }

    @Override
    @UaOptional("TransitionTime")
    public DateTime getTransitionTime() {
        Optional<DateTime> transitionTime = getProperty("TransitionTime");

        return transitionTime.orElse(null);
    }

    @Override
    @UaOptional("EffectiveTransitionTime")
    public DateTime getEffectiveTransitionTime() {
        Optional<DateTime> effectiveTransitionTime = getProperty("EffectiveTransitionTime");

        return effectiveTransitionTime.orElse(null);
    }

    @Override
    public synchronized void setId(Object id) {
        getPropertyNode("Id").ifPresent(n -> {
            n.setValue(new DataValue(new Variant(id)));
        });
    }

    @Override
    public synchronized void setName(QualifiedName name) {
        getPropertyNode("Name").ifPresent(n -> {
            n.setValue(new DataValue(new Variant(name)));
        });
    }

    @Override
    public synchronized void setNumber(UInteger number) {
        getPropertyNode("Number").ifPresent(n -> {
            n.setValue(new DataValue(new Variant(number)));
        });
    }

    @Override
    public synchronized void setTransitionTime(DateTime transitionTime) {
        getPropertyNode("TransitionTime").ifPresent(n -> {
            n.setValue(new DataValue(new Variant(transitionTime)));
        });
    }

    @Override
    public synchronized void setEffectiveTransitionTime(DateTime effectiveTransitionTime) {
        getPropertyNode("EffectiveTransitionTime").ifPresent(n -> {
            n.setValue(new DataValue(new Variant(effectiveTransitionTime)));
        });
    }

}
