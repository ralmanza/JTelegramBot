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

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Roberto Almanza
 */
public class ForceReplyTest {
    
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        ForceReply forceReply = new ForceReply();
        forceReply.setForce_reply(true);
        forceReply.setSelective(true);
        assertTrue(forceReply.equals(forceReply));
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        ForceReply forceReply = new ForceReply();
        forceReply.setForce_reply(true);
        forceReply.setSelective(true);     
        ForceReply forceReply2 = new ForceReply();
        forceReply2.setForce_reply(true);
        forceReply2.setSelective(true);
        assertTrue(forceReply.equals(forceReply2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        ForceReply forceReply = new ForceReply();
        forceReply.setForce_reply(true);
        forceReply.setSelective(true);     
        ForceReply forceReply2 = new ForceReply();
        forceReply2.setForce_reply(true);
        forceReply2.setSelective(false);
        assertFalse(forceReply.equals(forceReply2));
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        ForceReply forceReply = new ForceReply();
        forceReply.setForce_reply(true);
        forceReply.setSelective(true);     
        ForceReply forceReply2 = new ForceReply();
        forceReply2.setForce_reply(true);
        forceReply2.setSelective(true);              
        assertEquals(forceReply.hashCode(), forceReply2.hashCode(), 0.00001);
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        ForceReply forceReply = new ForceReply();
        forceReply.setForce_reply(true);
        forceReply.setSelective(true);     
        ForceReply forceReply2 = new ForceReply();
        forceReply2.setForce_reply(true);
        forceReply2.setSelective(false);         
        assertNotEquals(forceReply.hashCode(), forceReply2.hashCode(), 0.00001);
    }

}
