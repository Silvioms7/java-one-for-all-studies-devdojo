package academy.devdojo.javaoneforall.javacore.gassociation.domain;

public class Professor {
    private String name;
    private String researchField;


    public Professor(String name) {
        this.name = name;
    }
    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

}
