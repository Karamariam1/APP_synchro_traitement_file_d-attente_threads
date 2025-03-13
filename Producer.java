package tar1;

import java.util.*;

class Producer implements Runnable {
    private final FileTache FileTache;
    private final int producerId;

    public Producer(FileTache FileTache, int producerId) {
        this.FileTache = FileTache;
        this.producerId = producerId;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) { 
                Tache tache = new Tache(); 
                FileTache.putTache(tache);
                System.out.println("Producer " + producerId + " ajoute : " + tache);
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            System.out.println("Producteur " + producerId + " ...");
        }
    }
}