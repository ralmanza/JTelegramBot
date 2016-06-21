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
public class FileTest {

    @Test
    public void testHashCodeSameValues() {
        File file = new File();
        file.setFile_id("84555893634");
        File file2 = new File();
        file2.setFile_id("84555893634");
        assertEquals(file.hashCode(), file2.hashCode());
    }

    @Test
    public void testHashCodeDifferentIds() {
        File file = new File();
        file.setFile_id("84555893634");
        File file2 = new File();
        file2.setFile_id("39765037664");
        assertNotEquals(file.hashCode(), file2.hashCode());
    }

    @Test
    public void testEqualsSameReference() {
        File file = new File();
        file.setFile_id("877664944334");
        File file2 = file;
        file2.setFile_id("973664942334");
        assertEquals(file, file2);
    }

    @Test
    public void testEqualsSameValues() {
        File file = new File();
        file.setFile_id("974540634549");
        File file2 = new File();
        file2.setFile_id("974540634549");
        assertEquals(file, file2);
    }

    @Test
    public void testEqualsDifferentFiles() {
        File file = new File();
        file.setFile_id("325464365");
        File file2 = new File();
        file2.setFile_id("657657654");
        assertNotEquals(file, file2);
    }

    @Test
    public void testEqualsDifferentObjects() {
        File file = new File();
        file.setFile_id("325464365");
        String other = "Other";
        assertNotEquals(file, other);
    }
}
