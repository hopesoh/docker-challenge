package com.soat.dockerchallenge.app;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class LanguagesController {

    private LanguageRepository languageRepository;

    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<Language>> list() {
        return ResponseEntity.ok(languageRepository.findAll());
    }

    @PostMapping(path="/add")
    public ResponseEntity<String> add(@RequestParam String name) {
        if (languageRepository.existsByName(name)) return ResponseEntity.badRequest().body("Already exists a language with this name");
        languageRepository.save(new Language(name));
        return ResponseEntity.ok("Saved");
    }
}
