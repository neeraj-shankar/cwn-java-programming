class MaximumSubarraySum{

    public int solution(int[] nums){
        
        // Handle negative scenarios
        boolean negative = true;
        int maxElement = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++){
            if (nums[i] >= 0){
                negative = false;
            }
            maxElement = Math.max(maxElement, nums[i]);
            System.out.println("Max Element Value: "+ maxElement);
        }

        int sum = 0, maxSum = -1;

        for (int num: nums){
            sum += num;

            maxSum = Math.max(sum, maxSum);
            if(sum < 0){
                sum = 0;
            }
        }

        return negative?maxElement:maxSum;        
    }

    public int solution2(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];

            max = Math.max(max, sum);
            // max = (sum > max)? sum:max;

            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubarraySum mss = new MaximumSubarraySum();
        int[] nums = {-2, -3, -4};
        System.out.println("Max Sum subarray is: "+ mss.solution(nums));
        System.out.println("Max Sum: "+mss.solution2(nums));
    }
}