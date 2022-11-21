package E14_Threading;

public class E14_CubeThread extends Thread {
    int i = 0;

    public E14_CubeThread(int i) {
        this.i = i * i * i;
    }

    @Override
    public void run() {
        System.out.println("Cube = " + i);
    }
}