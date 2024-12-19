public class twoSums {
    public int[] twoSum(int[] nums, int target) {
        int[] result =new int[2];
        for(int i =0 ; i < nums.length -1 ; i++){
            if(nums[i]>target){
                continue;
            }
            result[0] = i;
            for(int j = i +1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    //condition meet
                    result[1] =  j;
                    return result;
                }
            }

        }
        return result;
    }
}
