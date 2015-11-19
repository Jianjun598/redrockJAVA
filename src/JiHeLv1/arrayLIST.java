package JiHeLv1;
import java.util.ArrayList;
/**
 * Created by Administrator on 2015/11/19.
 */
public class arrayLIST {public static void main(String[] args){
    ArrayList<String> arrayList=new ArrayList();
    arrayList.add("a");
    arrayList.add("b");
    arrayList.add("c");
    arrayList.add("d");
    //list是有顺序的，add的编号从0开始
    // 这样就可以通过remove（编号）的形式进行删除
    // 之后后面的会编号依次变小,编号总是连续的
    //如果在remove(1)，就是删除c
    arrayList.remove(1);
    for (int i=0;i<arrayList.size();i++)
    {
        String string = arrayList.get(i);
        System.out.println(string);
    }
}
}
