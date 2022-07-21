import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Set<Student> students = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String user;

        while (true) {
            System.out.println("Введите информацию о студенте:");
            System.out.println("ФИО, номер группы, номер студенческого билета,");
            System.out.println("для завершения работы программы введите 'end'");
            user = scanner.nextLine();
            if ("end".equals(user))
                break;
            Student student = addStudent(user);


            if (student == null) {
                System.out.println("Введены некорректные данные:");
                continue;
            }

            // for (Student student1 : students) {
            //     if (student1.studentId.equals(student.studentId)) {
            //         System.out.println("Данный номер студенческого билета уже есть в системе");
            //         System.out.println("Пожалуйста, введите корректные данные!");
            //     }
            // }

            if (students.contains(student)) {
                System.out.println("Такой номер студенческого уже есть!");
                System.out.println("Введите корректные данные.");
            }

            students.add(student);

        }
        for (Student student : students) {
            System.out.println(student);
        }
    }

    protected static Student addStudent(String user) throws Exception {
        String[] rosterStudent = user.split(",");
        if (rosterStudent.length != 3) {
            return null;
        } else {
            return new Student(rosterStudent[0], rosterStudent[1], rosterStudent[2]);
        }
    }

}
