import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Courses duolingo = new Courses("English", 300, 200);
        Courses memrise = new Courses("Japanese", 500, 300);

        System.out.println("Скільки у вас вільного часу в день?");
        Scanner scanner = new Scanner(System.in);
        int freeTime = scanner.nextInt();

        System.out.println(duolingo.isEnoughTime(freeTime));
        System.out.println(memrise.isEnoughTime(freeTime));

        duolingo.isPopular();
        memrise.isPopular();

        Person person = new Person("John Doe", 30, "English");
        Teacher teacher = new Teacher("Jane Smith", "English", 10);

        teacher.introduce();
        teacher.helpPerson(person);




    }
}

