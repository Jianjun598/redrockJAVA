package XianChengLv2.XianChengSafe;

/**
 * Created by Administrator on 2015/11/19.
 */
public class Main {
    public static void main(String[] args)
    {
        MyThread myThread=new MyThread();
        //生成两个Thread对象，共用一个线程体
        Thread thread1=new Thread(myThread);
        Thread thread2=new Thread(myThread);
        //每一个线程都有名字 用setName设置或者getName获取
        thread1.setName("线程a");
        thread2.setName("线程b");
        //分别启动两个线程
        thread1.start();
        thread2.start();
    }
}
