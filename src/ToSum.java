public class ToSum {
    public int[] twoSum(int[] nums, int target) {
        int [] temp = new int[2];
      for(int i=0;i<nums.length-1;i++){
          for(int j=i+1;j<nums.length-1;j++){
              if(nums[i]+nums[j]==target){
                  temp[i]=nums[i];
                  temp[j]=nums[j];


              }
              return  temp;
          }
      }
      return temp;
    }
}
