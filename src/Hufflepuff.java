public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String faculty, String name, String surName, int powerOfMagic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(faculty, name, surName, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String toString() {
        return super.toString() + " " + this.hardWork + " " + this.loyalty + " " + this.honesty;

    }
    public void printStudentHufflepuff(){
        System.out.println("Факультет: " + getFaculty() + ". Имя: " + getName() + " " + getSurName()
                + ". Сила магии - " + getPowerOfMagic() + ". Расстояние трансгрессии - " + getTransgressionDistance()
                + ". Трудолюбие - " + getHardWork() + ". Верность - " + getLoyalty() + ". Честность - " + getHonesty());
    }

}
