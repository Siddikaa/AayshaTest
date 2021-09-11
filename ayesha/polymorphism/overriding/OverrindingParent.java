/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayesha.polymorphism.overriding;

/**
 *
 * @author admin
 */
public class OverrindingParent {
    private void get(){
        System.out.println("i am in parent get");
    }
    void show(int i){
        System.out.println("i am in parent ");
       // System.out.println(i); 
    }
    void getData(int i , String str){
        System.out.println("i am in getData parent ");
              
    }
     
}
