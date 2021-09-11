
package ayesha.polymorphism.overloading;


/**
 * inside the program  type promotion use
 */
public class TestOverloading2 {
    void test(int i, long s) {
        System.out.println("i am in int ");

    }

    void test(int b) {
        System.out.println("i am in char");
    }

    public static void main(String[] args) {
        TestOverloading2 obj = new TestOverloading2();
        obj.test(90, 10);//int convert into long
        obj.test('n');
    }
}