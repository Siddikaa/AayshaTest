package ayesha.TestMethod;

//import ayesha.Constructors.Student;

import com.sun.javaws.IconUtil;

public class MethodWithOjectParameter {
         public void m2(Employee e) {
             System.out.println(e.empId);
             System.out.println(e.Name);
         }

         public void m3(Student stu) {
             System.out.println(stu.studentId);
             System.out.println(stu.studentName);
         }

         public void m4(Student str, Employee ee) {
             System.out.println(str.studentName);
             System.out.println(ee.empId);
         }

         public static void main(String[] args) {
             MethodWithOjectParameter  obj = new MethodWithOjectParameter();
             Employee emp = new Employee();
             Student st = new Student(10 ,"aa");
             obj.m2(emp);
             System.out.println("-----------------------------");
             obj.m3(st);
             System.out.println("-----------------------------");
             obj.m4(st , emp );
         }
     }