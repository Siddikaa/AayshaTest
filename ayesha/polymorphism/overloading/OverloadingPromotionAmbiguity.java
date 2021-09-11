package ayesha.polymorphism.overloading;
/**whenever we create method overloading can be take same data type with same parameter
/**whenever we create method overloading can be take same data type with same parameter
 *it generate ambiguity.
 * 
 */
public class OverloadingPromotionAmbiguity {
    void show(int i){
        System.out.println("a");
    }
//  void show(int i){
//        System.out.println("b");
//    }
    public static void main(String[] args){
       OverloadingPromotionAmbiguity obj = new OverloadingPromotionAmbiguity();
       obj.show(0);
    }
}
