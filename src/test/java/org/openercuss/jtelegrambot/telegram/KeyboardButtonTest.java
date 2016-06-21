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
public class KeyboardButtonTest {

    @Test
    public void testHashCodeSameValues() {
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("Keyboard button text");
        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Keyboard button text");
        assertEquals(keyboardButton.hashCode(), keyboardButton2.hashCode());
    }

    @Test
    public void testHashCodeDifferentTexts() {
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("Keyboard button text");
        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Other Keyboard button text");
        assertNotEquals(keyboardButton.hashCode(), keyboardButton2.hashCode());
    }

    @Test
    public void testEqualsSameReference() {
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("Keyboard button text");
        KeyboardButton keyboardButton2 = keyboardButton;
        keyboardButton2.setText("Other Keyboard button text");
        assertEquals(keyboardButton, keyboardButton2);
    }

    @Test
    public void testEqualsSameValues() {
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("Keyboard button text");
        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Keyboard button text");
        assertEquals(keyboardButton, keyboardButton2);
    }

    @Test
    public void testEqualsDifferentKeyboardButtons() {
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("Keyboard button text");
        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Other Keyboard button text");
        assertNotEquals(keyboardButton, keyboardButton2);
    }
}
