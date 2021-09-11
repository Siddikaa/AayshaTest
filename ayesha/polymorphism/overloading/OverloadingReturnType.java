package ayesha.polymorphism.overloading;

//we can also overload differient return type
public class OverloadingReturnType {
    int show(int i) {
        System.out.println("int method");
        return 2;
    }

    String show(String b) {
        System.out.println("String method");
        return "b";
    }
    boolean show(){
        System.out.println("boolen method");
        return true;
    }
//return type method also overload
    public static void main(String[] args) {
        OverloadingReturnType obj = new OverloadingReturnType();
        obj.show('c');//type promotion chr convert to int
        obj.show("aaysha");
        obj.show();
    }
}
