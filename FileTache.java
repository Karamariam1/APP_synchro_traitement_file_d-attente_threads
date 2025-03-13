package tar1;

import java.util.*;

public class FileTache {
    private List<Tache> filetache = new LinkedList<>();
    private int capacite = 10;

    public FileTache() { }
    
    // ajouter une tâche
    public synchronized void putTache(Tache tache) throws InterruptedException {
        while (filetache.size() >= capacite) {
            wait();
            System.out.println("C Waiting");
        }
        filetache.add(tache);
        notify();
    }
    
     // retirer une tâche 
    public synchronized Tache getTache() throws InterruptedException {
        while (filetache.isEmpty()) {
            System.out.println("P Waiting");
            wait(); 
        }
        Tache tache = filetache.remove(0);
        notify(); 
        return tache;
    }
}
