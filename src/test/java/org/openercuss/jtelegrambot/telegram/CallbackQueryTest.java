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

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Roberto Almanza
 */
public class CallbackQueryTest {
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        CallbackQuery callbackQuery = new CallbackQuery();
        callbackQuery.setId("query");
        callbackQuery.setFrom(new User());
        callbackQuery.setData("query data");
        assertTrue(callbackQuery.equals(callbackQuery));        
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        User user = new User();
        CallbackQuery callbackQuery = new CallbackQuery();
        callbackQuery.setId("query");
        callbackQuery.setFrom(user);
        callbackQuery.setData("query data");
        
        CallbackQuery callbackQuery2 = new CallbackQuery();
        callbackQuery2.setId("query");
        callbackQuery2.setFrom(user);
        callbackQuery2.setData("query data");
        
        assertTrue(callbackQuery.equals(callbackQuery2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        User user = new User();
        CallbackQuery callbackQuery = new CallbackQuery();
        callbackQuery.setId("query");
        callbackQuery.setFrom(user);
        callbackQuery.setData("query data");
        
        CallbackQuery callbackQuery2 = new CallbackQuery();
        callbackQuery2.setId("query2");
        callbackQuery2.setFrom(user);
        callbackQuery2.setData("data");
        
        assertFalse(callbackQuery.equals(callbackQuery2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        User user = new User();
        CallbackQuery callbackQuery = new CallbackQuery();
        callbackQuery.setId("query");
        callbackQuery.setFrom(user);
        callbackQuery.setData("query data");
        callbackQuery.setInlineMessageId("msg");
        
        CallbackQuery callbackQuery2 = new CallbackQuery();
        callbackQuery2.setId("query");
        callbackQuery2.setFrom(user);
        callbackQuery2.setData("query data");
        callbackQuery2.setInlineMessageId("msg");
        
        assertTrue(callbackQuery.equals(callbackQuery2));
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        User user = new User();
        CallbackQuery callbackQuery = new CallbackQuery();
        callbackQuery.setId("query");
        callbackQuery.setFrom(user);
        callbackQuery.setData("query data");
        
        CallbackQuery callbackQuery2 = new CallbackQuery();
        callbackQuery2.setId("query");
        callbackQuery2.setFrom(user);
        callbackQuery2.setData("query data");
                
        assertEquals(callbackQuery.hashCode(), callbackQuery2.hashCode(), 0.00001);
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        User user = new User();
        CallbackQuery callbackQuery = new CallbackQuery();
        callbackQuery.setId("query");
        callbackQuery.setFrom(user);
        callbackQuery.setData("query data");
        
        CallbackQuery callbackQuery2 = new CallbackQuery();
        callbackQuery2.setId("query2");
        callbackQuery2.setFrom(user);
        callbackQuery2.setData("data");
        
        assertNotEquals(callbackQuery.hashCode(), callbackQuery2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        User user = new User();
        CallbackQuery callbackQuery = new CallbackQuery();
        callbackQuery.setId("query");
        callbackQuery.setFrom(user);
        callbackQuery.setData("data");
        callbackQuery.setInlineMessageId("msgId");
        
        CallbackQuery callbackQuery2 = new CallbackQuery();
        callbackQuery2.setId("query");
        callbackQuery2.setFrom(user);
        callbackQuery2.setData("data");
        callbackQuery2.setInlineMessageId("msg");
                
        assertEquals(callbackQuery.hashCode(), callbackQuery2.hashCode(), 0.00001);
    } 
}
