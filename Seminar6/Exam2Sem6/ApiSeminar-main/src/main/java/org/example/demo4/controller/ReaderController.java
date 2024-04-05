package org.example.demo4.controller;

import lombok.RequiredArgsConstructor;
import org.example.demo4.model.Reader;
import org.example.demo4.repo.ReaderRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@RequiredArgsConstructor
public class ReaderController {
    private final ReaderRepo readerRepo;

    @GetMapping
    public List<Reader> getAll(){
        return readerRepo.findAll();
    }

    @PostMapping
    public Reader createReader(@RequestBody Reader reader){
        return readerRepo.save(reader);
    }
}
