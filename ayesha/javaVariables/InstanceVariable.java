package ayesha.javaVariables;

public class InstanceVariable {
    int age = 26;
    String name = "shifa";

    //Instancle method
    public void test() {
        //instance area
        //direct access
        System.out.println("Age" + age);
        System.out.println("Name" + name);
    }
//static method
    public static void main(String[] args) {
        //static area instance variable we cant use direct we can use throw create obhect
        InstanceVariable obj = new InstanceVariable();
        obj.test();
        System.out.println(obj.age);
        System.out.println(obj.name);
    }
}
