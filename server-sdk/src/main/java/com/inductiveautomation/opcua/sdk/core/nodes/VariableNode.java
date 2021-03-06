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

package com.inductiveautomation.opcua.sdk.core.nodes;

import java.util.Optional;

import com.inductiveautomation.opcua.stack.core.types.builtin.DataValue;
import com.inductiveautomation.opcua.stack.core.types.builtin.NodeId;
import com.inductiveautomation.opcua.stack.core.types.builtin.unsigned.UByte;
import com.inductiveautomation.opcua.stack.core.types.builtin.unsigned.UInteger;

public interface VariableNode extends Node {

    DataValue getValue();

    NodeId getDataType();

    Integer getValueRank();

    Optional<UInteger[]> getArrayDimensions();

    UByte getAccessLevel();

    UByte getUserAccessLevel();

    Optional<Double> getMinimumSamplingInterval();

    Boolean getHistorizing();

    /**
     * Set the Value attribute of this Node.
     *
     * @param value the Value to set.
     */
    void setValue(DataValue value);

    /**
     * Set the DataType attribute of this Node.
     *
     * @param dataType the DataType to set.
     */
    void setDataType(NodeId dataType);

    void setValueRank(Integer valueRank);

    void setArrayDimensions(Optional<UInteger[]> arrayDimensions);

    void setAccessLevel(UByte accessLevel);

    void setUserAccessLevel(UByte userAccessLevel);

    void setMinimumSamplingInterval(Optional<Double> minimumSamplingInterval);

    void setHistorizing(boolean historizing);

}
