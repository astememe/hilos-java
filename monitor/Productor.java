package monitor;

import java.nio.Buffer;

public class Productor implements Runnable {
    private BufferMonitor bufferMonitor;

    public Productor(BufferMonitor monitor) {
        this.bufferMonitor = monitor;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                bufferMonitor.producir(i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
