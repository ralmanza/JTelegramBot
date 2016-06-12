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
public class UserTest { 
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        User user = new User();
        user.setId(1);
        user.setFirstName("Pedro");
        assertTrue(user.equals(user));
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        User user = new User();
        user.setId(1);
        user.setFirstName("Maria");
        
        User user2 = new User();
        user2.setId(1);
        user2.setFirstName("Maria");
        
        assertTrue(user.equals(user2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        User user = new User();
        user.setId(1);
        user.setFirstName("Pedro");
        
        User user2 = new User();
        user2.setId(2);
        user2.setFirstName("Maria");
        
        assertFalse(user.equals(user2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        User user = new User();
        user.setId(1);
        user.setFirstName("Pedro");
        user.setLastName("Mendez");
        
        User user2 = new User();
        user2.setId(1);
        user2.setFirstName("Pedro");
        user2.setLastName("Lopez");
        
        assertTrue(user.equals(user2));
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        User user = new User();
        user.setId(1);
        user.setFirstName("Maria");
        
        User user2 = new User();
        user2.setId(1);
        user2.setFirstName("Maria");
                
        assertEquals(user.hashCode(), user2.hashCode(), 0.00001);
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        User user = new User();
        user.setId(1);
        user.setFirstName("Maria");
        
        User user2 = new User();
        user2.setId(2);
        user2.setFirstName("Pedro");
                
        assertNotEquals(user.hashCode(), user2.hashCode(), 0.00001);
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        User user = new User();
        user.setId(1);
        user.setFirstName("Maria");
        user.setUserName("mariavf");
        
        User user2 = new User();
        user2.setId(1);
        user2.setFirstName("Maria");
        user2.setUserName("mde123");
                
        assertEquals(user.hashCode(), user2.hashCode(), 0.00001);
    }  
}
