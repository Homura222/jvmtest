package memorytest.constant;

public class RuntimeConstantPoolOOM {
    public static void main(String[] args){
        //StringBuilder创建在堆上，intern方法在常量池中记录首次出现的示例引用
        String strl=new StringBuilder("计算机").append("软件").toString();
        System.out.println(strl.intern()==strl);
        //java已经出现过，因此常量池中的引用与堆中的不同
        String strl2=new StringBuilder("ja").append("va").toString();
        System.out.println(strl2.intern()==strl2);
    }
}
