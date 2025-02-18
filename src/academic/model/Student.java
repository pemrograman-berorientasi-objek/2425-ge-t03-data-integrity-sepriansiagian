package academic.model;

/**
 * @author 12S23018 Early Sembiring
 * @author 12S23032 Seprian Siagian
 */

public class Student {
    private String studentId;
    private String studentName;
    private String admissionYear;
    private String major;

    public Student(String studentId, String studentName, String admissionYear, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.admissionYear = admissionYear;
        this.major = major;
    }

    public String getStudentId() {return studentId;}
    public void setStudentId(String studentId) {this.studentId = studentId;} //metode set kode

    public String getStudentName() {return studentName;}
    public void setStudentName(String studentName) {this.studentName = studentName;} //metode set kode

    public String getAdmissionYear() {return admissionYear;}
    public void setAdmissionYear(String admissionYear) {this.admissionYear = admissionYear;} //metode set kode

    public String getMajor() {return major;}
    public void setMajor(String major) {this.major = major;} //metode set kode

    @Override
    public String toString() {
        return studentId + "|" + studentName + "|" + admissionYear + "|" + major;
    }
}


