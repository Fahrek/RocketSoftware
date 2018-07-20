package cat.itacademy.rocketsoftware;

public class Propeller {

    int maxPotency;
    int currentPotency = 0;

    public Propeller(int maxPotency) {
        this.maxPotency = maxPotency;
    }
    
    public int getCurrentPotency() {
        return currentPotency;
    }

    public int getMaxPotency() {
        return maxPotency;
    }

    public void setMaxPotency(int maxPotency) {
        this.maxPotency = maxPotency;
    }

    @Override
    public String toString() {
        return "Potencia máxima: " + maxPotency + " Potencia Actual: " + currentPotency ;
    }
}
























//    public Propeller getClone(){
//        return new Propeller(maxPotency);
//    }
//    
//Constructor
//    public Propeller() {
//        maxPotency = new ArrayList<>();
//    }
//
//    //Getters 
//    public Integer getPotency(int p) {
//        return maxPotency.get(p);
//    }
//
//    //Methods
//    public void addPotency(int potency) {
//        maxPotency.add(potency);
//        System.out.println(potency);
//    }
//    public Propeller(int size, List<Integer> maxPotency) {
//        //this.size = size;
//        this.maxPotency = maxPotency;
//    }
//    public int size(int s){
//        return s;
//    }
//Setters
//    public void setSize(int size) {
//        this.size = size;
//    }
//    public String print(){
//        return "La potencia maxima es de... " + maxPotency;
//    }
//    
//    @Override
//    public String toString(){
//        return "La potencia maxima es de... " + maxPotency;
//    }
/*private int maxPotency;
    
    //Constructor
    public Propeller(){};

    public Propeller(int maxPotency) {
        this.maxPotency = maxPotency;
        
    }
    //Getters
    public int getMaxPotency() {
        return maxPotency;
    }
    /*public int getNumProp() {
        return numProp;
    }*/
//Setters
/*public void setMaxPotency(int maxPotency) {
        this.maxPotency = maxPotency;
    }*/
 /*public void setNumProp(int numProp) {
        this.numProp = numProp;
    }*/
//Methods
/*ArrayList<Integer> maxPotency;
    
    //Constructor
    public Propeller()
    {
        maxPotency = new ArrayList<>();
    
    //Creación de una lista ArrayList de elementos de tipo entero
   
    //Agregamos elementos a la lista
    /*maxPotency.add(10);
    maxPotency.add(30);
    maxPotency.add(80);
    
    //Despliegue de los elementos de la lista
    System.out.println("El cohet te les següents potències màximes: " + maxPotency);
    
    //Añadir 2 elementos de la lista con el índice dado
    maxPotency.add(0, 45);
    maxPotency.add(1, 75);
    maxPotency.add(2, 60);
    System.out.println("Potencies màximes actuals: " + maxPotency);
    
    //Eliminar 3 elementos de la lista con el índice dado
    maxPotency.remove(0);
    maxPotency.remove(1);
    maxPotency.remove(2);
    System.out.println("Potencies màximes definitives: " + maxPotency);
   
    
    //Constructor
    /*public Propeller (int[] maxPow) throws Exception {
        this.maxPotency = maxPow;
    }

    //Getters
    public int[] getMaxPotency() {
        return maxPotency;
    }

    //Setters
    public void setMaxPotency(int[] maxPow) {
        this.maxPotency = maxPow;
    }*/
 /*public void addPotency(Integer Potency){
        maxPotency.add(Potency);
        System.out.println(Potency);
    }
    
    public Integer getPotency(int p){
        return maxPotency.get(p);
    }*/
 /*public void print(){
        System.out.println(addPotency.Potency);
    }*/
