package tar1;

import java.util.Random;


public class Tache {
     private int id;
     private static Random random = new Random();

    public Tache() {
        this.id = random.nextInt(1000); 
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return ("Tache " + id );
    }
}