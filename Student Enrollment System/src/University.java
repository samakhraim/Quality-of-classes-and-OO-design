import java.util.ArrayList;
import java.util.List;
public class University implements IReport{

    StudentManagement studentManagement = new StudentManagement();
    List<Student> addStudent=new ArrayList<Student>();
    List<Courses> addCourses=new ArrayList<Courses>();

    public void  addStudent(String name,String email,int id ){

        Student newStudent=new Student(name,email,id);
        addStudent.add(newStudent);

    }
    public void addCourses(int code, String title, String instructor,int maxCapacity){

       Courses newCourse=new Courses(code ,title ,instructor,maxCapacity);
       addCourses.add(newCourse);
    }
    public List<Student>  getAllStudents(){

        return addStudent;
    }
    public List<Courses>  getAllCourses(){

        return addCourses;
    }

    public String generateAllReports() {

        return null;
    }


}
