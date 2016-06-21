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
public class MessageTest {
    
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        Message message = new Message();
        message.setMessage_id(1);
        message.setDate(15);
        message.setChat(new Chat()); 
        assertTrue(message.equals(message));       
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        Message message = new Message();
        message.setMessage_id(1);
        message.setDate(15);
        Chat chat = new Chat();
        message.setChat(chat);
        Message message2 = new Message();
        message2.setMessage_id(1);
        message2.setDate(15);
        message2.setChat(chat);
        assertTrue(message.equals(message2));  
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        Message message = new Message();
        message.setMessage_id(1);
        message.setDate(15);
        Chat chat = new Chat();
        message.setChat(chat);
        Message message2 = new Message();
        message2.setMessage_id(2);
        message2.setDate(45);
        message2.setChat(chat);
        assertFalse(message.equals(message2));  
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Message message = new Message();
        message.setMessage_id(1);
        message.setDate(15);
        Chat chat = new Chat();
        message.setChat(chat);
        message.setCaption("caption");
        Message message2 = new Message();
        message2.setMessage_id(1);
        message2.setDate(15);
        message2.setChat(chat);
        message2.setCaption("other caption");
        assertTrue(message.equals(message2));  
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        Message message = new Message();
        message.setMessage_id(1);
        message.setDate(15);
        Chat chat = new Chat();
        message.setChat(chat);
        Message message2 = new Message();
        message2.setMessage_id(1);
        message2.setDate(15);
        message2.setChat(chat);
        assertEquals(message.hashCode(), message2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        Message message = new Message();
        message.setMessage_id(1);
        message.setDate(15);
        Chat chat = new Chat();
        message.setChat(chat);
        Message message2 = new Message();
        message2.setMessage_id(10);
        message2.setDate(8);
        message2.setChat(chat);
        assertNotEquals(message.hashCode(), message2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Message message = new Message();
        message.setMessage_id(1);
        message.setDate(15);
        Chat chat = new Chat();
        message.setChat(chat);
        message.setText("Hello world");
        Message message2 = new Message();
        message2.setMessage_id(1);
        message2.setDate(15);
        message2.setChat(chat);
        message2.setForward_date(4);
        message2.setEdit_date(5);
        assertEquals(message.hashCode(), message2.hashCode());
    }        
}
