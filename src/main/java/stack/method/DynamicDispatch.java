package stack.method;

/**
 * 重写机制
 */
public class DynamicDispatch {
    static abstract class Human {
        protected abstract void sayHello();
    }

    static class Man extends Human {
        protected void sayHello() {
            System.out.println("man say Hello");
        }
    }

    static class Woman extends Human {
        protected void sayHello() {
            System.out.println("woman say hello");
        }
    }

    public static void main(String[] args) {
        Human man=new Man();
        Human woman=new Woman();
        man.sayHello();
        woman.sayHello();
        man=new Man();
        man.sayHello();
    }
}
