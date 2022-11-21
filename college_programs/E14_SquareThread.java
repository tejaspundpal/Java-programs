package E14_Threading;

public class E14_SquareThread extends Thread {
    int i;

    public E14_SquareThread(int i) {
        this.i = i * i;
    }

    @Override
    public void run() {
        System.out.println("Square = " + i);
    }
}