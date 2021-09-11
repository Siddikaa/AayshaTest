package ayesha.polymorphism.overloading;

public class OverloadingConstructor {

    public OverloadingConstructor() {
        System.out.println("no para constructor");

    }

    public OverloadingConstructor(int i) {

        System.out.println("1 para constructor");
    }

    public OverloadingConstructor(int i, String str) {
        System.out.println("i am in int ,str");
        System.out.println(i);
        System.out.println(str);

    }

    public static void main(String[] args) {
        new OverloadingConstructor();
        new OverloadingConstructor('a', "aaysha");//print a value aiis code
        new OverloadingConstructor(10);


    }
}
