package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.dataAccess.abstracts.ITechnologyRepository;
import Kodlama.io.Devs.dataAccess.concretes.LanguageRepository;
import Kodlama.io.Devs.dataAccess.concretes.TechnologyRepository;
import Kodlama.io.Devs.entities.concretes.SubTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyManager implements TechnologyService {

    private final ITechnologyRepository repository;

    @Autowired
    public TechnologyManager(ITechnologyRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<SubTechnology> getAll() {
        return repository.findAll();
    }

    @Override
    public SubTechnology getById(int id) {
        return repository.getById(id);
    }

    @Override
    public void deleteById(int id) {
         repository.deleteById(id);
    }

    @Override
    public boolean updateById(SubTechnology technology) {
        return repository.updateById(technology);
    }

    @Override
    public boolean addTechnology(SubTechnology technology) {
        return repository.addLanguage(technology);
    }
}
