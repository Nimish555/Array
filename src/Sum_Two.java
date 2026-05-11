public class Sum_Two {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 0, 3};
        int target = 3;
        int n = arr.length;
        boolean found = false;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println(i + " " + j);  
                    found = true;
                    return;   // pura program stop
                }
            }
        }
        if (!found) {
            System.out.println("not present");
        }
    }
}
