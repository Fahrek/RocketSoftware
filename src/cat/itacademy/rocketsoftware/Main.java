package cat.itacademy.rocketsoftware;

public class Main {

    public static void main(String[] args) throws Exception {

        Rocket rocket1 = new Rocket("32WESSDS");

        rocket1.addPropeller(10);
        rocket1.addPropeller(30);
        rocket1.addPropeller(80);
        
        System.out.print(rocket1.getIdRocket() + ": ");
        System.out.println(rocket1.speedUp(80));
        System.out.println(rocket1.speedUp(80));
        System.out.println(rocket1.speedUp(80));
        System.out.println(rocket1.getCurrentPotency());
        
        System.out.println("");
        
//        Rocket rocket2 = new Rocket("LDSFJA32");
//
//        rocket2.addPropeller(30);
//        rocket2.addPropeller(40);
//        rocket2.addPropeller(50);
//        rocket2.addPropeller(50);
//        rocket2.addPropeller(30);
//        rocket2.addPropeller(10);
//
//        System.out.print(rocket2.getIdRocket() + ": ");
//        rocket2.getPropList();
//        rocket2.getArrayListSize();
//        
//        System.out.println("");

    }
}
