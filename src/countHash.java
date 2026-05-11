import java.util.*;
public class countHash {
    static void main(String[] args) {
        int[] arr = { 1 , 1 , 2 , 2 ,3 ,5 ,6 , 7 ,7 ,7};
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0 ; i< n ; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);

        }
        for(int key : map.keySet()){
            System.out.println(key + "=" +map.get(key));
 
        }
    }
}
