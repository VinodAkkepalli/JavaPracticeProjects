package practice.concurrency.phaser;

import java.util.concurrent.Phaser;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
public class PhaserServiceForCountdown implements Runnable {
    Phaser phaser;
    String name;

    public PhaserServiceForCountdown(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " Started!!!");
        phaser.arrive();
        System.out.println(this.name + " Finished!!!");
    }
}
