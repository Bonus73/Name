package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        String res = teacher.getRait();
        String nameT = teacher.setName("Ti");
        String nameS = student.setName("Bo");
        String subj = teacher.setSubject("Biology");
        System.out.println("Преподаватель " + nameT + " оценил студента с именем " + nameS + " по предмету " +
                subj + " на оценку " + res);
    }
}