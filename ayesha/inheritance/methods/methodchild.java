package ayesha.inheritance.methods;

public class methodchild extends methodparents {
    void m2(){
        System.out.println("i am in child :: m2");
    }
    void m3(){
        m1();
        m2();
        System.out.println(" i am in child :: m3" );
    }
    void m1(){
        super.m1();
        super.m2();
        this.m2();
        System.out.println("i am in child :: m1");
    }

    public static void main(String[] args) {
        methodchild obj = new methodchild();
        obj.m3();
        System.out.println("-------------------------------");
        methodchild obj1 = new methodchild();

    }
}
