package ayesha.TestMethod;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package TestMethods;

/**
 *
 * @author admin
 */
public class MethodWithParameterReturnType {

//string is a return type which is return value

public String getName(String str1 , String str2) {
    String str = str1 +" "+ str2;
    
    return str;
}
    public Employee test(Employee emp){
        
   return emp;
  }
    public int addition(int a ,int b){
        int c =a+b;
        return c;
                
    }
  public static void main(String [] args){
   MethodWithParameterReturnType obj = new MethodWithParameterReturnType();
   
    System.out.println(obj.getName("Aaysha" , "Siddika"));
     //System.out.println(obj.test());
     Employee ee = new Employee ();
     //ee.Name
     System.out.println(ee.Name);
     System.out.println(ee.empId);
     
     Employee e =new Employee();
     
     System.out.println(e.Name);
     System.out.println(e.empId);
     
     System.out.println(obj.getName("Shipha" , "bano"));
    System.out.println(obj.addition(10 ,20));
     
    
}
}
