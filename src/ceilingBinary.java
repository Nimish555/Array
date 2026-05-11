public class ceilingBinary {
    public static void main(String args[]) {
        int[] arr = {1 , 3 , 5 , 8 , 9 , 11 ,15 ,20};
        int target = 10;
         int result =ceiling(arr , target);
         System.out.println("ceiling val is : " + result);
        }
        static int ceiling(int[] arr , int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        int ans =-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= target){
                ans = arr[mid];
                end = mid -1;  // ab left side search kr rahe
            } else{
                start = mid + 1;
            }

        }

        return ans;
        }

    }

