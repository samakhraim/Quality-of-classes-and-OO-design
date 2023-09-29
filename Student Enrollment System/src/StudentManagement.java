import java.util.List;

public class StudentManagement {

    public String enrollStudent(List<Student> addStudent, List<Courses> addCourses, double id, String title) {
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
            if (courseToAdd.getMaxCapacity() > courseToAdd.getCourseEnrollment().size()) {
                studentToAdd.getStudentCourses().add(courseToAdd);
                courseToAdd.enrolledStudents.add(studentToAdd);
                courseToAdd.updateCapacity();
                return "Student enrolled successfully to the course";
            } else {
                return "Course is already at maximum capacity, enrollment failed";
            }
        } else {
            return "Student or course not found";
        }
    }

    public String dropStudent(List<Student> students, List<Courses> courses, double id, String title) {
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
                courseToRemoveFrom.updateCapacity(); // Decrement capacity when a student is removed
                return "Student dropped successfully";
            } else {
                return "Student was not enrolled in the course";
            }
        } else {
            return "Student or course not found";
        }
    }
}
