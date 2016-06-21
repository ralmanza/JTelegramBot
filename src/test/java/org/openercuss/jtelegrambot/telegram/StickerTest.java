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
public class StickerTest {
    
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        Sticker sticker = new Sticker();
        sticker.setFile_id("fileId");
        sticker.setHeight(10);
        sticker.setWidth(20);        
        assertTrue(sticker.equals(sticker));
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        Sticker sticker = new Sticker();
        sticker.setFile_id("fileId");
        sticker.setHeight(10);
        sticker.setWidth(20);        
        Sticker sticker2 = new Sticker();
        sticker2.setFile_id("fileId");
        sticker2.setHeight(10);
        sticker2.setWidth(20);        
        assertTrue(sticker.equals(sticker2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        Sticker sticker = new Sticker();
        sticker.setFile_id("fileId");
        sticker.setHeight(10);
        sticker.setWidth(20);        
        Sticker sticker2 = new Sticker();
        sticker2.setFile_id("fileId2");
        sticker2.setHeight(50);
        sticker2.setWidth(60);        
        assertFalse(sticker.equals(sticker2));     
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Sticker sticker = new Sticker();
        sticker.setFile_id("fileId");
        sticker.setHeight(10);
        sticker.setWidth(20);
        sticker.setFileSize(100);        
        Sticker sticker2 = new Sticker();
        sticker2.setFile_id("fileId");
        sticker2.setHeight(10);
        sticker2.setWidth(20);
        sticker2.setFileSize(200);        
        assertTrue(sticker.equals(sticker2));       
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        Sticker sticker = new Sticker();
        sticker.setFile_id("fileId");
        sticker.setHeight(10);
        sticker.setWidth(20);        
        Sticker sticker2 = new Sticker();
        sticker2.setFile_id("fileId");
        sticker2.setHeight(10);
        sticker2.setWidth(20);        
        assertEquals(sticker.hashCode(), sticker2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        Sticker sticker = new Sticker();
        sticker.setFile_id("fileId");
        sticker.setHeight(10);
        sticker.setWidth(20);
        Sticker sticker2 = new Sticker();
        sticker2.setFile_id("fileId2");
        sticker2.setHeight(50);
        sticker2.setWidth(60);        
        assertNotEquals(sticker.hashCode(), sticker2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Sticker sticker = new Sticker();
        sticker.setFile_id("fileId");
        sticker.setHeight(10);
        sticker.setWidth(20);
        sticker.setFileSize(100);        
        Sticker sticker2 = new Sticker();
        sticker2.setFile_id("fileId");
        sticker2.setHeight(10);
        sticker2.setWidth(20);
        sticker2.setFileSize(200);        
        assertEquals(sticker.hashCode(), sticker2.hashCode());
    }        
}
