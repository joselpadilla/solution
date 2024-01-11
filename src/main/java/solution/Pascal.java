package solution;

import java.util.List;
import java.util.ArrayList;

public class Pascal {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list, pre=null;
        for(int i=0; i<numRows; i++){
            list =  new ArrayList<>();
            for(int j=0; j <=i; j++){
                if(j==0 || j==i){
                    list.add(1);
                }
                else{
                    list.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = list;
            result.add(list);
        }
        return result;
    }

    public static  void  main(String[] args) {
        generate(5).forEach(System.out::println);
    }
}
