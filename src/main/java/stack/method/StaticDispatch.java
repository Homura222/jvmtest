package stack.method;

/**
 * 方法静态分派
 */
public class StaticDispatch {
    static abstract class Human {
    }

    static class Man extends Human {
    }

    static class Woman extends Human {
    }
    public void sayHello(Human guy){
        System.out.println("guy");
    }
    public void sayHello(Man man){
        System.out.println("man");
    }
    public void sayHello(Woman woman){
        System.out.println("woman");
    }
    public static void main(String[] args){
        Human man=new Man();
        Human woman=new Woman();
        StaticDispatch staticDispatch=new StaticDispatch();
        staticDispatch.sayHello(man);
        staticDispatch.sayHello(woman);
    }

}
