package ayesha.inheritance;

public class Parent {
   public void m1() {
        this.m2(10 , "Aaysha");

        System.out.println("i am in parent class");
    }
    public void m2(int a , String b){
        System.out.println("Id " +a );
        System.out.println("Name " +b);

    }

}
