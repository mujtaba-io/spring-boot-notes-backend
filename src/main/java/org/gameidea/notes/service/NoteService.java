package org.gameidea.notes.service;

import org.gameidea.notes.model.Note;
import org.gameidea.notes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository repository;

    public List<Note> getAllNotes() {
        return repository.findAll();
    }

    public Note createOrUpdate(Note note) {
        return repository.save(note);
    }

    public void deleteNoteById(Long id) {
        repository.deleteById(id);
    }
}
