package XianChengLv2.SecondMethod;

/**
 * Created by Administrator on 2015/11/19.
 */
public class Main {
    public static void main(String[] args){
        //先生成一个Runnable接口实现类的对象
        SecondThread secondThread=new SecondThread();
        //然后生成一个Thread对象，并将Runnable接口实现类的对象作t为参数
        //传递给该Thread对象
        Thread thread=new Thread(secondThread);
        //线程的优先级 最大是10 最小是1 可以使用Thread提供的静态常量来设置
        thread.setPriority(Thread.MAX_PRIORITY);
        //通知Thread对象，执行start方法
        thread.start();
        System.out.println(thread.getPriority());
    }
}
