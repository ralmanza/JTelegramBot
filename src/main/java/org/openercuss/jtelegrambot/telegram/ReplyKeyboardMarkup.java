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
public class ReplyKeyboardMarkup {

    private List<KeyboardButton> keyboard;

    private boolean resize_keyboard;

    private boolean one_time_keyboard;

    private boolean selective;

    public List<KeyboardButton> getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(List<KeyboardButton> keyboard) {
        this.keyboard = keyboard;
    }

    public boolean isResize_keyboard() {
        return resize_keyboard;
    }

    public void setResize_keyboard(boolean resize_keyboard) {
        this.resize_keyboard = resize_keyboard;
    }

    public boolean isOne_time_keyboard() {
        return one_time_keyboard;
    }

    public void setOne_time_keyboard(boolean one_time_keyboard) {
        this.one_time_keyboard = one_time_keyboard;
    }

    public boolean isSelective() {
        return selective;
    }

    public void setSelective(boolean selective) {
        this.selective = selective;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.keyboard);
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
        final ReplyKeyboardMarkup other = (ReplyKeyboardMarkup) obj;
        return Objects.equals(this.keyboard, other.keyboard);
    }

}
