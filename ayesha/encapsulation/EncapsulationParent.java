package ayesha.encapsulation;

//also called data hinding
public class EncapsulationParent {
    private int empId;
    private String empName;
    private float empSalary;

    void getTest() {
        System.out.println("i am in encapsu");
    }

    //getter method throw access private variable another class
    public int getEmpId() {
        return empId;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpId(int id) {
        this.empId = id;
    }

    public void setEmpName(String name) {
        this.empName = name;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }
}