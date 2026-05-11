public class decending {
    static void main(String[] args) {
        int[] arr1 = { 4 , 22 , 30 , 41 , 42 , 44 , 51 , 99 , 100 , 101 , 151 , 200};
        int target = 51;
//        int res = BinaryDesc(arr1 , target);
//        System.out.println("index of " + target + " is " + res);
        int res = BinarySearchOrderAgnostic(arr1 , target);
        System.out.println(res);
    }
    static int BinarySearchOrderAgnostic(int[] arr1 , int target){
        int str=0;
        int end = arr1.length - 1;
        int ans =-1;
        if(arr1[str] <= arr1[end]){
            return BinaryAsc(arr1 , target);
        } else{
            return BinaryDesc(arr1 , target);
        }
    }
    static int BinaryDesc(int[] arr1 , int target){
        int str=0;
        int end = arr1.length - 1;
        int ans =-1;

        while(str<= end){
            int mid = str + (end - str)/2;
            if(arr1[mid] <target){
                end = mid -1;
            }
            else if(arr1[mid] > target){
                str = mid +1;
            }
            else{
                return  mid;
            }
        } return ans;

    }
    static int BinaryAsc(int[] arr1 , int target){
        int str = 0 ;
        int end = arr1.length - 1 ;
        int ans = -1 ;
        while(str <= end){
            int mid = str + (end - str)/2;
            if(arr1[mid] < target){
                str = mid +1 ;
            } else if(arr1[mid] > target){
                end = mid - 1;
            } else{
               return  mid;
            }

        }
        return ans;
    }
}
