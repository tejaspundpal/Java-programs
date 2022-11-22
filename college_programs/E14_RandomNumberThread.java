package E14_Threading;

public class E14_RandomNumberThread extends Thread {
    int max;

    public E14_RandomNumberThread(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            int i = (int) (Math.random() * this.max);
            if (i % 2 == 0) {
                E14_SquareThread sq = new E14_SquareThread(i);
                sq.start();
            } else {
                E14_CubeThread c = new E14_CubeThread(i);
                c.start();
            }
        }
    }

    public static void main(String[] args) {
        E14_RandomNumberThread rad = new E14_RandomNumberThread(1000);
        rad.start();
    }
}