public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гриффиндор", "Гарри", "Поттер", 85, 56, 15, 65, 32);
        Gryffindor hermioneGranger = new Gryffindor("Гриффиндор", "Гермиона", "Грейнджер", 65, 45, 78, 35, 59);
        Gryffindor ronWeasley = new Gryffindor("Гриффиндор", "Рон", "Уизли", 58, 26, 56, 95, 75);
        harryPotter.printStudentGryffindor();
        hermioneGranger.printStudentGryffindor();
        ronWeasley.printStudentGryffindor();
        System.out.println();

        Hufflepuff zachariasSmith = new Hufflepuff("Пуффендуй","Захария","Смит",84,59,26,35,48);
        Hufflepuff cedricDiggory = new Hufflepuff("Пуффендуй","Седрик","Диггори",75,65,49,84,69);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Пуффендуй","Джастин","Финч-Флетчли",57,69,49,95,39);
        zachariasSmith.printStudentHufflepuff();
        cedricDiggory.printStudentHufflepuff();
        justinFinchFletchley.printStudentHufflepuff();
        System.out.println();

        Ravenclaw choChang = new Ravenclaw("Когтевран","Чжоу","Чанг",85,87,76,92,35,65);
        Ravenclaw padmaPatil = new Ravenclaw("Когтевран","Падма","Патил",63,58,67,29,68,95);
        Ravenclaw marcusBelby = new Ravenclaw("Когтевран","Маркус","Белби",54,58,35,59,75,69);
        choChang.printStudentRavenclaw();
        padmaPatil.printStudentRavenclaw();
        marcusBelby.printStudentRavenclaw();
        System.out.println();

        Slytherin dracoMalfoy = new Slytherin("Слизерин","Драко","Малфой",65,59,54,18,86,54,92);
        Slytherin grahamMontague = new Slytherin("Слизерин","Грэхэм","Монтегю",36,64,29,97,78,54,85);
        Slytherin gregoryGoyle = new Slytherin("Слизерин", "Грегори","Гойл",35,53,61,59,67,84,68);
        dracoMalfoy.printStudentSlytherin();
        grahamMontague.printStudentSlytherin();
        gregoryGoyle.printStudentSlytherin();
        System.out.println();
    }
}