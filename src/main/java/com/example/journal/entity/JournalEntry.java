package com.example.journal.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
@NoArgsConstructor
public class JournalEntry {
    @Id
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;

}

// //@Document is a Spring Data MongoDB annotation used to mark a Java class as a MongoDB document (collection). It specifies that the class should be stored in a specific collection in the database. By default, the collection name is the class name, but you can customize it using @Document(collection = "customName").