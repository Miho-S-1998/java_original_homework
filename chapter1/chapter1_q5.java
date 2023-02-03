import java.util.HashMap;
import java.util.Map.Entry;
public class chapter1_q5 {
	public static void main(String[]args) {

    HashMap<Integer,String>fruits=new HashMap<Integer,String>();

    fruits.put(1, "りんご");
    fruits.put(2, "いちご");
    fruits.put(3, "みかん");
    fruits.put(4, "バナナ");
    fruits.put(5, "メロン");

    for(Entry<Integer,String>entry:fruits.entrySet()) {

    	System.out.println(entry.getKey()+" "+entry.getValue());

    }
  }

}
