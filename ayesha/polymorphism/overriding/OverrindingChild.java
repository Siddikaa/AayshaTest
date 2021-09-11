package ayesha.polymorphism.overriding;
public class OverrindingChild extends OverrindingParent {
    void get (){
        System.out.println("i am in child ");
    }
   
    void show(int i){
        System.out.println("i am in child ");
        System.out.println(i); 
    }
    //taken same method in child and override
    void getData(int i , String str){
        
        System.out.println("i am in getData child");
        System.out.println("id "+i );
        System.out.println("str");
    }
    public static void main(String[] args){
        // 1way
      OverrindingParent    obj = new OverrindingParent();
      //2 way 
      OverrindingParent obj1 =new OverrindingChild();
     // obj1.get();
     // obj.get();
      obj1.show(10);
      obj1.getData(10 , "aaysha");
       
     }
}
