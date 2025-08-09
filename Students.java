import java.util.ArrayList;

public class Students extends Person{
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public Students(String name, String address){
        super(name, address);
    }

    public void addCourseGrade(String course, int grade){
        courses.add(course);
        grades.add(grade);
        numCourses++;
    }

    public void printGrades() {
        for (int i = 0;i < courses.size();i++) {
            System.out.println(courses.get(i) + ": " + grades.get(i));
        }
    }

    public double getAverageGrade(){
        if(grades.isEmpty()) return 0.0;
        int sum = 0;
        for(int grade : grades){
            sum += grade;
        }
        return (double) sum/grades.size();
    }

    @Override
    public String toString(){
        return "Student: " + super.toString();
    }
}
