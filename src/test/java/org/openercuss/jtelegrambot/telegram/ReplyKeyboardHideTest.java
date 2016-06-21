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
public class ReplyKeyboardHideTest {

    @Test
    public void testHashCodeSameValues() {
        ReplyKeyboardHide replyKeyboardHide = new ReplyKeyboardHide();
        replyKeyboardHide.setHide_keyboard(true);
        ReplyKeyboardHide replyKeyboardHide2 = new ReplyKeyboardHide();
        replyKeyboardHide2.setHide_keyboard(true);
        assertEquals(replyKeyboardHide.hashCode(), replyKeyboardHide2.hashCode());
    }

    @Test
    public void testHashCodeDifferentReplyKeyboardHide() {
        ReplyKeyboardHide replyKeyboardHide = new ReplyKeyboardHide();
        replyKeyboardHide.setHide_keyboard(true);
        ReplyKeyboardHide replyKeyboardHide2 = new ReplyKeyboardHide();
        replyKeyboardHide2.setHide_keyboard(false);
        assertNotEquals(replyKeyboardHide.hashCode(), replyKeyboardHide2.hashCode());
    }

    @Test
    public void testEqualsSameReference() {
        ReplyKeyboardHide replyKeyboardHide = new ReplyKeyboardHide();
        replyKeyboardHide.setHide_keyboard(true);
        ReplyKeyboardHide replyKeyboardHide2 = replyKeyboardHide;
        replyKeyboardHide2.setHide_keyboard(false);
        assertEquals(replyKeyboardHide, replyKeyboardHide2);
    }

    @Test
    public void testEqualsSameValues() {
        ReplyKeyboardHide replyKeyboardHide = new ReplyKeyboardHide();
        replyKeyboardHide.setHide_keyboard(true);
        ReplyKeyboardHide replyKeyboardHide2 = new ReplyKeyboardHide();
        replyKeyboardHide2.setHide_keyboard(true);
        assertEquals(replyKeyboardHide, replyKeyboardHide2);
    }

    @Test
    public void testEqualsDifferentKeyboardHide() {
        ReplyKeyboardHide replyKeyboardHide = new ReplyKeyboardHide();
        replyKeyboardHide.setHide_keyboard(true);
        ReplyKeyboardHide replyKeyboardHide2 = new ReplyKeyboardHide();
        replyKeyboardHide2.setHide_keyboard(false);
        assertNotEquals(replyKeyboardHide, replyKeyboardHide2);
    }
}
