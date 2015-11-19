package LV4;

/**
 * Created by Administrator on 2015/11/19.
 */
public class Main {
    public static void main(String []args){
        Fork fork = new Fork();
        new Philosopher("1",fork).start();
        new Philosopher("2",fork).start();
        new Philosopher("3",fork).start();
        new Philosopher("4",fork).start();
        new Philosopher("5",fork).start();
    }

}
