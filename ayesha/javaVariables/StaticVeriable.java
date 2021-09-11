 package ayesha.javaVariables;

public class StaticVeriable {

    //static Veriable
    static int age = 20;
    static String name = "aaysha";

    //instance method
    public void test() {
        // access by using class name (standard way)
        System.out.println(StaticVeriable.age);
        System.out.println(StaticVeriable.name);

        //2 Direct  static variable
        System.out.println(age);
        System.out.println(name);

        //3. using object reference
        // create object by new keyword with class name
        StaticVeriable obj = new StaticVeriable();
        System.out.println(obj.age);
        System.out.println(obj.name);

    }

    // main method
    public static void main(String[] args) {

        // access by using class name (standard way)
        System.out.println(StaticVeriable.age);
        System.out.println(StaticVeriable.name);

        //2 Direct  static variable
        System.out.println(age);
        System.out.println(name);

        //3. using object reference
        // create object by new keyword with class name
        StaticVeriable obj = new StaticVeriable();
             obj.test();
        System.out.println("Age =" + obj.age);
        System.out.println("Name =" + obj.name);
        System.out.println("===============================================");
        //obj.test();
    }
}
