package ayesha.specifier;

public class AccessSpecifier {

    //private method
    private static void getTest() {
        System.out.println("i am in private");
    }

    // defult method
    void getShow() {
        System.out.println("i am in access");
    }

    //protected
    protected void m1() {
        System.out.println("i am in protected");
    }

    //public
    public void m2() {
        System.out.println("i am in public");
    }
}