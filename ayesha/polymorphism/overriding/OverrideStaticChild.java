package ayesha.polymorphism.overriding;

public class OverrideStaticChild extends OverrideStaticParent{
   static void show(){
        System.out.println("i am in child ");
    }

    public static void main(String[] args) {
        //System.out.println();
        OverrideStaticChild obj = new OverrideStaticChild();
        OverrideStaticParent obj1 =new OverrideStaticParent(); // static varible link with clas not an obj .
        OverrideStaticParent obj2 = new OverrideStaticChild();
        obj.show();
        obj1.show();
        obj2.show();

    }
}
