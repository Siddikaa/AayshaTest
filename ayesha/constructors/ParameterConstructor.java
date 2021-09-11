package ayesha.constructors;
//package Aaysha.constructor;

public class ParameterConstructor {
    // paremeter constructor
    public ParameterConstructor(int i) {
        System.out.println("I am in para constructor" + i);
    }

    // defult constructor
    public ParameterConstructor() {
        System.out.println("I am in defult constructor");
    }

    public static void main(String[] args) {
        ParameterConstructor obj1 = new ParameterConstructor();
        ParameterConstructor obj2 = new ParameterConstructor(10);

        //2nd way to call constructor
        System.out.println("-----------------");
        new ParameterConstructor();
        new ParameterConstructor(10);
    }

}
