/*
 * Copyright 2016 the original author or authors. (http://ctolavi.github.io/JTelegramBot).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openercuss.jtelegrambot.telegram;

/**
 *
 * @author Roberto Almanza
 */
public class ForceReply {
    
    private boolean force_reply;
    
    private boolean selective;

    public boolean isForce_reply() {
        return force_reply;
    }

    public void setForce_reply(boolean force_reply) {
        this.force_reply = force_reply;
    }

    public boolean isSelective() {
        return selective;
    }

    public void setSelective(boolean selective) {
        this.selective = selective;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.force_reply ? 1 : 0);
        hash = 59 * hash + (this.selective ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ForceReply other = (ForceReply) obj;
        return this.force_reply == other.force_reply &&
                this.selective == other.selective;
    }
}
