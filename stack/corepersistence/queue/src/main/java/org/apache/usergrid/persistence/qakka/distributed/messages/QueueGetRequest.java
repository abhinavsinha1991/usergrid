/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.usergrid.persistence.qakka.distributed.messages;


import org.apache.commons.lang3.builder.ToStringBuilder;

public class QueueGetRequest implements QakkaMessage {
    private final String queueName;
    private final int numRequested;

    public QueueGetRequest(String queueName, int numRequested ) {
        this.queueName = queueName;
        this.numRequested = numRequested;
    }

    public String getQueueName() {
        return queueName;
    }

    public int getNumRequested() {
        return numRequested;
    }

    public String toString() {
        return new ToStringBuilder( this )
                .append( "queueName", queueName )
                .append( "numRequested", numRequested )
                .toString();
    }

}
