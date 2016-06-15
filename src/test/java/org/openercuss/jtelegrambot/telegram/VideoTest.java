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
public class VideoTest {
    
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        Video video = new Video();
        video.setFileId("fileId");
        video.setWidth(10);
        video.setHeight(10);
        video.setDuration(10);        
        assertTrue(video.equals(video));
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        Video video = new Video();
        video.setFileId("fileId");
        video.setWidth(10);
        video.setHeight(10);
        video.setDuration(10);        
        Video video2 = new Video();
        video2.setFileId("fileId");
        video2.setWidth(10);
        video2.setHeight(10);
        video2.setDuration(10);        
        assertTrue(video.equals(video2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        Video video = new Video();
        video.setFileId("fileId");
        video.setWidth(10);
        video.setHeight(10);
        video.setDuration(10);        
        Video video2 = new Video();
        video2.setFileId("fileId2");
        video2.setWidth(20);
        video2.setHeight(20);
        video2.setDuration(20);        
        assertFalse(video.equals(video2));  
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Video video = new Video();
        video.setFileId("fileId");
        video.setWidth(10);
        video.setHeight(10);
        video.setDuration(10);
        video.setMimeType("mimeType");        
        Video video2 = new Video();
        video2.setFileId("fileId");
        video2.setWidth(10);
        video2.setHeight(10);
        video2.setDuration(10);
        video.setMimeType("mimeType2");        
        assertTrue(video.equals(video2));    
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        Video video = new Video();
        video.setFileId("fileId");
        video.setWidth(10);
        video.setHeight(10);
        video.setDuration(10);        
        Video video2 = new Video();
        video2.setFileId("fileId");
        video2.setWidth(10);
        video2.setHeight(10);
        video2.setDuration(10);        
        assertEquals(video.hashCode(), video2.hashCode()); 
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        Video video = new Video();
        video.setFileId("fileId");
        video.setWidth(10);
        video.setHeight(10);
        video.setDuration(10);        
        Video video2 = new Video();
        video2.setFileId("fileId2");
        video2.setWidth(10);
        video2.setHeight(10);
        video2.setDuration(20);        
        assertNotEquals(video.hashCode(), video2.hashCode()); 
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Video video = new Video();
        video.setFileId("fileId");
        video.setWidth(10);
        video.setHeight(10);
        video.setDuration(10);
        video.setMimeType("mimeType");        
        Video video2 = new Video();
        video2.setFileId("fileId");
        video2.setWidth(10);
        video2.setHeight(10);
        video2.setDuration(10);
        video.setMimeType("mimeType2");        
        assertEquals(video.hashCode(), video2.hashCode());
    }
}
