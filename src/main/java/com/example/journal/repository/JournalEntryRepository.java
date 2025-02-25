package com.example.journal.repository;

import com.example.journal.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {
}

// MongoRepository in Spring Boot is used for performing CRUD operations on MongoDB without writing boilerplate code. It extends MongoRepository<T, ID> or CrudRepository<T, ID>, providing built-in methods like save(), findById(), findAll(), and deleteById().