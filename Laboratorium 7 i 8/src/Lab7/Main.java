package Lab7;

public class Main {

    public static void main(String[] args) {


        new Student ("Antek", "Nowak", 102400);
        new Student ("Jan", "Kowalski", 102401);
        new Student ("Henryk", "Walezy", 102402);
        new Student ("Adam", "Małysz", 102403);
        new Student ("Krzysztof", "Kalisz", 102404);
        new Student ("Bogusław", "Pazura", 102405);

        System.out.println("liczba studentow w bazie: " + Student.getLiczbaStudentow());
        System.out.println(Student.getStudent(3));


        Test.utworzStudent();
        System.out.println(Student.getStudent(7));

    }
}
