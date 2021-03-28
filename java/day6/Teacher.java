package day6;

public class Teacher {
    private String name;
    private String subject;
    private String rait;

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setSubject(String subject) {
        this.subject = subject;
        return subject;
    }

    public String getRait() {
        int a = 2;
        int b = 5;
        int random = a + (int) (Math.random() * b);
        switch (random) {
            case 2:
                rait = "неудовлетворительно";
                break;
            case 3:
                rait = "удовлетворительно";
                break;
            case 4:
                rait = "хорошо";
                break;
            case 5:
                rait = "отлично";
                break;
        }
        return rait;
    }
}