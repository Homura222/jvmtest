package stack.gctest;

/**
 * -verbose:gc
 */
public class testTwo {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        System.gc();
    }
}
