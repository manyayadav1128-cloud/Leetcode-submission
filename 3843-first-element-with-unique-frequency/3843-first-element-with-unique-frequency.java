class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num:nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        HashMap<Integer, Integer> freq= new HashMap<>();
        for(int j: count.values()){
            freq.put(j, freq.getOrDefault(j, 0)+1);
            
            
            }for(int num :nums){
                if(freq.get(count.get(num))==1){
                    return num;
                }
            }
            return -1;
            }
          
        }
        
