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

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Roberto Almanza
 */
public class UserProfilePhotos {
    
    private int total_count;

    private List<List<PhotoSize>> photos;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public List<List<PhotoSize>> getPhotos() {
        return photos;
    }

    public void setPhotos(List<List<PhotoSize>> photos) {
        this.photos = photos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.total_count;
        hash = 13 * hash + Objects.hashCode(this.photos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
        
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserProfilePhotos other = (UserProfilePhotos) obj;
        return this.total_count == other.total_count &&
            Objects.equals(this.photos, other.photos);
    }    
}
