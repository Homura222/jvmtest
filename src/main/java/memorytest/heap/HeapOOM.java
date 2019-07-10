package memorytest.heap;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
    static class OOMObject {
    }
    public static void main(String[] args){
        List<OOMObject> list = new ArrayList<OOMObject>();
        try {
            while (true) {
                list.add(new OOMObject());
            }
        }finally {
            System.out.println("大小："+list.size());
        }

    }
}
