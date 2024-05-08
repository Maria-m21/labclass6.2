public class Teacher {
    String name;
    String language;
    int experience;

    public Teacher(String name, String language, int experience) {
        this.name = name;
        this.language = language;
        this.experience = experience;
    }

    void introduce() {
        System.out.println("Я " + name + ", вчитель мови " + language + ". У мене " + experience + " років досвіду викладання.");
    }

    void helpPerson(Person person) {
        System.out.println("Я можу допомогти " + person.name + " покращити його знання " + language + ".");
        person.chooseLevel();

        int level = person.getLevel();
        if (level != 0) {
            System.out.println("Я можу рекомендувати вам деякі вправи та ресурси для вашого рівня " + level + ":");

            switch (level) {
                case 1:
                    System.out.println("- Використовуйте онлайн-ресурси для початківців, такі як Duolingo або Memrise.");
                    System.out.println("- Читайте прості книги та статті мовою, яку вивчаєте.");
                    System.out.println("- Спілкуйтеся з носіями мови, якщо можливо.");
                    break;
                case 2:
                    System.out.println("- Дивіться фільми та серіали мовою, яку вивчаєте, з субтитрами.");
                    System.out.println("- Слухайте подкасти та музику мовою, яку вивчаєте.");
                    System.out.println("- Спробуйте читати більш складні тексти та статті.");
                    break;
                case 3:
                    System.out.println("- Читайте книги та статті в оригіналі.");
                    System.out.println("- Спілкуйтеся з носіями мови на складні теми.");
                    System.out.println("- Спробуйте писати тексти та вести щоденник мовою, яку вивчаєте.");
                    break;
                default:
                    System.out.println("Невідомий рівень. Рекомендації недоступні.");
            }
        }
    }
}