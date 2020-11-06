import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class practice1 {
    public static void sum(int[]numbers,int target)
    {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            int x=numbers[i];

        if(map.containsKey(target-x))
            {
                int[]  k=new int[]{map.get(target-x)+1,i+1};
            System.out.println(k);
            }
            map.put(x,i);
        System.out.println(map.get(i));}

}

    public static void main(String[] args) {
        int []numbers={1,2,4,5,6,7,8};
        int target=4;
        sum(numbers,target);
        System.out.println(Arrays.toString(numbers));

    }
}