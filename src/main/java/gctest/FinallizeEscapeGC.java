package gctest;

public class FinallizeEscapeGC {
    public static FinallizeEscapeGC SAVE_HOOK=null;

    public void isAlive(){
        System.out.println("yes,i am still alive :)");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed!");
        //自救
        FinallizeEscapeGC.SAVE_HOOK=this;
    }
    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK=new FinallizeEscapeGC();

        //第一次自救
        SAVE_HOOK=null;
        System.gc();
        //优先级别低,暂停等待
        Thread.sleep(500);
        if (SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no,i am dead :(");
        }

        //代码一样但是自救失败
        SAVE_HOOK=null;
        System.gc();
        //优先级别低,暂停等待
        Thread.sleep(500);
        if (SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("no,i am dead :(");
        }
    }

}
