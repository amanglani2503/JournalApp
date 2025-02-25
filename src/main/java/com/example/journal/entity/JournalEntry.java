package com.example.journal.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document
public class JournalEntry {
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;

    @Id
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String getContent) {
        this.content = getContent;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}

// //@Document is a Spring Data MongoDB annotation used to mark a Java class as a MongoDB document (collection). It specifies that the class should be stored in a specific collection in the database. By default, the collection name is the class name, but you can customize it using @Document(collection = "customName").