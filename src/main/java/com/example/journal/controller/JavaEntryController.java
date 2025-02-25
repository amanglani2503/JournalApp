package com.example.journal.controller;

import com.example.journal.entity.JournalEntry;
import com.example.journal.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JavaEntryController {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry entry){
        journalEntryService.saveEntry(entry) ;
        return entry;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getById(@PathVariable ObjectId myId){
        return journalEntryService.findById(myId).orElse(null);
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteJournalEntry(@PathVariable ObjectId myId){
        journalEntryService.deleteById(myId);
        return true;
    }

    @PutMapping("id/{myId}")
    public void updateJournalEntry(@PathVariable ObjectId myId, @RequestBody JournalEntry entry){
        journalEntryService.updateById(myId, entry);
    }
}