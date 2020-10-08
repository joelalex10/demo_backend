package bo.edu.ucb.demo.Backend.model;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    @Basic(optional = false)
    private Integer studentId;

    @Column(name = "full_name")
    @Basic(optional = false)
    private String fullName;

    public Student(){

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "studentId=" + studentId +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
