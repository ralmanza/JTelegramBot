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
public class LocationTest {

    @Test
    public void testHashCodeSameValues() {
        Location location = new Location();
        location.setLatitude(935435.35f);
        location.setLongitude(87853.536f);
        Location location2 = new Location();
        location2.setLatitude(935435.35f);
        location2.setLongitude(87853.536f);
        assertEquals(location.hashCode(), location2.hashCode());
    }

    @Test
    public void testHashCodeDifferentLocations() {
        Location location = new Location();
        location.setLatitude(935435.35f);
        location.setLongitude(87853.536f);
        Location location2 = new Location();
        location2.setLatitude(9745844.35f);
        location2.setLongitude(677.54f);
        assertNotEquals(location.hashCode(), location2.hashCode());
    }

    @Test
    public void testEqualsSameReference() {
        Location location = new Location();
        location.setLatitude(935435.35f);
        location.setLongitude(87853.536f);
        Location location2 = location;
        location2.setLatitude(935435.35f);
        location2.setLongitude(87853.536f);
        assertEquals(location, location2);
    }

    @Test
    public void testEqualsSameValues() {
        Location location = new Location();
        location.setLatitude(935435.35f);
        location.setLongitude(87853.536f);
        Location location2 = new Location();
        location2.setLatitude(935435.35f);
        location2.setLongitude(87853.536f);
        assertEquals(location, location2);
    }

    @Test
    public void testEqualsDifferentLocations() {
        Location location = new Location();
        location.setLatitude(935435.35f);
        location.setLongitude(87853.536f);
        Location location2 = new Location();
        location2.setLatitude(9745844.35f);
        location2.setLongitude(677.54f);
        assertNotEquals(location, location2);
    }
}
