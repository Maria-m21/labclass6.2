public class Courses {

    String language;
    int price;
    int levelA2Time;
    String level;

    public Courses(String language, int price, int levelA2Time) {
        this.language = language;
        this.price = price;
        this.levelA2Time = levelA2Time;
    }

    String isEnoughTime(int time) {
        if (price > time) {
            return "У вас недостатньо часу для вивчення " + language;
        } else return "У вас достатньо часу для вивчення " + language;
    }

    void isPopular() {
        if (price < 100 && levelA2Time < 50) {
            System.out.println(language + " є популярним курсом.");
        } else {
            System.out.println(language + " не є популярним курсом.");
        }
    }

    void findLevel(Person person) {
        if (level.equals(person.level)) {

        }
    }


}