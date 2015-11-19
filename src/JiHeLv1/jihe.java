package JiHeLv1;
import java.util.Set;
import java.util.HashSet;
/**
 * Created by Administrator on 2015/11/19.
 */
public class jihe {
    public static void main(String[] args){
        Set<String> set=new HashSet<String>();
        boolean b1=set.isEmpty();//判断这个集合是否为空
        System.out.println(b1);
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("c");
        //相同元素只能算是1个
        boolean b2=set.isEmpty();
        System.out.println(b2);
        int i=set.size();//返回集合中元素的数目
        System.out.println("remove之前set对象的长度是"+i);
        set.remove("a");
        int j=set.size();
        System.out.println("remove之后set对象的长度是"+j);
    }
}
