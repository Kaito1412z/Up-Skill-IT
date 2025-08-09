
import java.util.ArrayList;

public class Teacher extends Person{
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<>();

    public Teacher(String name, String address){
        super(name, address);
    }

    public boolean addCourse(String course){
        if(courses.contains(course)){
            System.out.println("The course already existed.");
            return false;
        }
        else{
            courses.add(course);
            return true;
        }
    }

    public boolean removeCourse(String course){
        if(!courses.contains(course)){
            System.out.println("The course does not exist.");
            return false;
        }
        else{
            courses.remove(course);
            return true;
        }
    }

    @Override
    public String toString(){
        return "Teacher: " + super.toString();
    }
}
