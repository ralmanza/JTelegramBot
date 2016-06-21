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

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Mary Garron
 */
public class InlineKeyboardMarkup {

    private List<InlineKeyboardButton> inline_keyboard;

    public List<InlineKeyboardButton> getInline_keyboard() {
        return inline_keyboard;
    }

    public void setInline_keyboard(List<InlineKeyboardButton> inline_keyboard) {
        this.inline_keyboard = inline_keyboard;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.inline_keyboard);
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
        final InlineKeyboardMarkup other = (InlineKeyboardMarkup) obj;
        return Objects.equals(this.inline_keyboard, other.inline_keyboard);
    }
}
