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
public class MessageEntityTest {
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setType("msg");
        messageEntity.setOffset(10);
        messageEntity.setLength(50);
        
        assertTrue(messageEntity.equals(messageEntity));                
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setType("msg");
        messageEntity.setOffset(10);
        messageEntity.setLength(50);
        
        MessageEntity messageEntity2 = new MessageEntity();
        messageEntity2.setType("msg");
        messageEntity2.setOffset(10);
        messageEntity2.setLength(50);
        
        assertTrue(messageEntity.equals(messageEntity2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setType("msg");
        messageEntity.setOffset(10);
        messageEntity.setLength(50);
        
        MessageEntity messageEntity2 = new MessageEntity();
        messageEntity2.setType("text");
        messageEntity2.setOffset(20);
        messageEntity2.setLength(80);
        
        assertFalse(messageEntity.equals(messageEntity2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setType("msg");
        messageEntity.setOffset(10);
        messageEntity.setLength(50);
        messageEntity.setUrl("url");
        
        MessageEntity messageEntity2 = new MessageEntity();
        messageEntity2.setType("msg");
        messageEntity2.setOffset(10);
        messageEntity2.setLength(50);
        messageEntity2.setUrl("url2");
        
        assertTrue(messageEntity.equals(messageEntity2));
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setType("msg");
        messageEntity.setOffset(10);
        messageEntity.setLength(50);
                
        MessageEntity messageEntity2 = new MessageEntity();
        messageEntity2.setType("msg");
        messageEntity2.setOffset(10);
        messageEntity2.setLength(50);
        
        assertEquals(messageEntity.hashCode(), messageEntity2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setType("msg");
        messageEntity.setOffset(10);
        messageEntity.setLength(50);
                
        MessageEntity messageEntity2 = new MessageEntity();
        messageEntity2.setType("msg2");
        messageEntity2.setOffset(20);
        messageEntity2.setLength(60);
        
        assertNotEquals(messageEntity.hashCode(), messageEntity2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setType("msg");
        messageEntity.setOffset(10);
        messageEntity.setLength(50);
        messageEntity.setUrl("url");
                
        MessageEntity messageEntity2 = new MessageEntity();
        messageEntity2.setType("msg");
        messageEntity2.setOffset(10);
        messageEntity2.setLength(50);
        messageEntity2.setUrl("url2");
        
        assertEquals(messageEntity.hashCode(), messageEntity2.hashCode()); 
    }     
}
