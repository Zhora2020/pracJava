import java.util.concurrent.Phaser;

public class MyClassThread extends Thread {
    static final Phaser p = new Phaser(1);
    public static void main(String[] args) {
        pingPong("ping");
        pingPong("pong");
    }
    private static void pingPong(final String msg) {
        new Thread() {
            public void run() {
                while (true) {
                    System.out.println(msg);
                    p.awaitAdvance(p.arrive()+1);
                }
            }
        }.start();
    }
}

