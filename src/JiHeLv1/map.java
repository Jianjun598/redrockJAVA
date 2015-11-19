package JiHeLv1;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by Administrator on 2015/11/19.
 */
public class map {
    public static void main(String[] args){
        HashMap<String,String> hashMap=new HashMap<String,String>();
        Map<String,String> map=hashMap;
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        map.put("3","e");
        int i=map.size();
        System.out.println(i);
        String string=map.get(3);
        System.out.println(string);
    }
}
