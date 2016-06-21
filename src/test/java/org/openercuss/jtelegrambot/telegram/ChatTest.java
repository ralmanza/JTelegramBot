/*
 * Copyright 2016 the original author or authors. (http://ctolavi.github.io/JTelegramBot)
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
import static org.junit.Assert.assertNotEquals;

/**
 *
 * @author Mary Garron
 */
public class ChatTest {

    @Test
    public void testHashCodeSameValues() {
        Chat chat = new Chat();
        chat.setId(20);
        chat.setType("typeChanel");
        Chat chat2 = new Chat();
        chat2.setId(20);
        chat2.setType("typeChanel");
        assertEquals(chat.hashCode(), chat2.hashCode());
    }

    @Test
    public void testHashCodeDifferentIds() {
        Chat chat = new Chat();
        chat.setId(20);
        Chat chat2 = new Chat();
        chat2.setId(10);
        assertNotEquals(chat.hashCode(), chat2.hashCode());
    }

    @Test
    public void testHashCodeDifferentTypes() {
        Chat chat = new Chat();
        chat.setId(20);
        chat.setType("FirstType");
        Chat chat2 = new Chat();
        chat2.setId(20);
        chat2.setType("SecondType");
        assertNotEquals(chat.hashCode(), chat2.hashCode());
    }

    @Test
    public void testEqualsSameReference() {
        Chat chat = new Chat();
        chat.setId(20);
        Chat chat2 = chat;
        chat2.setId(40);
        assertEquals(chat2, chat);
    }

    @Test
    public void testEqualsDifferentChats() {
        Chat chat = new Chat();
        chat.setId(22);
        Chat chat2 = new Chat();
        chat2.setId(40);
        assertNotEquals(chat2, chat);
    }

    @Test
    public void testEqualsDifferentObjects() {
        Chat chat = new Chat();
        chat.setId(20);
        chat.setType("type");
        String other = "Other";
        assertNotEquals(other, chat);
    }
}
