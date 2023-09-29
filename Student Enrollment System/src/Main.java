import java.util.List;

public class Main {
    public static void main(String[] args) {

        University university = new University();

        university.addCourses(7777, "Physics", "susu");
        university.addCourses(11820, "Advance", "mustafa");
        university.addStudent("sama", "sama@gmail.com", 7777);
        university.addStudent("yaman", "yaman@gmail.com", 8888);

        String enrollResult = university.studentManagement.enrollStudent(university.getAllStudents(), university.getAllCourses(), 7777, "Physics");
        enrollResult = university.studentManagement.enrollStudent(university.getAllStudents(), university.getAllCourses(), 7777, "Advance");
        enrollResult = university.studentManagement.enrollStudent(university.getAllStudents(), university.getAllCourses(), 8888, "Advance");
        printResult("Enrollment Result \n", enrollResult);
        printResult("\nEnrollment Result ", enrollResult);
        printResult("\nEnrollment Result ", enrollResult);

        // String dropResult = university.studentManagement.dropStudent(university.getAllStudents(), university.getAllCourses(), 7777, "Physics");
        // printResult("Drop Result", dropResult);

        int studentRetrieve = 7777;
        Student retrievedStudent = university.student.getStudentById(university.getAllStudents(), studentRetrieve);
        if (retrievedStudent != null) {
            System.out.println("\nRetrieved student details:");
            System.out.println(retrievedStudent);
            retrievedStudent.getStudentCourses();
        } else {
            System.out.println("\nStudent not found with ID: " + studentRetrieve);
        }

        String Title = "Advance";
        Courses searchedCourse = null;
        for (Courses course : university.getAllCourses()) {
            if (course.getTitle().equals(Title)) {
                searchedCourse = course;
                break;
            }
        }
        if (searchedCourse != null) {
            List<Student> enrolledStudents = searchedCourse.getEnrolledStudents(Title);
            System.out.println("\nEnrolled students in course '" + Title+ "':");
            for (Student student : enrolledStudents) {
                System.out.println(student);
            }
        } else {
            System.out.println("\nCourse not found: " + Title);
        }

        List<Courses> courses = university.getAllCourses();

        System.out.println("\n\nAvailable Course Titles:");

        for (Courses course : courses) {
            System.out.println(course.getTitle());
        }

    }

    private static void printResult(String label, String message) {
        System.out.println(label + "   " + message);
    }
}
