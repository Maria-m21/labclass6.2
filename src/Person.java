import java.util.Scanner;
public class Person {
    String name;
    int age;
    int level;
    String language;

    public Person(String name, int age,String language){
        this.name = name;
        this.age = age;
        this.language = language;
        this.level = 0;
    }

    public int getLevel() {

        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    void chooseLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть свій рівень " + language + ":");
        System.out.println("1 -  Beginner");
        System.out.println("2 -  Intermediate ");
        System.out.println("3 -  Advanced");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                setLevel(1);
                break;
            case 2:
                setLevel(2);
                break;
            case 3:
                setLevel(3);
                break;
            default:
                System.out.println("Неправильний вибір. Рівень не змінено.");
        }
    }
}
