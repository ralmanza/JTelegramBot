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
public class ContactTest {

    @Test
    public void testHashCodeSameValues() {
        Contact contact = new Contact();
        contact.setPhone_number("75445460");
        contact.setFirst_name("Name");
        Contact contact2 = new Contact();
        contact2.setPhone_number("75445460");
        contact2.setFirst_name("Name");
        assertEquals(contact.hashCode(), contact2.hashCode());
    }

    @Test
    public void testHashCodeDifferentPhones() {
        Contact contact = new Contact();
        contact.setPhone_number("72891254");
        contact.setFirst_name("Name");
        Contact contact2 = new Contact();
        contact2.setPhone_number("75445460");
        contact2.setFirst_name("Name");
        assertNotEquals(contact.hashCode(), contact2.hashCode());
    }

    @Test
    public void testHashCodeDifferentNames() {
        Contact contact = new Contact();
        contact.setPhone_number("75445460");
        contact.setFirst_name("Name");
        Contact contact2 = new Contact();
        contact2.setPhone_number("75445460");
        contact2.setFirst_name("Other Name");
        assertNotEquals(contact.hashCode(), contact2.hashCode());
    }

    @Test
    public void testEqualsSameReference() {
        Contact contact = new Contact();
        contact.setPhone_number("75445460");
        contact.setFirst_name("Name");
        Contact contact2 = contact;
        contact.setFirst_name("First name");
        assertEquals(contact, contact2);
    }

    @Test
    public void testEqualsSameValues() {
        Contact contact = new Contact();
        contact.setPhone_number("75445460");
        contact.setFirst_name("Name");
        Contact contact2 = contact;
        contact2.setPhone_number("75445460");
        contact2.setFirst_name("Name");
        assertEquals(contact, contact2);
    }

    @Test
    public void testEqualsDifferentContacts() {
        Contact contact = new Contact();
        contact.setPhone_number("72891254");
        contact.setFirst_name("Name");
        Contact contact2 = new Contact();
        contact2.setPhone_number("75445460");
        contact2.setFirst_name("Name");
        assertNotEquals(contact, contact2);
    }

    @Test
    public void testEqualsDifferentObjects() {
        Contact contact = new Contact();
        contact.setPhone_number("72891254");
        contact.setFirst_name("Name");
        String other = "Other";
        assertNotEquals(contact, other);
    }
}
