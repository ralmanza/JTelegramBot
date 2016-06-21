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
public class InlineKeyboardButton {

    private String text;

    private String url;

    private String callback_data;

    private String switch_inline_query;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCallback_data() {
        return callback_data;
    }

    public void setCallback_data(String callback_data) {
        this.callback_data = callback_data;
    }

    public String getSwitch_inline_query() {
        return switch_inline_query;
    }

    public void setSwitch_inline_query(String switch_inline_query) {
        this.switch_inline_query = switch_inline_query;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.text);
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
        final InlineKeyboardButton other = (InlineKeyboardButton) obj;
        return Objects.equals(this.text, other.text);
    }
}
