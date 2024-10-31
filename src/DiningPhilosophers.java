public class DiningPhilosophers {
    public static void main(String[] args) {
        Fork[] forks = new Fork[5];
        Philosopher[] philosophers = new Philosopher[5];
        for(int i = 0; i < 5; i++) {
            forks[i] = new Fork();
        }

        for(int i = 0; i < 5; i++) {
            philosophers[i] = new Philosopher(forks[i], forks[(i + 1) % 5]);
            philosophers[i].start();
        }
    }
}