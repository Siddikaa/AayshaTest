package ayesha.abstraction;

public abstract class AbstractParent {
    // abstract method declare with abstract keyword
    abstract void getShow();

    void getInfo(){
        System.out.println(" i am parent");
    }
    public AbstractParent (){
        System.out.println(" in parent");
    }
}
