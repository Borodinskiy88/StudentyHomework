import java.util.Objects;

public class Student {
    protected String name;
    protected String group;
    public String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return name + ", группа " + group + ", номер студенческого: " + studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null && !obj.getClass().equals(Student.class))
            return false;

        Student altStudent = (Student) obj;
        return studentId.equals(altStudent.studentId);
    }
}
