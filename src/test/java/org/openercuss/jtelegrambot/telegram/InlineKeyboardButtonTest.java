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
public class InlineKeyboardButtonTest {

    @Test
    public void testHashCodeSameValues() {
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("button Name");
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText("button Name");
        assertEquals(inlineKeyboardButton.hashCode(), inlineKeyboardButton2.hashCode());
    }

    @Test
    public void testHashCodeDifferentTexts() {
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("button Name");
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText("button Name2");
        assertNotEquals(inlineKeyboardButton.hashCode(), inlineKeyboardButton2.hashCode());
    }

    @Test
    public void testEqualsSameReference() {
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("button Name");
        InlineKeyboardButton inlineKeyboardButton2 = inlineKeyboardButton;
        inlineKeyboardButton2.setText("button Name2");
        assertEquals(inlineKeyboardButton, inlineKeyboardButton2);
    }

    @Test
    public void testEqualsSameValues() {
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("button Name");
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText("button Name");
        assertEquals(inlineKeyboardButton, inlineKeyboardButton2);
    }

    @Test
    public void testEqualsDifferentInlineButtons() {
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("button Name");
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText("button Name2");
        assertNotEquals(inlineKeyboardButton, inlineKeyboardButton2);
    }

    @Test
    public void testEqualsDifferentObjects() {
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("button Name");
        String other = "Other";
        assertNotEquals(inlineKeyboardButton, other);
    }
}
