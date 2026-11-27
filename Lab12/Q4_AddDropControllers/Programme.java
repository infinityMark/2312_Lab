import java.util.ArrayList;
import java.util.List;

public class Programme {
    private Controller controller;
	private AddController addAgent;
	private DropController dropAgent;

	public Programme() {		
		addAgent = new AddController(controller);
		dropAgent = new DropController(controller);
	}

	public void add(Course c) {
		addAgent.process(c);
		addAgent.printCourses();
	}

	public void drop(Course c) {
        try {
            dropAgent.process(c);
		    dropAgent.printCourses();
        } catch (ExCourseNotFound | ExPrerequisiteForAnother e) {
            System.out.println(e.getMessage());
        }
	}
}
