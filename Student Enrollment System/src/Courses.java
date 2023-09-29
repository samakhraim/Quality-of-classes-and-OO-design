import java.util.ArrayList;
import java.util.List;

public class Courses {

    private final int code;
    private final String title;
    private final String instructor;
    private int maxCapacity;
    List<Student> enrolledStudents = new ArrayList<>();;

    public Courses(int code, String title, String instructor) {
        this.code = code;
        this.title = title;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
        this.maxCapacity = 0;
    }


    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCourseCode() {
        return code;
    }
    public void setMaxCapacity(int size) {
        this.maxCapacity = size;
    }
    public int getMaxCapacity() {
        return maxCapacity;
    }

        public void updateCapacity(boolean isEnroll, int capacityChange) {

            if (isEnroll) {
                if (maxCapacity < enrolledStudents.size()) {
                    maxCapacity += capacityChange;
                }
            } else {
                maxCapacity -= capacityChange;
            }
        }


    public List<Student> getCourseEnrollment(String courseTitle) {
        if (this.title.equals(courseTitle)) {
            enrolledStudents.addAll(enrolledStudents);
        } else {
            System.out.println("Course not found: " + courseTitle);
        }
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return "Course ID: " + code + ", Course Name: " + title + ", Instructor: " + instructor;
    }


}
