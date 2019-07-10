package stack.gctest;

public class testOne {
    public static void main(String[] args){
        //同一个作用域内，不回收
        byte[] placeholder=new byte[64*1024*1024];
        System.gc();
    }
}
