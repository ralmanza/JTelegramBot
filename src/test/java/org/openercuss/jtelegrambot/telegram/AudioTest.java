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
public class AudioTest {
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        Audio audio = new Audio();
        audio.setFileId("file1");
        audio.setDuration(10);
        assertTrue(audio.equals(audio));
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        Audio audio = new Audio();
        audio.setFileId("file1");
        audio.setDuration(30);
        
        Audio audio2 = new Audio();
        audio2.setFileId("file1");
        audio2.setDuration(30);
        
        assertTrue(audio.equals(audio2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        Audio audio = new Audio();
        audio.setFileId("file1");
        audio.setDuration(10);
        
        Audio audio2 = new Audio();
        audio2.setFileId("file2");
        audio2.setDuration(20);
        
        assertFalse(audio.equals(audio2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Audio audio = new Audio();
        audio.setFileId("file1");
        audio.setDuration(10);
        audio.setTitle("title");
        audio.setPerformer("high");
        
        Audio audio2 = new Audio();
        audio2.setFileId("file1");
        audio2.setDuration(10);
        audio2.setPerformer("low");
        audio2.setFileSize(12);
        
        assertTrue(audio.equals(audio2));
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        Audio audio = new Audio();
        audio.setFileId("file1");
        audio.setDuration(15);
        
        Audio audio2 = new Audio();
        audio2.setFileId("file1");
        audio2.setDuration(15);
                
        assertEquals(audio.hashCode(), audio2.hashCode(), 0.00001);
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        Audio audio = new Audio();
        audio.setFileId("file1");
        audio.setDuration(50);
        
        Audio audio2 = new Audio();
        audio2.setFileId("file2");
        audio2.setDuration(50);
                
        assertNotEquals(audio.hashCode(), audio2.hashCode(), 0.00001);
    }    
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Audio audio = new Audio();
        audio.setFileId("file1");
        audio.setDuration(50);
        audio.setPerformer("high");
        
        Audio audio2 = new Audio();
        audio2.setFileId("file1");
        audio2.setDuration(50);
        audio2.setPerformer("low");
                
        assertEquals(audio.hashCode(), audio2.hashCode(), 0.00001);
    }    
}
