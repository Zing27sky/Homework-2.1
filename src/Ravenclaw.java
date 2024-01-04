public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String faculty, String name, String surName, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(faculty, name, surName, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public String toString() {
        return super.toString() + " " + this.mind + " " + this.wisdom + " " + this.wit + " " + this.creation;
    }
    public void printStudentRavenclaw(){
        System.out.println("Факультет: " + getFaculty() + ". Имя: " + getName() + " " + getSurName()
                + ". Сила магии - " + getPowerOfMagic() + ". Расстояние трансгрессии - " + getTransgressionDistance()
                + ". Ум - " + getMind() + ". Мудрость - " + getWisdom() + ". Остроумие - " + getWit()
                + ". Творчество - " + getCreation());
    }
    public void compare(Ravenclaw otherStudent) {
        int thisScore = this.mind + this.wisdom + this.wit + this.creation;
        int otherScore = otherStudent.mind + otherStudent.wisdom + otherStudent.wit + otherStudent.creation;
        if (thisScore > otherScore) {
            System.out.println(getName() + " " + getSurName() + " Лучший Когтевранец, чем " + otherStudent.getName() + " " + otherStudent.getSurName());
        } else if (thisScore < otherScore) {
            System.out.println(otherStudent.getName() + " " + otherStudent.getSurName() + " Лучший Когтевранец, чем " + getName() + " " + getSurName());
        } else {
            System.out.println("Оба студента равны.");
        }
    }
}

