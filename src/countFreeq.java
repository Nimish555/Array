public class countFreeq {
    static void main(String[] args) {
        int[] arr = { 1 , 2 , 2 ,3 ,1 , 1, 2, 2, 3, 9, 6, 6 };
        int freeq = 1;
        int n = arr.length;
        boolean[] visited = new boolean[n];
        for(int i = 0 ; i< n ; i++){ //outer loop
            if(visited[i]) continue;
            int count = 1 ;
            for(int j = i + 1 ; j< n ; j++){  //inner loop
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " = " + count);
        }



    }
}
