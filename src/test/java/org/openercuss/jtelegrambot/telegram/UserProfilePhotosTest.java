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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author Roberto Almanza
 */
public class UserProfilePhotosTest {
    
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        List<PhotoSize> photos = new ArrayList();
        List<List<PhotoSize>> list = new ArrayList();
        list.add(photos);
        photos.add(new PhotoSize());
        UserProfilePhotos userProfilePhotos = new UserProfilePhotos();
        userProfilePhotos.setTotalCount(10);
        userProfilePhotos.setPhotos(list);        
        assertTrue(userProfilePhotos.equals(userProfilePhotos));
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        List<PhotoSize> photos = new ArrayList();
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("1");
        photos.add(photoSize);
        List<List<PhotoSize>> list = new ArrayList();
        list.add(photos);
        UserProfilePhotos userProfilePhotos = new UserProfilePhotos();
        userProfilePhotos.setTotalCount(10);
        userProfilePhotos.setPhotos(list);
        List<PhotoSize> photos2 = new ArrayList();
        PhotoSize photoSize2 = new PhotoSize();
        photoSize2.setFileId("1");
        photos2.add(photoSize2);
        List<List<PhotoSize>> list2 = new ArrayList();
        list2.add(photos2);
        UserProfilePhotos userProfilePhotos2 = new UserProfilePhotos();
        userProfilePhotos2.setTotalCount(10);
        userProfilePhotos2.setPhotos(list2);
        assertTrue(userProfilePhotos.equals(userProfilePhotos2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        List<PhotoSize> photos = new ArrayList();
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("1");
        photos.add(photoSize);
        List<List<PhotoSize>> list = new ArrayList();
        list.add(photos);
        UserProfilePhotos userProfilePhotos = new UserProfilePhotos();
        userProfilePhotos.setTotalCount(10);
        userProfilePhotos.setPhotos(list);
        List<PhotoSize> photos2 = new ArrayList();
        PhotoSize photoSize2 = new PhotoSize();
        photoSize2.setFileId("1");
        photos2.add(photoSize);
        photos2.add(photoSize2);
        List<List<PhotoSize>> list2 = new ArrayList();
        list2.add(photos2);
        UserProfilePhotos userProfilePhotos2 = new UserProfilePhotos();
        userProfilePhotos2.setTotalCount(10);
        userProfilePhotos2.setPhotos(list2);
        assertFalse(userProfilePhotos.equals(userProfilePhotos2));
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        List<PhotoSize> photos = new ArrayList();
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("1");
        photos.add(photoSize);
        List<List<PhotoSize>> list = new ArrayList();
        list.add(photos);
        UserProfilePhotos userProfilePhotos = new UserProfilePhotos();
        userProfilePhotos.setTotalCount(10);
        userProfilePhotos.setPhotos(list);
        List<PhotoSize> photos2 = new ArrayList();
        PhotoSize photoSize2 = new PhotoSize();
        photoSize2.setFileId("1");
        photos2.add(photoSize2);
        List<List<PhotoSize>> list2 = new ArrayList();
        list2.add(photos2);
        UserProfilePhotos userProfilePhotos2 = new UserProfilePhotos();
        userProfilePhotos2.setTotalCount(10);
        userProfilePhotos2.setPhotos(list2);
        assertEquals(userProfilePhotos.hashCode(), userProfilePhotos2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        List<PhotoSize> photos = new ArrayList();
        PhotoSize photoSize = new PhotoSize();
        photoSize.setFileId("1");
        photos.add(photoSize);
        List<List<PhotoSize>> list = new ArrayList();
        list.add(photos);
        UserProfilePhotos userProfilePhotos = new UserProfilePhotos();
        userProfilePhotos.setTotalCount(10);
        userProfilePhotos.setPhotos(list);
        List<PhotoSize> photos2 = new ArrayList();
        PhotoSize photoSize2 = new PhotoSize();
        photoSize2.setFileId("2");
        photos2.add(photoSize2);
        List<List<PhotoSize>> list2 = new ArrayList();
        list2.add(photos2);
        UserProfilePhotos userProfilePhotos2 = new UserProfilePhotos();
        userProfilePhotos2.setTotalCount(10);
        userProfilePhotos2.setPhotos(list2);
        assertNotEquals(userProfilePhotos.hashCode(), userProfilePhotos2.hashCode());
    }
}
