package academy.devdojo.javaoneforall.javacore.gassociation.domain;

public class Students {
    private String names;
    private int ages;
    private Seminars[] seminars;

    public Students(String names, int ages) {
        this.names = names;
        this.ages = ages;
    }

    public Students(String names, int ages, Seminars[] seminars) {
        this.names = names;
        this.ages = ages;
        this.seminars = seminars;
    }

    public String getNames() {
        return names;
    }
    public void setNames(String names) {
        this.names = names;
    }
    public int getAges() {
        return ages;
    }
    public void setAges(int ages) {
        this.ages = ages;
    }

    public Seminars[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminars[] seminars) {
        this.seminars = seminars;
    }
}
