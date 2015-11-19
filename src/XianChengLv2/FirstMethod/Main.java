package XianChengLv2.FirstMethod;

/**
 * Created by Administrator on 2015/11/19.
 */
public class Main {
    public static void main(String[] args){
        FirstThread firstThread=new FirstThread();//创建好一个线程
        //这是线程的优先级用法
        firstThread.setPriority(firstThread.MAX_PRIORITY);
        firstThread.start();//开启线程并且执行该线程的run方法
        System.out.println(firstThread.getPriority());

    }
}
