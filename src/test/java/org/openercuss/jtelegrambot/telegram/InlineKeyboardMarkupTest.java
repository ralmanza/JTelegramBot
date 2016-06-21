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
public class InlineKeyboardMarkupTest {

    @Test
    public void testHashCodeSameValues() {
        List<InlineKeyboardButton> listInlineKeyboardButoon = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("button Name");
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText("button Name2");
        listInlineKeyboardButoon.add(inlineKeyboardButton1);
        listInlineKeyboardButoon.add(inlineKeyboardButton2);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setInline_keyboard(listInlineKeyboardButoon);
        List<InlineKeyboardButton> listInlineKeyboardButoon2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton3.setText("button Name");
        InlineKeyboardButton inlineKeyboardButton4 = new InlineKeyboardButton();
        inlineKeyboardButton4.setText("button Name2");
        listInlineKeyboardButoon2.add(inlineKeyboardButton3);
        listInlineKeyboardButoon2.add(inlineKeyboardButton4);
        InlineKeyboardMarkup inlineKeyboardMarkup2 = new InlineKeyboardMarkup();
        inlineKeyboardMarkup2.setInline_keyboard(listInlineKeyboardButoon2);
        assertEquals(inlineKeyboardMarkup.hashCode(), inlineKeyboardMarkup2.hashCode());
    }

    @Test
    public void testHashCodeDifferentInlineKeyboardMarkup() {
        List<InlineKeyboardButton> listInlineKeyboardButoon = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("button Name");
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText("button Name2");
        listInlineKeyboardButoon.add(inlineKeyboardButton1);
        listInlineKeyboardButoon.add(inlineKeyboardButton2);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setInline_keyboard(listInlineKeyboardButoon);
        List<InlineKeyboardButton> listInlineKeyboardButoon2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton3.setText("button Name");
        listInlineKeyboardButoon2.add(inlineKeyboardButton3);
        InlineKeyboardMarkup inlineKeyboardMarkup2 = new InlineKeyboardMarkup();
        inlineKeyboardMarkup2.setInline_keyboard(listInlineKeyboardButoon2);
        assertNotEquals(inlineKeyboardMarkup.hashCode(), inlineKeyboardMarkup2.hashCode());
    }

    @Test
    public void testEqualsSameReference() {
        List<InlineKeyboardButton> listInlineKeyboardButoon = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("button Name");
        listInlineKeyboardButoon.add(inlineKeyboardButton1);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setInline_keyboard(listInlineKeyboardButoon);
        List<InlineKeyboardButton> listInlineKeyboardButoon2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton();
        inlineKeyboardButton3.setText("button Name3");
        listInlineKeyboardButoon2.add(inlineKeyboardButton3);
        InlineKeyboardMarkup inlineKeyboardMarkup2 = inlineKeyboardMarkup;
        inlineKeyboardMarkup2.setInline_keyboard(listInlineKeyboardButoon2);
        assertEquals(inlineKeyboardMarkup, inlineKeyboardMarkup2);
    }

    @Test
    public void testEqualsSameValues() {
        List<InlineKeyboardButton> listInlineKeyboardButoon = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("button Name");
        listInlineKeyboardButoon.add(inlineKeyboardButton1);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setInline_keyboard(listInlineKeyboardButoon);
        List<InlineKeyboardButton> listInlineKeyboardButoon2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText("button Name");
        listInlineKeyboardButoon2.add(inlineKeyboardButton2);
        InlineKeyboardMarkup inlineKeyboardMarkup2 = new InlineKeyboardMarkup();
        inlineKeyboardMarkup2.setInline_keyboard(listInlineKeyboardButoon2);
        assertEquals(inlineKeyboardMarkup, inlineKeyboardMarkup2);
    }

    @Test
    public void testEqualsDifferentInlineKeyboardMarkup() {
        List<InlineKeyboardButton> listInlineKeyboardButoon = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("button Name");
        listInlineKeyboardButoon.add(inlineKeyboardButton1);
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setInline_keyboard(listInlineKeyboardButoon);
        List<InlineKeyboardButton> listInlineKeyboardButoon2 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton();
        inlineKeyboardButton2.setText("Other Name");
        listInlineKeyboardButoon2.add(inlineKeyboardButton2);
        InlineKeyboardMarkup inlineKeyboardMarkup2 = new InlineKeyboardMarkup();
        inlineKeyboardMarkup2.setInline_keyboard(listInlineKeyboardButoon2);
        assertNotEquals(inlineKeyboardMarkup, inlineKeyboardMarkup2);
    }
}
