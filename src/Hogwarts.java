public class Hogwarts {
    private String faculty;
    private String name;
    private String surName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String faculty, String name, String surName, int powerOfMagic, int transgressionDistance) {
        this.faculty = faculty;
        this.name = name;
        this.surName = surName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String toString() {
        return this.faculty + " " + this.name + " " + this.surName + " " + this.powerOfMagic + " " + this.transgressionDistance;
    }

}

