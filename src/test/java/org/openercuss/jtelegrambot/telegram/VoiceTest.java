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
public class VoiceTest {

    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        Voice voice = new Voice();
        voice.setFile_id("10");
        voice.setDuration(10);
        assertTrue(voice.equals(voice));
    }

    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        Voice voice = new Voice();
        voice.setFile_id("10");
        voice.setDuration(10);
        Voice voice2 = new Voice();
        voice2.setFile_id("10");
        voice2.setDuration(10);
        assertTrue(voice.equals(voice2));
    }

    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        Voice voice = new Voice();
        voice.setFile_id("10");
        voice.setDuration(10);
        Voice voice2 = new Voice();
        voice2.setFile_id("20");
        voice2.setDuration(20);
        assertFalse(voice.equals(voice2));
    }

    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Voice voice = new Voice();
        voice.setFile_id("10");
        voice.setDuration(10);
        voice.setFile_size(50);
        Voice voice2 = new Voice();
        voice2.setFile_id("10");
        voice2.setDuration(10);
        voice.setFile_size(200);
        assertTrue(voice.equals(voice2));
    }

    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        Voice voice = new Voice();
        voice.setFile_id("10");
        voice.setDuration(10);
        Voice voice2 = new Voice();
        voice2.setFile_id("10");
        voice2.setDuration(10);
        assertEquals(voice.hashCode(), voice2.hashCode());
    }

    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        Voice voice = new Voice();
        voice.setFile_id("10");
        voice.setDuration(10);
        Voice voice2 = new Voice();
        voice2.setFile_id("20");
        voice2.setDuration(20);
        assertNotEquals(voice.hashCode(), voice2.hashCode());
    }

    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Voice voice = new Voice();
        voice.setFile_id("10");
        voice.setDuration(10);
        voice.setFile_size(150);
        Voice voice2 = new Voice();
        voice2.setFile_id("10");
        voice2.setDuration(10);
        voice2.setFile_size(500);
        assertEquals(voice.hashCode(), voice2.hashCode());
    }
}
