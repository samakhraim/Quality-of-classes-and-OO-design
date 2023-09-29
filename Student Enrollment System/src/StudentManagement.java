import java.util.List;

public class StudentManagement {

    public String enrollStudent(List<Student> addStudent, List<Courses> addCourses, int id, String title) {

        Student studentToAdd = null;
        Courses courseToAdd = null;

        for (Student s : addStudent) {
            if (s.getStudentId() == id) {
                studentToAdd = s;
                break;
            }
        }
        for (Courses c : addCourses) {
            if (c.getTitle().equals(title)) {
                courseToAdd = c;
                break;
            }
        }
        if (studentToAdd != null && courseToAdd != null) {

            if (courseToAdd.getMaxCapacity() >= courseToAdd.getCourseEnrollment().size()) {

                studentToAdd.getStudentCourses().add(courseToAdd);
                courseToAdd.enrolledStudents.add(studentToAdd);
                courseToAdd.updateCapacity(true, 1);

                System.out.println("Capacity of course " + courseToAdd.getTitle() + " updated to: " + courseToAdd.getMaxCapacity());

                return "Student enrolled successfully to the course";
            } else {
                return "Course is already at maximum capacity, enrollment failed";
            }
        } else {
            return "Student or course not found";
        }
    }

    public String dropStudent(List<Student> students, List<Courses> courses, int id, String title) {
        Student studentToRemove = null;
        Courses courseToRemoveFrom = null;

        for (Student student : students) {
            if (student.getStudentId() == id) {
                studentToRemove = student;
                break;
            }
        }

        for (Courses course : courses) {
            if (course.getTitle().equals(title)) {
                courseToRemoveFrom = course;
                break;
            }
        }

        if (studentToRemove != null && courseToRemoveFrom != null) {
            studentToRemove.getStudentCourses().remove(courseToRemoveFrom);
            boolean removed = courseToRemoveFrom.getCourseEnrollment().remove(studentToRemove);
            if (removed) {
                courseToRemoveFrom.updateCapacity(false, 1);

                // Print capacity update
                System.out.println("Capacity of course " + courseToRemoveFrom.getTitle() + " updated to: " + courseToRemoveFrom.getMaxCapacity());

                return "Student dropped successfully";
            } else {
                return "Student was not enrolled in the course";
            }
        } else {
            return "Student or course not found";
        }
    }
}
