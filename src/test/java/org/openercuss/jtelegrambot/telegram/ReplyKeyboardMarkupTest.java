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

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 *
 * @author Mary Garron
 */
public class ReplyKeyboardMarkupTest {

    @Test
    public void testHashCodeSameValues() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardButton> keyboardButtonList = new ArrayList();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("Keyboard text");
        keyboardButtonList.add(keyboardButton);
        replyKeyboardMarkup.setKeyboard(keyboardButtonList);
        ReplyKeyboardMarkup replyKeyboardMarkup2 = new ReplyKeyboardMarkup();
        List<KeyboardButton> keyboardButtonList2 = new ArrayList();
        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Keyboard text");
        keyboardButtonList2.add(keyboardButton2);
        replyKeyboardMarkup2.setKeyboard(keyboardButtonList2);
        assertEquals(replyKeyboardMarkup.hashCode(), replyKeyboardMarkup2.hashCode());
    }

    @Test
    public void testHashCodeDifferentInlineKeyboardMarkup() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardButton> keyboardButtonList = new ArrayList();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("Keyboard text");
        keyboardButtonList.add(keyboardButton);
        replyKeyboardMarkup.setKeyboard(keyboardButtonList);
        ReplyKeyboardMarkup replyKeyboardMarkup2 = new ReplyKeyboardMarkup();
        List<KeyboardButton> keyboardButtonList2 = new ArrayList();
        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Other Keyboard text");
        keyboardButtonList2.add(keyboardButton2);
        replyKeyboardMarkup2.setKeyboard(keyboardButtonList2);
        assertNotEquals(replyKeyboardMarkup.hashCode(), replyKeyboardMarkup2.hashCode());
    }

    @Test
    public void testEqualsSameValues() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardButton> keyboardButtonList = new ArrayList();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("Keyboard text");
        keyboardButtonList.add(keyboardButton);
        replyKeyboardMarkup.setKeyboard(keyboardButtonList);
        ReplyKeyboardMarkup replyKeyboardMarkup2 = new ReplyKeyboardMarkup();
        List<KeyboardButton> keyboardButtonList2 = new ArrayList();
        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Keyboard text");
        keyboardButtonList2.add(keyboardButton2);
        replyKeyboardMarkup2.setKeyboard(keyboardButtonList2);
        assertEquals(replyKeyboardMarkup, replyKeyboardMarkup2);
    }

    @Test
    public void testEqualsDifferentInlineKeyboardMarkup() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardButton> keyboardButtonList = new ArrayList();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("Keyboard text");
        keyboardButtonList.add(keyboardButton);
        replyKeyboardMarkup.setKeyboard(keyboardButtonList);
        ReplyKeyboardMarkup replyKeyboardMarkup2 = new ReplyKeyboardMarkup();
        List<KeyboardButton> keyboardButtonList2 = new ArrayList();
        KeyboardButton keyboardButton2 = new KeyboardButton();
        keyboardButton2.setText("Other Keyboard text");
        keyboardButtonList2.add(keyboardButton2);
        replyKeyboardMarkup2.setKeyboard(keyboardButtonList2);
        assertNotEquals(replyKeyboardMarkup, replyKeyboardMarkup2);
    }

}
