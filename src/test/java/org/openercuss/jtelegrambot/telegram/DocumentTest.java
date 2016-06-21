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
public class DocumentTest {
    
    @Test
    public void testEqualsWithTheSameInstansAsAParameter() {
        Document document = new Document();
        document.setFile_id("file1");
        document.setFile_name("doc1");        
        assertTrue(document.equals(document));
    }    
    
    @Test
    public void testEqualsOfTwoInstanceWithSameValues() {
        Document document = new Document();
        document.setFile_id("file1");
        document.setFile_name("doc1");        
        Document document2 = new Document();
        document2.setFile_id("file1");
        document2.setFile_name("doc1");        
        assertTrue(document.equals(document2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithDifferentValues() {
        Document document = new Document();
        document.setFile_id("file1");
        document.setFile_name("doc1");        
        Document document2 = new Document();
        document2.setFile_id("file2");
        document2.setFile_name("doc2");        
        assertFalse(document.equals(document2));
    }
    
    @Test
    public void testEqualsOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Document document = new Document();
        document.setFile_id("file1");
        document.setFile_name("doc1");        
        Document document2 = new Document();
        document2.setFile_id("file1");
        document2.setFile_name("doc2");        
        assertTrue(document.equals(document2));        
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameValues() {
        Document document = new Document();
        document.setFile_id("file1");
        document.setFile_name("doc1");        
        Document document2 = new Document();
        document2.setFile_id("file1");
        document2.setFile_name("doc1");        
        assertEquals(document.hashCode(), document2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithDifferentValues() {
        Document document = new Document();
        document.setFile_id("file1");
        document.setFile_name("doc1");        
        Document document2 = new Document();
        document2.setFile_id("file2");
        document2.setFile_name("doc2");        
        assertNotEquals(document.hashCode(), document2.hashCode());
    }
    
    @Test
    public void testHashCodeOfTwoInstanceWithSameRequiredValuesAndDifferentOptionalValues() {
        Document document = new Document();
        document.setFile_id("file1");
        document.setFile_name("doc1");        
        Document document2 = new Document();
        document2.setFile_id("file1");
        document2.setFile_name("doc2");        
        assertEquals(document.hashCode(), document2.hashCode());        
    }     
}
