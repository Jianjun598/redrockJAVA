package JiHeLv1;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
/**
 * Created by Administrator on 2015/11/19.
 */
public class iterator {
    public static void main(String[] args){
        Set<String> set=new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("c");
        //调用set对象的Iterator方法，会生成一个迭代器对象，该对象用于遍历整个set
        Iterator<String> it=set.iterator();
        boolean b1=it.hasNext();
        if (b1){
            String string=it.next();
            System.out.println(string);
        }
        boolean b2=it.hasNext();
        if (b2){
            String string=it.next();
            System.out.println(string);
        }
    }
}
