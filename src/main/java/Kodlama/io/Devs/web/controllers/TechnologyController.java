package Kodlama.io.Devs.web.controllers;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.entities.concretes.SubTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {

    private final TechnologyService service;

    @Autowired
    public TechnologyController(TechnologyService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<SubTechnology> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public boolean addNewTechnology(@RequestBody SubTechnology technology) {
        return service.addTechnology(technology);
    }

    @PostMapping("/update")
    public boolean updateTechnology(@RequestBody SubTechnology technology) {
        return service.updateById(technology);
    }

    @DeleteMapping("/remove/{id}")
    public boolean deleteTechnologyById(@PathVariable("id") Integer id) {
        return service.deleteById(id);
    }

    @GetMapping("/{id}")
    public SubTechnology getTechnologyById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }


}
