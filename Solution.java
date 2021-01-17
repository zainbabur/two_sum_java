class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] correct_indices = new int[2];
        
        boolean solved_flag = false;
        
        for (int i = 0; i < nums.length; i++) {
            
            for (int j = 0; j < nums.length; j++) {
                
                if (j != i) {
                    
                    if (nums[i] + nums[j] == target) {
                        
                        correct_indices[0] = i;
                        correct_indices[1] = j;
                        solved_flag = true;
                        break;
                        
                    }
                    else{
                        ;
                    }
                }
                else {
                    ;
                }
            }
            
            if (solved_flag == true) {
                
                break;
                
            }
            
        }
            
       return correct_indices; 
    }
}
