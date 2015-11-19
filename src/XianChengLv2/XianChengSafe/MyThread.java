package XianChengLv2.XianChengSafe;

/**
 * Created by Administrator on 2015/11/19.
 */
public class MyThread implements Runnable{
    //这个同步线程不是很懂啊。。注释就没有了。。让我再研究研究
    int i=100;
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + i);
            i--;
            Thread.yield();
            if (i <0) break;
        }
    }
}
