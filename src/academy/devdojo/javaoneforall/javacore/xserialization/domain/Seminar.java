package academy.devdojo.javaoneforall.javacore.xserialization.domain;

public class Seminar {
    private String seminar;

    public Seminar(String seminar) {
        this.seminar = seminar;
    }

    @Override
    public String toString() {
        return "Seminar{" +
                "seminar='" + seminar + '\'' +
                '}';
    }

    public String getName() {
        return seminar;
    }

    public void setSeminar(String seminar) {
        this.seminar = seminar;
    }
}
