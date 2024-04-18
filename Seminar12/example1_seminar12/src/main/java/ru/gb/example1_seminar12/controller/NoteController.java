package ru.gb.example1_seminar12.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.gb.example1_seminar12.model.Note;
import ru.gb.example1_seminar12.services.FileGateway;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Ну, это наш рест контролёр
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/notes")
public class NoteController {
    private final FileGateway fileGateway;


    /**
     * Добавить заметку
     * @param note заметка
     * @return заметка
     */
    @PostMapping
    public ResponseEntity<Note> addNote(@RequestBody Note note) {
        note.setCreation(LocalDateTime.now());
        fileGateway.writeToFile(note.getTitle() + ".txt", note.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
