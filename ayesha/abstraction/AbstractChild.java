package ayesha.abstraction;

public class AbstractChild extends AbstractParent {
    void getShow() {
        System.out.println("i am in child");
    }

    /*defult constructor called
    AbstractChild(){
    super();// compiler widd add super by defult it will call parent class constructor
        */
    @Override
    void getInfo() {
        System.out.println("i am in child abstract");
    }

    //AbstractChild obj = new AbstractChild();
    public static void main(String[] args) {
        AbstractChild obj1 = new AbstractChild();
        obj1.getShow();
        obj1.getInfo();
        AbstractParent obj = new AbstractChild();
        obj.getInfo();
        obj.getShow();
    }
}
