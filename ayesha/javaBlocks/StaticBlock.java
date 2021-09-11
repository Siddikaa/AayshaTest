package ayesha.javaBlocks;

//package Aaysha.constructor;
public class StaticBlock {
    // static block have should be static key word
    static {
        System.out.println("i am static block");

    }

    {
        System.out.println("i am in instance block");
    }

    static int id = 10;
    static String name = "Aaysha";

    static {
        System.out.println("i am static block2");
    }
    //normal method

    static void getTest() {
        System.out.println("Id = " + id);
        System.out.println("name = " + name);
    }

    public StaticBlock() {

        this("Aaysha ", "Siddika");
    }

    //constructor
    public StaticBlock(String st, String str) {
        System.out.println("Name  " + st + str);
    }

    public static void main(String[] args) {
        new StaticBlock();
        //StaticBlock  obj = new StaticBlock();
        // obj1.getTest();
    }
}


