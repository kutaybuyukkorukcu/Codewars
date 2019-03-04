import java.util.HashMap;
public class Solution{
    public static int[] twoSum(int[] numbers, int target){
        int len = numbers.length;
        if(len == 0) return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<len;i++){
          int remainder = target  - numbers[i];
          if(map.containsKey(remainder)){
            return new int[] {map.get(remainder), i};}
          else
            map.put(numbers[i], i);
        System.out.println(map.get(remainder) + " " + i + " " + remainder);
        }
        return null;
    }
}
