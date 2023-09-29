import java.util.ArrayList;
import java.util.List;
public class Student {
    private final double id;
    private final String name;
    private final String email;
    private final List<Courses> studentCourses;

    public Student(String name,String email,int id ){

        this.name=name;
        this.email=email;
        this.id=id;
        this.studentCourses = new ArrayList<Courses>();
    }

    public double getStudentId(){
        return id;
    }
    public String getStudentName(){
        return name;
    }
    public String getStudentEmail(){
        return email;
    }

    //print all courses for single student or specific
    public List<Courses> getStudentCourses(){

        return studentCourses;
    }
    @Override
    public String toString(){

        return " ID: " + id + ", Name: " + name + ",  Email: " + email ;

    }
}
