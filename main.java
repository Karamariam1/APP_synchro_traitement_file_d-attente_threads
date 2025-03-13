package tar1;

import java.util.*;

public class main {
    public static void main(String[] args) {
        FileTache FileTache = new FileTache(); 

        // Création de 2 producteurs
        Thread producer1 = new Thread(new Producer(FileTache, 1));
        Thread producer2 = new Thread(new Producer(FileTache, 2));

        // Création de 2 consommateurs
        Thread consumer1 = new Thread(new Consumer(FileTache, 1));
        Thread consumer2 = new Thread(new Consumer(FileTache, 2));

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}
