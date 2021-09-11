package ayesha.constructors;

public class Employee {

    int empNo;
    String empName;

    void getEmpInf() {

        System.out.println(empNo);
        System.out.println(empName);
    }

    public Employee() { // constructor name should be same as clas name
        //no need to return type .
        empNo = 10;
        empName = "aaysha";
    }

    public static void main(String[] args) {
        Employee emp = new Employee(); // direct constructor called
        emp.getEmpInf();

    }

}
