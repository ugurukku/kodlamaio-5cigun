package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.SubTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITechnologyRepository extends JpaRepository<SubTechnology,Integer> {
//
//    List<SubTechnology> getAll();
//
//    SubTechnology getById(int id);
//
//    boolean deleteById(int id);
//
//    boolean updateById(SubTechnology language);
//
//    boolean addLanguage(SubTechnology language);

}
