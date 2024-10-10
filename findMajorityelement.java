public class findMajorityelement {
       public static int majorityElement(int[] nums) {
            int ele=nums[0];
            int count=0;
            for(int i=0;i<nums.length;i++){
               if(count==0){
                ele=nums[i];
                count=1;
               }
               else if(nums[i]==ele){
                count++;
               }
               else{
                count--;
               }
            }
            return ele;
        }
    
  public static void main(String[] args) {
    int nums[] = {2,1,3,3,3,3,2};
    System.out.println("Majoritity Element is: "+majorityElement(nums));
  }
    
}