//package Kodlama.io.Devs.dataAccess.concretes;
//
//import Kodlama.io.Devs.dataAccess.abstracts.ILanguageRepository;
//import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
//import Kodlama.io.Devs.entities.dtos.LanguageRequest;
//import org.springframework.stereotype.Repository;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//@Repository
//public class LanguageRepository{
//
//    List<ProgrammingLanguage> languages = new LinkedList<>(Arrays.asList(
//            new ProgrammingLanguage(0, "C#"),
//            new ProgrammingLanguage(1, "Java"),
//            new ProgrammingLanguage(2, "C++"),
//            new ProgrammingLanguage(3, "Python"),
//            new ProgrammingLanguage(4, "GoLang"),
//            new ProgrammingLanguage(5, "PHP")));
//
//    @Override
//    public List<ProgrammingLanguage> getAll() {
//        return languages;
//    }
//
//    @Override
//    public ProgrammingLanguage getById(int id) {
//        return languages.stream()
//                .filter(language -> language.getId() == id).findFirst().orElse(null);
//    }
//
//    @Override
//    public boolean deleteById(int id) {
//        languages.remove(languages.stream().filter(language -> language.getId() == id).findFirst().orElse(null));
//        return true;
//    }
//
//    @Override
//    public boolean updateById(ProgrammingLanguage language) {
//
//        if (language.getName().isEmpty() || language.getName().isBlank()) {
//            throw new IllegalStateException("Type programming language!");
//        }
//
//        languages.forEach(language1 -> {
//                    if (language1.getName().equals(language.getName())) {
//                        throw new IllegalStateException("Programming language already exist!");
//                    }
//                }
//        );
//
//        languages.remove(languages.stream().filter(language1 -> language1.getId().equals(language.getId())).findFirst().orElse(null));
//        languages.add(language);
//        return true;
//    }
//
//    @Override
//    public boolean addLanguage(LanguageRequest language) {
//
//        if (language.getName().isEmpty() || language.getName().isBlank()) {
//            throw new IllegalStateException("Type programming language!");
//        }
//
//        languages.forEach(language1 -> {
//                    if (language1.getName().equals(language.getName())) {
//                        throw new IllegalStateException("Programming language already exist!");
//                    }
//
//                }
//        );
//
//        int max = 0;
//        for (ProgrammingLanguage language1 : languages) {
//            if (language1.getId() > max) {
//                max = language1.getId();
//            }
//
//        }
//
//        max = max + 1;
//        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage(max, language.getName());
//        languages.add(programmingLanguage);
//        return true;
//    }
//}
