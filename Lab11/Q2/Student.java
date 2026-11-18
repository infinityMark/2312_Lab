import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

public class Student implements Comparable<Student>{
    private String id;
    private Set<Course> joinCourses;

    public Student(String str) {
        id = str;
        joinCourses = new TreeSet<>();
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

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(Student arg0) {
        return this.id.compareTo(arg0.id);
    }
}