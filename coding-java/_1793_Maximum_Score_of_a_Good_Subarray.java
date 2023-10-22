import java.util.Stack;

public class _1793_Maximum_Score_of_a_Good_Subarray {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        Stack<int[]> left = new Stack<>();
        Stack<int[]> right = new Stack<>();
        int[][] indexes = new int[nums.length][2];
        
        for(int i = 0 ; i < n; i++){
            while(!left.isEmpty() && nums[i] <= left.peek()[0]){
                left.pop();
            }
            int leftLimit = left.isEmpty() ? 0 : left.peek()[1] + 1;
            indexes[i][0] = leftLimit;
            int[] arr = new int[2];
            arr[0] = nums[i];
            arr[1] = i;
            left.push(arr);
        }
            
        for(int i = n - 1 ; i >= 0; i--){
            while(!right.isEmpty() && nums[i] <= right.peek()[0]){
                right.pop();
            }
            int rightLimit = right.isEmpty() ? n - 1 : right.peek()[1] - 1;
            indexes[i][1] = rightLimit;
            int[] arr = new int[2];
            arr[0] = nums[i];
            arr[1] = i;
            right.push(arr);
        }
        int max = Integer.MIN_VALUE;   
        for(int i = 0 ; i < indexes.length ;i++){
            if(indexes[i][0] <= k && indexes[i][1] >= k){
                max= Math.max(max, (indexes[i][1] - indexes[i][0] + 1) * nums[i]);
            }
        }
            
        return max;
        
        
    }

    public static void main(String[] args){
        Solution s = new Solution();

        int[] nums = {1,4,3,7,4,5};

        int res = s.maximumScore(nums, 3);

        System.out.println(res);
    }
}
