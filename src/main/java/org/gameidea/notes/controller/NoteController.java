package org.gameidea.notes.controller;

import org.gameidea.notes.model.Note;
import org.gameidea.notes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Allow frontend to access API
@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private NoteService service;

    @GetMapping
    public List<Note> getAllNotes() {
        return service.getAllNotes();
    }

    @PostMapping
    public Note createOrUpdate(@RequestBody Note note) {
        return service.createOrUpdate(note);
    }

    @DeleteMapping("/{id}")
    public void deleteNoteById(@PathVariable Long id) {
        service.deleteNoteById(id);
    }
}
