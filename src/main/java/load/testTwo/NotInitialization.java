package load.testTwo;

import load.testOne.SuperClass;

/**
 * 通过数组定义来引用类，不会触发此类的初始化
 * 触发的是SuperClass数组类的初始化
 */
public class NotInitialization {
    public static void main(String[] args){
        SuperClass[] sca=new SuperClass[10];
        System.out.println(sca.length);
    }
}
