package com.inductiveautomation.opcua.sdk.core.model.variables;

import com.inductiveautomation.opcua.sdk.core.model.UaMandatory;
import com.inductiveautomation.opcua.sdk.core.model.UaOptional;
import com.inductiveautomation.opcua.stack.core.types.builtin.DateTime;
import com.inductiveautomation.opcua.stack.core.types.builtin.QualifiedName;
import com.inductiveautomation.opcua.stack.core.types.builtin.unsigned.UInteger;

public interface TransitionVariableType extends BaseDataVariableType {

    @UaMandatory("Id")
    Object getId();

    @UaOptional("Name")
    QualifiedName getName();

    @UaOptional("Number")
    UInteger getNumber();

    @UaOptional("TransitionTime")
    DateTime getTransitionTime();

    @UaOptional("EffectiveTransitionTime")
    DateTime getEffectiveTransitionTime();

    void setId(Object id);

    void setName(QualifiedName name);

    void setNumber(UInteger number);

    void setTransitionTime(DateTime transitionTime);

    void setEffectiveTransitionTime(DateTime effectiveTransitionTime);

}
