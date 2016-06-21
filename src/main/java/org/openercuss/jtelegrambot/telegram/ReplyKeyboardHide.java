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

/**
 *
 * @author Mary Garron
 */
public class ReplyKeyboardHide {

    private boolean hide_keyboard;

    private boolean selective;

    public boolean isHide_keyboard() {
        return hide_keyboard;
    }

    public void setHide_keyboard(boolean hide_keyboard) {
        this.hide_keyboard = hide_keyboard;
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
        hash = 97 * hash + (this.hide_keyboard ? 1 : 0);
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
        final ReplyKeyboardHide other = (ReplyKeyboardHide) obj;
        return this.hide_keyboard == other.hide_keyboard;
    }
}
