import java.util.Set;
import java.util.HashSet;

public class Student{
    private String id;
    private Set<Course> joinCourses;

    public Student(String str) {
        id = str;
        joinCourses = new HashSet<>();
    }

    void takeCourse(Course course, String date){
        joinCourses.add(course);
        course.addStudents(date, this);
    }

    boolean hasBeenClassmateOf(Student anotherStudent){
        for (Course course : joinCourses) {
            if (course.searchByStudentName(this, anotherStudent)){
                return true;
            }
        }
        return false;
    }
}