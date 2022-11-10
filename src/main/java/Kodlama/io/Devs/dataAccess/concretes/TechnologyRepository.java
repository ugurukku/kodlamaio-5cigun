//package Kodlama.io.Devs.dataAccess.concretes;
//
//import Kodlama.io.Devs.dataAccess.abstracts.ITechnologyRepository;
//import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
//import Kodlama.io.Devs.entities.concretes.SubTechnology;
//import org.springframework.stereotype.Repository;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//@Repository
//public class TechnologyRepository {
//
//    List<SubTechnology> technologies = new LinkedList<>(Arrays.asList(
//            new SubTechnology(null,"JSP",new ProgrammingLanguage(1,null)),
//            new SubTechnology(null,"Spring",new ProgrammingLanguage(1,null)),
//            new SubTechnology(null,"DJANGO",new ProgrammingLanguage(3,null)),
//            new SubTechnology(null,"Laravel",new ProgrammingLanguage(5,null)),
//            new SubTechnology(null,".NET",new ProgrammingLanguage(0,null)),
//            new SubTechnology(null,"ADO.NET",new ProgrammingLanguage(0,null))));
//
//    @Override
//    public List<SubTechnology> getAll() {
//        return technologies;
//    }
//
//    @Override
//    public SubTechnology getById(int id) {
//        return technologies.stream()
//                .filter(language -> language.getId() == id).findFirst().orElse(null);
//    }
//
//    @Override
//    public boolean deleteById(int id) {
//        technologies.remove(technologies.stream().filter(technology -> technology.getId() == id).findFirst().orElse(null));
//        return true;
//    }
//
//    @Override
//    public boolean updateById(SubTechnology technology) {
//
//        if (technology.getName().isEmpty() || technology.getName().isBlank()) {
//            throw new IllegalStateException("Type programming language!");
//        }
//
//        technologies.forEach(technology1 -> {
//                    if (technology1.getName().equals(technology.getName())) {
//                        throw new IllegalStateException("Technology already exist!");
//                    }
//                }
//        );
//
//        technologies.remove(technologies.stream().filter(language1 -> language1.getId().equals(technology.getId())).findFirst().orElse(null));
//        technologies.add(technology);
//        return true;
//    }
//
//    @Override
//    public boolean addLanguage(SubTechnology technology) {
//
//        if (technology.getName().isEmpty() || technology.getName().isBlank()) {
//            throw new IllegalStateException("Type Technology!");
//        }
//
//        technologies.forEach(technology1 -> {
//                    if (technology1.getName().equals(technology.getName())) {
//                        throw new IllegalStateException("Technology already exist!");
//                    }
//
//                }
//        );
//
//        int max = 0;
//        for (SubTechnology technology1 : technologies) {
//            if (technology1.getId() > max) {
//                max = technology1.getId();
//            }
//
//        }
//
//        max = max + 1;
//        SubTechnology technology1 = new SubTechnology(max, technology.getName(),technology.getLanguage());
//        technologies.add(technology1);
//        return true;
//    }
//}
