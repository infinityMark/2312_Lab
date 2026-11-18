import java.util.HashSet;
import java.util.Set;

public class Course{
    private String courseName;
    private Set<CourseDetail> courseDetail;

    public class CourseDetail{
        private String date;
        private Set<Student> students;

        public CourseDetail(String date){
            this.date = date;
            students = new HashSet<>();
        }

        public void studentJoin(Student student){
            students.add(student);
        }

        public boolean isStudentJoined(Student student){
            return students.contains(student);
        }
    }

    public Course(String str) {
        this.courseName = str;
        courseDetail = new HashSet<>();
    }

    public void addOffering(String date){
        courseDetail.add(new CourseDetail(date));
    }

    public void addStudents(String dateString, Student student){
        for (CourseDetail courseDetail2 : this.courseDetail) {
            if(courseDetail2.date.equals(dateString))
                courseDetail2.studentJoin(student);
        }
    }

    public boolean searchByStudentName(Student origin, Student queryStudent){
        for (CourseDetail courseDetail2 : courseDetail) {
            if(courseDetail2.isStudentJoined(origin) && courseDetail2.isStudentJoined(queryStudent)) {
                return true;
            }
        }
        return false;
    }
}