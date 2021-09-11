package ayesha.specifier.accessspecifier;

import ayesha.specifier.AccessSpecifier;

public class  TestSpecifier extends AccessSpecifier
{

    public static void main(String[] args) {
        TestSpecifier obj = new TestSpecifier();
        obj.m1();//protected can access with inheritance
        // obj.getShow();// defult modifyer can not access outside the pacakeg
        // obj.getTest();// private cont access
        obj.m2();
    }
}
