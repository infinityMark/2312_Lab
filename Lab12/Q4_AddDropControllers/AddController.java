import java.util.List;

public class AddController extends Controller{
    private Controller controller;

    public AddController(Controller controller) {
        this.controller = controller;
    }
	
	public void process(Course c) {	
		if (super.searchCourse(c) != null) return;

        super.getCoursesAccess().add(0, c);
        for (Course pCourse: c.getPreRequisites())
            process(pCourse);
	}
}