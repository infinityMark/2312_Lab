import java.util.LinkedList;
import java.util.List;

public abstract class Controller {
    private static List<Course> courseList;

    public Controller() {
        courseList = new LinkedList<>();
    }

    protected void printCourses() {
		System.out.print("Course List: ");
		for(Course c : courseList) {
			System.out.printf("[%s] ",c);
		}
		System.out.println();
	}

    public Course searchCourse(Course c) {
        for (Course course: courseList)
            if (course.toString().equals(c.toString()))
                return course;
        return null;
    }

    public List<Course> getCoursesAccess() {
        return courseList;
    }

    public Course isPreCourse(Course course) {
        for (Course c : courseList) {
            List<Course> preRequisites = c.getPreRequisites();
            if (preRequisites != null && preRequisites.contains(course)) {
                return c;
            }
        }
        return null;
    }
}
