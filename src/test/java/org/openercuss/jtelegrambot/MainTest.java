/*
 * Copyright 2016 the original author or authors. (http://ctolavi.github.io/JTelegramBot)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openercuss.jtelegrambot;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Crispin Tolavi
 */
public class MainTest {

    /**
     * Test of sayHello method, of class Main.
     */
    @Test
    public void testSayHello() {
        Main instance = new Main();
        String expResult = "Hello";
        String result = instance.sayHello();
        assertEquals(expResult, result);
    }

}
