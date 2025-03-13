package tar1;

import java.util.*;

class Consumer implements Runnable {
    private final FileTache FileTache;
    private final int consumerId;

    public Consumer(FileTache FileTache, int consumerId) {
        this.FileTache = FileTache;
        this.consumerId = consumerId;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Tache tache = FileTache.getTache();
                System.out.println("Consumer " + consumerId + " récupère : " + tache);
                Thread.sleep(3000); 
            }
        } catch (InterruptedException e) {
        }
    }

}