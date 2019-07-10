package load.testOne;

/**
 * 被动引用类字段演示1
 *
 *通过子类引用父类的静态字段，不会导致子类的初始化
 */
public class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }
    public static int value=123;
}

