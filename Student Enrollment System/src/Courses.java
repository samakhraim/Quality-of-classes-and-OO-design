import java.util.ArrayList;
import java.util.List;
public class Courses {

    private final int code;
    private final String title;
    private final  String instructor;
    private  int maxCapacity;
    List<Student> enrolledStudents;

    public Courses(int code,String title,String instructor){
        this.code=code;
        this.title=title;
        this.instructor=instructor;
        this.enrolledStudents=new ArrayList<Student >();
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
    public void updateCapacity(){


    }
    public void  setCourseEnrollment(Student student){
        enrolledStudents.add(student);

    }

    public String  getCourseEnrollment(){

        return enrolledStudents.toString();
    }
    @Override
    public String toString(){
        return "Course ID: " + code + ", Course Name: " + title + ", Instructor: " + instructor ;

    }
}
