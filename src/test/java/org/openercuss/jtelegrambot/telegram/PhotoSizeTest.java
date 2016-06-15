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
public class PhotoSizeTest {
    
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("fileId");
        photoSize.setHeight(10);
        photoSize.setWidth(20);        
        assertTrue(photoSize.equals(photoSize));
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("fileId");
        photoSize.setHeight(10);
        photoSize.setWidth(20);        
        PhotoSize photoSize2 = new PhotoSize();
        photoSize2.setFileId("fileId");
        photoSize2.setHeight(10);
        photoSize2.setWidth(20);        
        assertTrue(photoSize.equals(photoSize2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("fileId");
        photoSize.setHeight(10);
        photoSize.setWidth(20);        
        PhotoSize photoSize2 = new PhotoSize();
        photoSize2.setFileId("fileId2");
        photoSize2.setHeight(50);
        photoSize2.setWidth(60);        
        assertFalse(photoSize.equals(photoSize2));     
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("fileId");
        photoSize.setHeight(10);
        photoSize.setWidth(20);
        photoSize.setFileSize(100);        
        PhotoSize photoSize2 = new PhotoSize();
        photoSize2.setFileId("fileId");
        photoSize2.setHeight(10);
        photoSize2.setWidth(20);
        photoSize2.setFileSize(200);        
        assertTrue(photoSize.equals(photoSize2));       
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("fileId");
        photoSize.setHeight(10);
        photoSize.setWidth(20);        
        PhotoSize photoSize2 = new PhotoSize();
        photoSize2.setFileId("fileId");
        photoSize2.setHeight(10);
        photoSize2.setWidth(20);        
        assertEquals(photoSize.hashCode(), photoSize2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("fileId");
        photoSize.setHeight(10);
        photoSize.setWidth(20);
        PhotoSize photoSize2 = new PhotoSize();
        photoSize2.setFileId("fileId2");
        photoSize2.setHeight(50);
        photoSize2.setWidth(60);        
        assertNotEquals(photoSize.hashCode(), photoSize2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("fileId");
        photoSize.setHeight(10);
        photoSize.setWidth(20);
        photoSize.setFileSize(100);        
        PhotoSize photoSize2 = new PhotoSize();
        photoSize2.setFileId("fileId");
        photoSize2.setHeight(10);
        photoSize2.setWidth(20);
        photoSize2.setFileSize(200);        
        assertEquals(photoSize.hashCode(), photoSize2.hashCode());
    }
}
