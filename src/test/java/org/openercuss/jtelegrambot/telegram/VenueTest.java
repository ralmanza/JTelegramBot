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
public class VenueTest {

    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        Venue venue = new Venue();
        venue.setTitle("title");
        venue.setAddress("address");
        Location location = new Location();
        venue.setLocation(location);
        assertTrue(venue.equals(venue));
    }

    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        Venue venue = new Venue();
        venue.setTitle("title");
        venue.setAddress("address");
        Location location = new Location();
        venue.setLocation(location);
        Venue venue2 = new Venue();
        venue2.setTitle("title");
        venue2.setAddress("address");
        venue2.setLocation(location);
        assertTrue(venue.equals(venue2));
    }

    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        Venue venue = new Venue();
        venue.setTitle("title");
        venue.setAddress("address");
        Location location = new Location();
        venue.setLocation(location);
        Venue venue2 = new Venue();
        venue2.setTitle("title2");
        venue2.setAddress("address2");
        venue2.setLocation(location);
        assertFalse(venue.equals(venue2));
    }

    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Venue venue = new Venue();
        venue.setTitle("title");
        venue.setAddress("address");
        Location location = new Location();
        venue.setLocation(location);
        venue.setFoursquare_id("");
        Venue venue2 = new Venue();
        venue2.setTitle("title");
        venue2.setAddress("address");
        venue2.setLocation(location);
        venue2.setFoursquare_id("fs");
        assertTrue(venue.equals(venue2));
    }

    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        Venue venue = new Venue();
        venue.setTitle("title");
        venue.setAddress("address");
        Location location = new Location();
        venue.setLocation(location);
        Venue venue2 = new Venue();
        venue2.setTitle("title");
        venue2.setAddress("address");
        venue2.setLocation(location);
        assertEquals(venue.hashCode(), venue2.hashCode());
    }

    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        Venue venue = new Venue();
        venue.setTitle("title");
        venue.setAddress("address");
        Location location = new Location();
        venue.setLocation(location);
        Venue venue2 = new Venue();
        venue2.setTitle("title2");
        venue2.setAddress("address2");
        venue2.setLocation(location);
        assertNotEquals(venue.hashCode(), venue2.hashCode());
    }

    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Venue venue = new Venue();
        venue.setTitle("title");
        venue.setAddress("address");
        venue.setFoursquare_id("fsId");
        Location location = new Location();
        venue.setLocation(location);
        Venue venue2 = new Venue();
        venue2.setTitle("title");
        venue2.setAddress("address");
        venue2.setLocation(location);
        venue2.setFoursquare_id("fsId2");
        assertEquals(venue.hashCode(), venue2.hashCode());
    }
}
