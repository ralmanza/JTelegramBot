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
public class UserTest { 
    
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        User user = new User();
        user.setId(1);
        user.setFirst_name("Pedro");
        assertTrue(user.equals(user));
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        User user = new User();
        user.setId(1);
        user.setFirst_name("Maria");        
        User user2 = new User();
        user2.setId(1);
        user2.setFirst_name("Maria");        
        assertTrue(user.equals(user2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        User user = new User();
        user.setId(1);
        user.setFirst_name("Pedro");        
        User user2 = new User();
        user2.setId(2);
        user2.setFirst_name("Maria");        
        assertFalse(user.equals(user2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        User user = new User();
        user.setId(1);
        user.setFirst_name("Pedro");
        user.setLast_name("Mendez");        
        User user2 = new User();
        user2.setId(1);
        user2.setFirst_name("Pedro");
        user2.setLast_name("Lopez");        
        assertTrue(user.equals(user2));
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        User user = new User();
        user.setId(1);
        user.setFirst_name("Maria");        
        User user2 = new User();
        user2.setId(1);
        user2.setFirst_name("Maria");                
        assertEquals(user.hashCode(), user2.hashCode(), 0.00001);
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        User user = new User();
        user.setId(1);
        user.setFirst_name("Maria");        
        User user2 = new User();
        user2.setId(2);
        user2.setFirst_name("Pedro");                
        assertNotEquals(user.hashCode(), user2.hashCode(), 0.00001);
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        User user = new User();
        user.setId(1);
        user.setFirst_name("Maria");
        user.setUser_name("mariavf");        
        User user2 = new User();
        user2.setId(1);
        user2.setFirst_name("Maria");
        user2.setUser_name("mde123");                
        assertEquals(user.hashCode(), user2.hashCode(), 0.00001);
    }
}
