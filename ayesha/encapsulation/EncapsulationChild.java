package ayesha.encapsulation;

public class EncapsulationChild extends EncapsulationParent {

    public static void main(String[] args) {
        EncapsulationChild obj = new EncapsulationChild();
        obj.setEmpId(10);
        obj.setEmpName("Aaysha");
        //obj.getEmpSalary(200.0);
        System.out.println(obj.getEmpId());
        System.out.println(obj.getEmpName());
        System.out.println(obj.getEmpSalary());
    }
}
