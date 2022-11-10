package Kodlama.io.Devs.entities.dtos;

public class LanguageRequest {


    String name;

    public LanguageRequest() {
    }

    public LanguageRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
