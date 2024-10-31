public class Philosopher extends Thread {
    private final Fork leftFork;
    private final Fork rightFork;
    private int count;

    public Philosopher(Fork leftFork, Fork rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.count = 0;
    }

    @Override
    public void run() {
        while(count < 3) {
            think();
            eat();
        }
    }

    private void think() {
        System.out.println("Философ (" + Thread.currentThread().getName() + ")" + " размышляет.");
    }

    private void eat() {
        synchronized(leftFork) {
            synchronized(rightFork) {
                System.out.println("Философ (" + Thread.currentThread().getName() + ")" + " ест.");
                count++;
            }
        }
    }
}

