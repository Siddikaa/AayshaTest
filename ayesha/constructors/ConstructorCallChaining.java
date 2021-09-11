package ayesha.constructors;
public class ConstructorCallChaining {

    public ConstructorCallChaining() {
        this("Aaysha", 10);//   this keyword use for calling constructor

        System.out.println("i am no para constructor");
    }

    public ConstructorCallChaining(String str, int i) {
        System.out.println(str + "" + i);
        System.out.println("i am  para constructor");
    }
    public static void main(String[] args) {
        new ConstructorCallChaining();
    }
}
