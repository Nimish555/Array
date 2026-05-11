public class duplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 5, 6, 8, 9, 10};
        int target = 3;

        int first = BinarySearch(arr, target, true);
        int last  = BinarySearch(arr, target, false);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }

    static int BinarySearch(int[] arr, int target, boolean firstocc) {
        int str = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (str <= end) {
            int mid = str + (end - str) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if (firstocc) {
                    end = mid - 1;   // left side
                } else {
                    str = mid + 1;   // right side
                }
            }
            else if (arr[mid] < target) {
                str = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
