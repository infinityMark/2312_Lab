import java.util.List;

public class DropController extends Controller{
    private Controller controller;

    public DropController(Controller controller) {
        this.controller = controller;
    }

	public void printCourses() {
		super.printCourses();
	}
	
    // @Override 
	public void process(Course c) 
    throws 
    ExCourseNotFound, 
    ExPrerequisiteForAnother
    {
        if (super.searchCourse(c) == null)
            throw new ExCourseNotFound("Cannot drop " + c +" (Course doesn't exist in the list)");

        Course course = isPreCourse(c);
        if (course != null)
            throw new ExPrerequisiteForAnother("Cannot drop " + c +" (Required for " + course + ")");
		super.getCoursesAccess().remove(c);
	}
}
