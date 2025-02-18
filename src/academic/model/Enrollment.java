package academic.model;

/**
 * @author 12S23018 Early Sembiring
 * @author 12S23032 Seprian Siagian
 */
public class Enrollment {

    private String studentId;
    private String studentName;
    private String admissionYear;
    private String major;
 


    public Enrollment(String _studentId, String _studentName, String _admissionYear, String _major) {
        this.studentId = _studentId;
        this.studentName = _studentName;
        this.admissionYear = _admissionYear;
        this.major = _major;
 
    }
 
    public String getStudentId() {return this.studentId;}
    public void setStudentId(String _studentId) {this.studentId = _studentId;}  //metode set kode

    public String getStudentName() {return this.studentName;}
    public void setStudentName(String _studentName) {this.studentName = _studentName;}  //metode set kode

    public String getAdmissionYear() {return this.admissionYear;}
    public void setAdmissionYear(String _admissionYear) {this.admissionYear = _admissionYear;}  //metode set kode

    public String getMajor() {return this.major;}
    public void setMajor(String _major) {this.major = _major;}  //metode set kode
 

    @Override
    public String toString() {
        return this.studentId + "|" + this.studentName + "|" + this.admissionYear + "|" + this.major;
    }


 
} 