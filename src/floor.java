public class floor {
    static void main(String[] args) {
        int[] nums = {4 , 5 ,6 ,8 ,11 ,15 ,19 ,22};
        int target = 18;
        int res =floors(nums , target);
        System.out.println("floor val is : "+ res );
    }
    static int floors(int[] nums , int target){
        int str = 0;
        int end = nums.length - 1;
        int ans = -1;


        while(str<= end){
            int mid = str + (end - str)/2;
            if(nums[mid] <= target){
                ans = nums[mid];
                 str = mid + 1;
            } else{
                 end = mid - 1;
            }
        }
        return ans;
    }
}
