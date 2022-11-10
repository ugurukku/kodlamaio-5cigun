package Kodlama.io.Devs.dataAccess.abstracts;


import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.dtos.LanguageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ILanguageRepository extends JpaRepository<ProgrammingLanguage,Integer> {

//    List<ProgrammingLanguage> getAll();
//
//    ProgrammingLanguage getById(int id);
//
//    boolean deleteById(int id);
//
//    boolean updateById(ProgrammingLanguage language);
//
//    boolean addLanguage(LanguageRequest language);

}
