import java.util.ArrayList;
import java.util.List;

public class Student {
    private final int id;
    private final String name;
    private final String email;
    private final List<Courses> studentCourses;

    public Student(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.studentCourses = new ArrayList<>();
    }

    public int getStudentId() {
        return id;
    }

    public String getStudentName() {
        return name;
    }

    public String getStudentEmail() {
        return email;
    }
    public static Student getStudentById(List<Student> students, int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public List<Courses> getStudentCourses() {

        System.out.println("Courses enrolled by student with ID " + id + ":");
        for (Courses course : studentCourses) {
            System.out.println("Course ID: " + course.getCourseCode() + ", Course Name: " + course.getTitle());
        }
        return studentCourses;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email;
    }
}
