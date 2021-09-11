package ayesha.polymorphism.overloading;

public class TestOverloading {
    void show() {
        System.out.println("i am in no para method");
    }

    void show(int i) {
        System.out.println("i am in int para method");
    }

    void show(String j, int i) {
        System.out.println(j + " " + i);
        System.out.println("i am in String and int para method");

    }

    void show(int i, String j) {
        System.out.println(i + " " + j);
        System.out.println("i am in int and String para method");

    }

    void show(int i, float f) {
        System.out.println(i + " " + f);
        System.out.println("i am in int float para method");
    }

    public static void main(String[] args) {
        TestOverloading obj = new TestOverloading();
        obj.show();
        System.out.println("------------");
        obj.show(100);
        System.out.println("-------------------");
        obj.show("Bushra", 100);
        System.out.println("------------");
        obj.show(100, "Shipha");
        System.out.println("------------------");
        obj.show(10, 10);
        main();
    }

    public static void main() {
        System.out.println("i am in main method overload");
    }
}
