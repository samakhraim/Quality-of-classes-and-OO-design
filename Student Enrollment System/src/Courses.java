import java.util.ArrayList;
import java.util.List;
public class Courses {

    private final int code;
    private final String title;
    private final  String instructor;
    private int maxCapacity;
    List<Student> enrolledStudents;

    public Courses(int code,String title,String instructor ,int maxCapacity){
        this.code=code;
        this.title=title;
        this.instructor=instructor;
        this.enrolledStudents = new ArrayList<>();
        this.maxCapacity =maxCapacity;
    }
    public String getTitle(){
        return title;
    }
    public String getInstructor(){
        return instructor;
    }
    public int getCourseCode(){
        return code;
    }
    public void setMaxCapacity(int size){
        this.maxCapacity=size;
    }
    public int getMaxCapacity(){

        return maxCapacity;
    }
    public void  updateCapacity(){

        maxCapacity++;

    }


    public List<Student> getCourseEnrollment(){

        return enrolledStudents;
    }
    @Override
    public String toString(){
        return "Course ID: " + code + ", Course Name: " + title + ", Instructor: " + instructor ;

    }
}
