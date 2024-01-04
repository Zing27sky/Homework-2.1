public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String faculty, String name, String surName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(faculty, name, surName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String toString() {
        return super.toString() + " " + this.cunning + " " + this.determination + " " + this.ambition + " " + this.resourcefulness + " " + this.lustForPower;
    }
    public void printStudentSlytherin(){
        System.out.println("Факультет: " + getFaculty() + ". Имя: " + getName() + " " + getSurName()
                + ". Сила магии - " + getPowerOfMagic() + ". Расстояние трансгрессии - " + getTransgressionDistance()
                + ". Хитрость - " + getCunning() + ". Решительность - " + getDetermination() + ". Амбициозность - " + getAmbition()
                + ". Находчивость - " + getResourcefulness() + ". Жажда власти - " + getLustForPower());
    }
    public void compare(Slytherin otherStudent) {
        int thisScore = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int otherScore = otherStudent.cunning + otherStudent.determination + otherStudent.ambition + otherStudent.resourcefulness + otherStudent.lustForPower;
        if (thisScore > otherScore) {
            System.out.println(getName() + " " + getSurName() + " Лучший Слизеренец, чем " + otherStudent.getName() + " " + otherStudent.getSurName());
        } else if (thisScore < otherScore) {
            System.out.println(otherStudent.getName() + " " + otherStudent.getSurName() + " Лучший Слизеренец, чем " + getName() + " " + getSurName());
        } else {
            System.out.println("Оба студента равны.");
        }
    }
}
