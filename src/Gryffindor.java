public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String faculty, String name, String surName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(faculty, name, surName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.nobility + " " + this.honor + " " + this.bravery;
    }

    public void printStudentGryffindor() {
        System.out.println("Факультет: " + getFaculty() + ". Имя: " + getName() + " " + getSurName() + ". Сила магии - " + getPowerOfMagic()
                + ". Расстояние трансгрессии - " + getTransgressionDistance()
                + ". Благородство - " + getNobility() + ". Честь - " + getHonor() + ". Храбрость - " + getBravery());
    }
}
