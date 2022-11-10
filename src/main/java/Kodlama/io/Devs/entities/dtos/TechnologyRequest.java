package Kodlama.io.Devs.entities.dtos;

public class TechnologyRequest {

    String name;

    Integer languageId;

    public TechnologyRequest() {
    }

    public TechnologyRequest(String name, Integer languageId) {
        this.name = name;
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }
}
