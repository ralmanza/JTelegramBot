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
public class ChatMemberTest {
    
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        ChatMember chatMember = new ChatMember();
        chatMember.setUser(new User());
        chatMember.setStatus("away");        
        assertTrue(chatMember.equals(chatMember));
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        ChatMember chatMember = new ChatMember();
        chatMember.setUser(new User());
        chatMember.setStatus("away");        
        ChatMember chatMember2 = new ChatMember();
        chatMember2.setUser(new User());
        chatMember2.setStatus("away");        
        assertTrue(chatMember.equals(chatMember2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        User user = new User();
        user.setId(1);
        ChatMember chatMember = new ChatMember();        
        chatMember.setUser(user);
        chatMember.setStatus("away");        
        User user2 = new User();
        user2.setId(2);
        ChatMember chatMember2 = new ChatMember();
        chatMember2.setUser(user2);
        chatMember2.setStatus("away");        
        assertFalse(chatMember.equals(chatMember2));    
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        User user = new User();
        user.setId(1);
        ChatMember chatMember = new ChatMember();        
        chatMember.setUser(user);
        chatMember.setStatus("away");        
        ChatMember chatMember2 = new ChatMember();        
        chatMember2.setUser(user);
        chatMember2.setStatus("away");        
        assertEquals(chatMember.hashCode(), chatMember2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        User user = new User();
        user.setId(1);
        ChatMember chatMember = new ChatMember();        
        chatMember.setUser(user);
        chatMember.setStatus("away");        
        User user2 = new User();
        user.setId(2);
        ChatMember chatMember2 = new ChatMember();        
        chatMember2.setUser(user2);
        chatMember2.setStatus("in-line");        
        assertNotEquals(chatMember.hashCode(), chatMember2.hashCode());
    }    
}
