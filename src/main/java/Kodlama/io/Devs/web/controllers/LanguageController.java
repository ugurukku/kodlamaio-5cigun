package Kodlama.io.Devs.web.controllers;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.dtos.LanguageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    LanguageService service;

    @Autowired
    public LanguageController(LanguageService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<ProgrammingLanguage> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public boolean addNewLanguage(@RequestBody LanguageRequest language) {
        return service.addLanguage(language);
    }

    @PostMapping("/update")
    public boolean updateLanguage(@RequestBody ProgrammingLanguage language) {
        return service.updateLanguage(language);
    }

    @DeleteMapping("/remove/{id}")
    public void updateLanguage(@PathVariable("id") Integer id) {
        return service.deleteLanguageById(id);
    }

    @GetMapping("/{id}")
    public ProgrammingLanguage getLanguageById(@PathVariable("id") Integer id) {
        return service.getLanguageById(id);
    }

}
