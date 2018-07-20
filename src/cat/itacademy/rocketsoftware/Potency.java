package cat.itacademy.rocketsoftware;

import java.util.ArrayList;

public class Potency {
    ArrayList<Integer> maxPotency;
    
    //Constructor
    public Potency(){
        maxPotency = new ArrayList<>();
    }
    
    //Getters 
    public Integer getPotency(int p){
        return maxPotency.get(p);
    }
    
    //Methods
    public void addPotency(Integer Potency){
        maxPotency.add(Potency);
        System.out.println(Potency);
    }
    /*public void print(){
        System.out.println(addPotency.Potency);
    }*/
}
