package XianChengLv2.FirstMethod;

/**
 * Created by Administrator on 2015/11/19.
 */
//继承Thread类方式
public class FirstThread extends Thread{
    //复写run方法
    //将自定义代码存储在run方法中
    public void run(){
        System.out.println("下面跟队形\n凌霄学姐好帅");
        for (int i=1;i<=100;i++)
        {
            System.out.println("凌霄学姐好帅 + "+i);
            //这是中断线程的方法
            if (i==50)
            {
                try {
                    Thread.sleep(2000);
                }
                catch (Exception exception)
                {
                    System.out.println(exception);
                }
            }
        }
    }
}
