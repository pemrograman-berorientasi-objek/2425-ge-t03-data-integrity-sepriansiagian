package academic.driver;

/**
 * @author 12S23018 Early Sembiring
 * @author 12S23032 Seprian Siagian
 */
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");
            if (parts.length > 1) {
                String command = parts[0];

                switch (command) {
                    case "course-add":
                        if (parts.length == 5) {
                            String courseCode = parts[1];
                            String courseName = parts[2];
                            int credits = Integer.parseInt(parts[3]);
                            String grade = parts[4];

                            courses.add(new Course(courseCode, courseName, credits, grade));
                        }
                        break;

                    case "student-add":
                        if (parts.length == 5) {
                            String studentId = parts[1];
                            String studentName = parts[2];
                            String admissionYear = parts[3];
                            String major = parts[4];

                            students.add(new Student(studentId, studentName, admissionYear, major));
                        }
                        break;

                    case "enrollment-add":
                        if (parts.length == 5) {
                            String courseCode = parts[1];
                            String studentId = parts[2];
                            String academicYear = parts[3];
                            String semester = parts[4];

            
                                enrollments.add(new Enrollment(courseCode, studentId, academicYear, semester));
                            }
                        }
                        break;
                }
            }

        for (Course course : courses) {
            System.out.println(course);
        }

        for (Student student : students) {
            System.out.println(student);
        } 

        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment + "|None");
        }

        scanner.close();
    }
}
