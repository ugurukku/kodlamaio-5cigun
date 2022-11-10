package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ILanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.dtos.LanguageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private final ILanguageRepository repository;

    @Autowired
    public LanguageManager(ILanguageRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return repository.findAll();
    }

    @Override
    public ProgrammingLanguage getLanguageById(int id) {
        return repository.getById(id);
    }

    @Override
    public void deleteLanguageById(int id) {
        repository.deleteById(id);
    }

    @Override
    public boolean updateLanguage(ProgrammingLanguage language, Integer id) {
        repository.deleteById(id);
        repository.save(language);
        return true;
    }

    @Override
    public boolean addLanguage(LanguageRequest language) {
        repository.save(new ProgrammingLanguage(null, language.getName()));
        return true;
    }
}
