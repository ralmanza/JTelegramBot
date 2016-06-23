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

import java.util.Objects;

/**
 *
 * @author Mary Garron
 */
public class KeyboardButton {

    private String text;

    private boolean request_contact;

    private boolean request_location;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isRequest_contact() {
        return request_contact;
    }

    public void setRequest_contact(boolean request_contact) {
        this.request_contact = request_contact;
    }

    public boolean isRequest_location() {
        return request_location;
    }

    public void setRequest_location(boolean request_location) {
        this.request_location = request_location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.text);
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
        final KeyboardButton other = (KeyboardButton) obj;
        return Objects.equals(this.text, other.text);
    }
}
