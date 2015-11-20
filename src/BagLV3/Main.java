package BagLV3;
import java.util.*;
import java.lang.String;
/**
 * Created by Administrator on 2015/11/20.
 */
public class Main {
    public static List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        Bag bag=new Bag();
        bag.InitList(list);//增加元素
        bag.Removelist(list);//删除相同的
        bag.IsEmpty(list);//判断是否为空
        bag.GetNumber(list);//得到元素
        bag.CovertToArray(list);//转换为数组并且搜索想要的数字
    }
}


