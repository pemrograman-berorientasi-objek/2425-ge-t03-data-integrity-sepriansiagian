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

public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();
        ArrayList<String> inputs = new ArrayList<>();


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
                        break;
                }
            }
        }

        for (int i = inputs.size() - 1; i >= 0; i--) {
            System.out.println(inputs.get(i));
        }
        System.out.println("---");

        for (int i = courses.size() - 1; i >= 0; i--) {
            System.out.println(courses.get(i));
        }
        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.println(students.get(i));
        }
        for (int i = enrollments.size() - 1; i >= 0; i--) {
            System.out.println(enrollments.get(i) + "|None");
        }

        scanner.close();
    }
}
