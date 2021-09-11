package ayesha.inheritance.samevariables;

public class SameVariablesChild extends SameVariablesParent{
    int a=4;
    int b=5;
    void getTest (int a , int b){
        System.out.println(a+b);
        System.out.println(this.a +  this.b  );//this use for current class variables/constructor/methods
        System.out.println(super.a + super.b);//super use for parent class variables/constructor/methods
    }

    public static void main(String[] args) {
        SameVariablesChild obj = new SameVariablesChild();
        obj.getTest(5 ,  5);
    }
}
