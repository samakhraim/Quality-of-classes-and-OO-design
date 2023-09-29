import java.util.ArrayList;
import java.util.List;
public class University implements IReport{

    public String name;
    public String location ;
    List<Student> addStudent=new ArrayList<Student>();
    List<Courses> addCourses=new ArrayList<Courses>();
    public void addStudent(String name,String email,int id ){

     Student newStudent=new Student(name,email,id);
    }
    public void addCourses(int code, String title, String instructor){
       Courses newCourse=new Courses(code ,title ,instructor) ;

              addCourses.add(newCourse);

    }
    public String  getAllCourses(){

        return addCourses.toString();
    }

    public String generateAllReports() {
        return null;
    }
}
