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

 class MethodWithReturnType {
    public String test(){  //string is return type
        
    System.out.println("i am aays");
    return "Aaysha";//return type return value string
    
}
    public int test2(){
        return 100;
        
    }
    public static void main(String[] args) {
    MethodWithReturnType obj = new MethodWithReturnType();
    System.out.println(obj.test()); // thro obj call method
    System.out.println(obj.test2());
        obj.test();
          System.out.println("---------------------");
          String str = obj.test();//we can call store into variable and print that
          int i =obj.test2();
            System.out.println(str);
              System.out.println(i);
        
    }
    
    
    
}
