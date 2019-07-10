package JmmModule;

public class VolatileUseDemo {
    volatile boolean shutdownRequested;
    public void setShutdownRequested(){
        shutdownRequested=true;
    }
    public void doWork(){
        while (!shutdownRequested){

        }
    }
}
