
public class Main {
    public static void main(String[] args) {


            Student student = new Student("sama khraim", "samakhraim12@gmail.com", 11820435);
            Courses course = new Courses(1175, "Algorithm", "Amjad");
            University university=new University();

            student.setStudentCourses(course);
            course.setCourseEnrollment(student);

            String AddStudent= university.addStudent(student);
            String StudentEnrolmentList=course.getCourseEnrollment();
            String  coursesEnrolmentList = student.getStudentCourses();


            System.out.println("Students Courses: " + coursesEnrolmentList);

            System.out.println("Students: " + StudentEnrolmentList);



    }
}