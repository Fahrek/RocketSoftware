package cat.itacademy.rocketsoftware;

import java.util.*;

public class Rocket {

    //Atributes
    private String idRocket;
    private List<Propeller> propellers;

    //Constructor
    public Rocket(String idRocket) throws Exception {
        if (idRocket.equals("")) {
            throw new Exception("Unicament es poden afegir lletres de la A a la Z en majuscules combinats o no amb numeros");
        }
        this.idRocket       = idRocket;
        this.propellers     = new ArrayList();
    }

    //Getters
    public String getIdRocket() {
        return idRocket;
    }
    
    public int getCurrentPotency(){
        return currentPotency;
    }

    //Setters
    public void setIdRocket(String idRocket) throws Exception {
        if (idRocket.equals("")) {
            throw new Exception("Unicament es poden afegir lletres de la A a la Z en majuscules combinats o no amb numeros");
        }
        this.idRocket = idRocket;
    }

    //Methods
    public int speedUp(int maxPotency) throws Exception {
        if(currentPotency + 10 > maxPotency){
            throw new Exception("La potencia actual no pot superar la potencia maxima del propulsor");
        }else{
            return currentPotency += 10;
        }
    }

    public int speedDown() throws Exception {
        if(currentPotency - 10 < 0){
            throw new Exception("La potencia no pot ser inferior a 0");
        }else{
            return currentPotency -= 10;
        }
    }
    
    public void addPropeller(int potency) {
        propellers.add(new Propeller(potency));
    }

    public void getPropList() {
        for (Propeller l : propellers) {
            System.out.print(l);
        }
    }

    public void getArrayListSize() {
        System.out.println("\nPropulsors: " + propellers.size());
    }

    @Override
    public String toString() {
        return idRocket + ": " + propellers;
    }
}









//    if (numPropeller <= 0) {
//    throw new Exception("No es poden introduÃ¯r numeros iguals o inferiors a 0");
//    }
//    public ArrayList getPotency() {
//        return propeller;
//    }
//    public int getNumPropeller() {
//        return numPropeller;
//    }
//    public void setNumPropeller(int numPropeller) throws Exception {
//        if (numPropeller <= 0) {
//            throw new Exception("No es poden introduÃ¯r numeros iguals o inferiors a 0");
//        }
//        this.numPropeller = numPropeller;
//    }
//    public void print() {
//        for (potencies : potency) {
//           System.out.print(potency);
//        }
//        System.out.println(idRocket + potency);
//        //System.out.println("Potencies Maximes: " + Arrays.toString(propeller));
//    }
//    -------------------------------------------------------------------------
//    public Rocket(String idRocket, int numPropeller, int... prop) throws Exception {
//        if (idRocket.equals("")) {
//            throw new Exception("Unicament es poden afegir lletres de la A a la Z en majuscules combinats o no amb numeros");
//        }
//
//        if (numPropeller <= 0) {
//            throw new Exception("No es poden introduÃ¯r numeros iguals o inferiors a 0");
//        }
//        this.idRocket = idRocket;
//        this.numPropeller = numPropeller;
//        this.propeller = prop;
//    }
//    public Propeller getMaxPotency(int index){
//        Propeller maxPotency = propellers.get(index);
//        return maxPotency;
//    }
//    public void callPropeller(int powNum){
//        Propeller prop = new Propeller();
//        prop.addPotency(powNum);
//    }

//    ArrayList<Integer> numProp = new ArrayList<>();
//    public Integer getNumProp(int p){
//        return numProp.get(p);
//    }
//      public void addProp(Integer Prop){
//        numProp.add(Prop);
//        System.out.println(Prop);
//    }

