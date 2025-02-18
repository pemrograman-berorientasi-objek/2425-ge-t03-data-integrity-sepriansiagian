package academic.model;

/**
 * @author 12S23018 Early Sembiring
 * @author 12S23032 Seprian Siagian
 */
public class Course {
    private String kode;
    private String name;
    private int credit;
    private String grade;

    public Course(String _kode, String _name, int _credit, String _grade) {
        this.kode = _kode;
        this.name = _name;
        this.credit = _credit;
        this.grade = _grade;  
    }
 
    public String getkode() {return this.kode;} 
    public void setkode(String _kode) {this.kode = _kode;} //metode set kode

    public String getname() {return this.name;}
    public void setname(String _name) {this.name = _name;}  //metode set kode

    public int getcredit() {return this.credit;}
    public void setcredit(int _credit) {this.credit = _credit;}  //metode set kode

    public String getgrade() {return this.grade;}
    public void setgrade(String _grade) {this.grade = _grade;}  //metode set kode
    
    @Override
    public String toString() { 
        return this.kode + "|" + this.name + "|" + this.credit + "|" + this.grade;
    }


    

}