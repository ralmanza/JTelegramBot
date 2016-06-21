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

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Roberto Almanza
 */
public class Message {

    private int message_id;

    private User from;

    private int date;

    private Chat chat;

    private User forward_from;

    private Chat forward_from_chat;

    private int forward_date;

    private Message reply_to_message;

    private int edit_date;

    private String text;

    private List<MessageEntity> entities;

    private Audio audio;

    private Document document;

    private List<PhotoSize> photo;

    private Sticker sticker;

    private Video video;

    private Voice voice;

    private String caption;

    private Contact contact;

    private Location location;

    private Venue venue;

    private User new_chat_member;

    private User left_chat_member;

    private String new_chat_title;

    private List<PhotoSize> new_chat_photo;

    private boolean delete_chat_photo;

    private boolean group_chat_created;

    private boolean supergroup_chat_created;

    private boolean channel_chat_created;

    private int migrate_to_chat_id;

    private int migrate_from_chat_id;

    private Message pinner_message;

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public User getForward_from() {
        return forward_from;
    }

    public void setForward_from(User forward_from) {
        this.forward_from = forward_from;
    }

    public Chat getForward_from_chat() {
        return forward_from_chat;
    }

    public void setForward_from_chat(Chat forward_from_chat) {
        this.forward_from_chat = forward_from_chat;
    }

    public int getForward_date() {
        return forward_date;
    }

    public void setForward_date(int forward_date) {
        this.forward_date = forward_date;
    }

    public Message getReply_to_message() {
        return reply_to_message;
    }

    public void setReply_to_message(Message reply_to_message) {
        this.reply_to_message = reply_to_message;
    }

    public int getEdit_date() {
        return edit_date;
    }

    public void setEdit_date(int edit_date) {
        this.edit_date = edit_date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Voice getVoice() {
        return voice;
    }

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public User getNew_chat_member() {
        return new_chat_member;
    }

    public void setNew_chat_member(User new_chat_member) {
        this.new_chat_member = new_chat_member;
    }

    public User getLeft_chat_member() {
        return left_chat_member;
    }

    public void setLeft_chat_member(User left_chat_member) {
        this.left_chat_member = left_chat_member;
    }

    public String getNew_chat_title() {
        return new_chat_title;
    }

    public void setNew_chat_title(String new_chat_title) {
        this.new_chat_title = new_chat_title;
    }

    public List<PhotoSize> getNew_chat_photo() {
        return new_chat_photo;
    }

    public void setNew_chat_photo(List<PhotoSize> new_chat_photo) {
        this.new_chat_photo = new_chat_photo;
    }

    public boolean isDelete_chat_photo() {
        return delete_chat_photo;
    }

    public void setDelete_chat_photo(boolean delete_chat_photo) {
        this.delete_chat_photo = delete_chat_photo;
    }

    public boolean isGroup_chat_created() {
        return group_chat_created;
    }

    public void setGroup_chat_created(boolean group_chat_created) {
        this.group_chat_created = group_chat_created;
    }

    public boolean isSupergroup_chat_created() {
        return supergroup_chat_created;
    }

    public void setSupergroup_chat_created(boolean supergroup_chat_created) {
        this.supergroup_chat_created = supergroup_chat_created;
    }

    public boolean isChannel_chat_created() {
        return channel_chat_created;
    }

    public void setChannel_chat_created(boolean channel_chat_created) {
        this.channel_chat_created = channel_chat_created;
    }

    public int getMigrate_to_chat_id() {
        return migrate_to_chat_id;
    }

    public void setMigrate_to_chat_id(int migrate_to_chat_id) {
        this.migrate_to_chat_id = migrate_to_chat_id;
    }

    public int getMigrate_from_chat_id() {
        return migrate_from_chat_id;
    }

    public void setMigrate_from_chat_id(int migrate_from_chat_id) {
        this.migrate_from_chat_id = migrate_from_chat_id;
    }

    public Message getPinner_message() {
        return pinner_message;
    }

    public void setPinner_message(Message pinner_message) {
        this.pinner_message = pinner_message;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.message_id;
        hash = 23 * hash + this.date;
        hash = 23 * hash + Objects.hashCode(this.chat);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        return this.message_id == other.message_id
                && this.date == other.date
                && Objects.equals(this.chat, other.chat);
    }
}
