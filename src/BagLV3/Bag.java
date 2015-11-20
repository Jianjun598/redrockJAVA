package BagLV3;

import com.sun.glass.ui.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by Administrator on 2015/11/20.
 */
public class Bag {
    //增加元素到list集合中
    public List InitList(List<Integer> list) {
        int i = 0;
        int num1 = 60;
        for (i = 0; i < num1; i++) {
            list.add(i);
        }
        int j = 0;
        int num2 = 60;
        for (j = 0; j < num2; j++) {
            list.add(j);
        }
        // /返回集合中元素的数目
        int k = list.size();
        System.out.println("删除之前list对象的长度是" + k);
        return list;
    }

    //删除ArrayList中重复元素
    public static void Removelist(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).equals(list.get(i))) {
                    list.remove(j);
                }
            }
        }
        int k = list.size();
        System.out.println("删除之后list对象的长度是" + k);
    }

    //测试是否为空
    public void IsEmpty(List list) {
        boolean b = list.isEmpty();
        System.out.println(b);
    }

    //得到元素
    public void GetNumber(List list) {
        System.out.print(list);
        System.out.print("\n");
    }

    //将集合转换为数组处理
    public void CovertToArray(List list) {
        Integer[] array = (Integer[]) list.toArray(new Integer[list.size()]);
        System.out.println("从list转换成的数组长度为：" + array.length);
        Scanner scanner = new Scanner(System.in);
        //搜索想要的数字
        System.out.print("请输入需要查找的数字：");
        int target = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                System.out.println(target + "位于数字的第" + (i + 1) + "位");
                return;
            }
        }
        System.out.println("数组中不存在数字：" + target);
    }
}


