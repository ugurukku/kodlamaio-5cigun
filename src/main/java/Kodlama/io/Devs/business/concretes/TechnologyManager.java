package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.dataAccess.abstracts.ITechnologyRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.concretes.SubTechnology;
import Kodlama.io.Devs.entities.dtos.TechnologyRequest;
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
    public boolean updateById(SubTechnology technology, Integer id) {
        repository.deleteById(id);
        repository.save(technology);
        return true;
    }

    @Override
    public boolean addTechnology(TechnologyRequest technology) {
        repository.
                save(
                        new SubTechnology(
                                null, technology.getName(),
                                new ProgrammingLanguage(technology.getLanguageId(),
                                        null
                                )
                        ));
        return true;
    }
}
