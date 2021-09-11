package ayesha.interfaces;

public class ChildClass implements Interfaces1 , Interfaces2{
    @Override
    public void test1() {
        System.out.printf(" i am in test 1");
    }

    @Override
    public void test2() {
        System.out.println("i am in test 2");

    }

    @Override
    public void test3() {
        System.out.printf("i am in test 3");
    }

    // we can not reduce the visibilty of method while overrin
//void Test1(){
//    System.out.println();
//}
    public static void main(String[] args) {
        Interfaces1 obj =new ChildClass();
        obj.test1();
        obj.test2();
        obj.test3();
        System.out.printf(Interfaces1.name);
    //    Interfaces1.name="String";
        // we can not reasign the value of interface variables
    }
}
