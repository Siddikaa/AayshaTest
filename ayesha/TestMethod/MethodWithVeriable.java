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
public class MethodWithVeriable {
    
    public void get (String str1, String str2 ){// method  declaration
        //implementation
    System.out.println("i am in test");
        System.out.println(str1);
            System.out.println(str2);
    
    }
    public void test(int i){
        
         System.out.println("i am Aaysha" );
         System.out.println(i );
    }
    public static void test3(int a ,int b){
         
 int c=a+b;
 System.out.println("vlue of c" +c);
    }
    public static void main(String [] args)
    {
        
        MethodWithVeriable i =new MethodWithVeriable();
        i.get("Aaysha" , "Shipha");
        i.test(12);
        MethodWithVeriable.test3(10,20);
    }
    
}
