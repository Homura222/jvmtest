package util;

import java.util.ArrayList;
import java.util.List;

public class OOMTest {
    static class OOMObject{
        public byte[] palceholder=new byte[64*1024];
    }
    public static void fillHeap(int sum) throws InterruptedException {
        List<OOMObject> list=new ArrayList<OOMObject>();
        for (int i=0;i<sum;i++){
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }
    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
