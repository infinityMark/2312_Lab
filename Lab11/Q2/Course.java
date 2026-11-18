import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Course implements Comparable<Course>{
    private String courseName;
    private Set<CourseDetail> courseDetail;

    public class CourseDetail implements Comparable<CourseDetail>{
        private String date;
        private Set<Student> students;

        public CourseDetail(String date){
            this.date = date;
            students = new LinkedHashSet<>();
        }

        public void studentJoin(Student student){
            students.add(student);
        }

        public boolean isStudentJoined(Student student){
            return students.contains(student);
        }

        @Override 
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(String.format("%s:", date));
            for (Student student : students) {
                stringBuilder.append(String.format(" %s", student.getId()));
            }
            return stringBuilder.toString();
        }

        @Override
        public int compareTo(CourseDetail other) {
            return this.date.compareTo(other.date);
        }
    }

    public Course(String str) {
        this.courseName = str;
        courseDetail = new LinkedHashSet<>();
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

    @Override
        public int compareTo(Course other) {
            return this.courseName.compareTo(other.courseName);
        }

    public void listStudents(){
        System.out.println();
        for (CourseDetail courseDetail2 : courseDetail) {
            System.out.println(courseDetail2);
        }
    }
}