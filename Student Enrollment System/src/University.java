import java.util.ArrayList;
import java.util.List;
public class University implements IReport{

    StudentManagement studentManagement = new StudentManagement();
    Student student;
    Courses courses = new Courses(0, "", "");;
   private final List<Student> addStudent=new ArrayList<Student>();
   private final List<Courses> addCourses=new ArrayList<Courses>();

    public void  addStudent(String name,String email,int id ){

        Student newStudent=new Student(name,email,id);
        addStudent.add(newStudent);
    }

    public void addCourses(int code, String title, String instructor){

       Courses newCourse=new Courses(code ,title ,instructor);
       addCourses.add(newCourse);
    }
    public List<Student>  getAllStudents(){

        return addStudent;
    }
    public List<Courses> getAllCourses() {
        List<String> courseTitles = new ArrayList<>();
        for (Courses course : addCourses) {
            courseTitles.add(course.getTitle());
        }
        return addCourses;
    }

        public String generateAllReports() {

        return null;
    }


}
