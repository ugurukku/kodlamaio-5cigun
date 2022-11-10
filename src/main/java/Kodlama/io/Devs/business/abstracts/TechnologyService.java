package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.entities.concretes.SubTechnology;
import Kodlama.io.Devs.entities.dtos.TechnologyRequest;

import java.util.List;

public interface TechnologyService {

    List<SubTechnology> getAll();

    SubTechnology getById(int id);

    void deleteById(int id);

    boolean updateById(SubTechnology language, Integer id);

    boolean addTechnology(TechnologyRequest language);

}
