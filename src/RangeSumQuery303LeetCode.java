public class RangeSumQuery303LeetCode {

        int [] Csum;
        public void NumArray(int[] nums) {
            Csum = new int[nums.length];
            Csum[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                Csum[i] = Csum[i - 1] + nums[i];
            }
        }


        public int sumRange(int left, int right) {
          if(left != 0){
              return Csum[right] - Csum[left - 1];
          }
          return Csum[right];
        }
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

