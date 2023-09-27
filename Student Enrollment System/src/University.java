import java.util.ArrayList;
import java.util.List;
public class University implements IReport{

    public String name;
    public String location ;
    List<Student> addStudent=new ArrayList<Student>();
    List<Courses> addCourses=new ArrayList<Courses>();

    public String addStudent(Student student){

        addStudent.add(student);
        return addStudent.toString();
    }
    public String addCourses(Courses courses){
         addCourses.add(courses);
        return addCourses.toString();
    }
    public String  getAllCourses(){

        return null;
    }

    public String generateAllReports() {
        return null;
    }
}
