package XianChengLv2.SecondMethod;

/**
 * Created by Administrator on 2015/11/19.
 */
public class SecondThread implements Runnable{
    public void run(){
        for (int i=1;i<=100;i++)
        {
            System.out.println("子汐学长好美 +"+i);
        }
    }
}
