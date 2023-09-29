public class Main {
    public static void main(String[] args) {
        University university = new University();

        university.addCourses(7777, "Physics", "susu",50);
        university.addCourses(11820, "Advance", "mustafa",20);
        university.addStudent("sama", "sama@gmail.com", 7777);
        university.addStudent("yaman", "yaman@gmail.com", 7777);

        String enrollResult = university.studentManagement.enrollStudent(university.getAllStudents(), university.getAllCourses(), 7777, "Physics");
        printResult("Enroll Result", enrollResult);

        // Print the initial course enrollments
       printCourseEnrollments(university);

       String dropResult = university.studentManagement.dropStudent(university.getAllStudents(), university.getAllCourses(), 7777, "Physics");
        printResult("Drop Result", dropResult);

        // Print the updated course enrollments
        printCourseEnrollments(university);
    }

    // Method to print course enrollments
    private static void printCourseEnrollments(University university) {
        for (Courses c : university.getAllCourses()) {
            if (!c.getCourseEnrollment().isEmpty()) {
                System.out.println("Course: " + c.getTitle());
                System.out.println("Maximum Capacity: " + c.getMaxCapacity());
                System.out.println("Enrolled Students:");
                for (Student s : c.getCourseEnrollment()) {
                    System.out.println("Student ID: " + s.getStudentId() + ", Student Name: " + s.getStudentName());
                }
                System.out.println() ; // Add a separator line between courses
            }
        }
    }

    // Method to print a result message
    private static void printResult(String label, String message) {
        System.out.println(label + ": " + message);
    }
}
