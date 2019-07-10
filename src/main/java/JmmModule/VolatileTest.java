package JmmModule;

public class VolatileTest {
    public static volatile int rare=0;

    public static void increase(){
        rare++;
    }

    private static final int THREADS_COUNT=20;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads=new Thread[THREADS_COUNT];
        for(int i=0;i<THREADS_COUNT;i++){
            threads[i]=new Thread(new Runnable() {
                public void run() {
                    for (int i=0;i<10000;i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        //等待所有累加线程结束
        for(int i=0;i<THREADS_COUNT;i++){
            threads[i].join();
            Thread.yield();
        }
        System.out.println(rare);
    }
}
