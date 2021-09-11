package ayesha.specifier;

public class AccessSpecifier1 extends AccessSpecifier {
    //i can not reduce the visibility parent class methods but i can increase that
    protected void getShow() {
        System.out.println(" i am child protected");

    }

    public static void main(String[] args) {
        AccessSpecifier1 obj = new AccessSpecifier1();
        obj.getShow();      //we can access every where
        obj.m1();      //protected method i can access outside the class but in side the package
        // obj.getTest(); //can not access private method outside the class
    }
}
