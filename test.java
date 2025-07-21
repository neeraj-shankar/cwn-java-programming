import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class test {

    public ArrayList<List<Integer>> solve(int[] nums){

        ArrayList<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        
        for (int i=0; i<nums.length; i++){

            for (int j=i+1; j<nums.length; j++){

                for (int k=j+1; k<nums.length; k++){
                    if ((nums[i] + nums[j] + nums[k])== 0){
                        List<Integer> temp = new ArrayList<>();
                        temp.addAll(Arrays.asList(nums[i], nums[j], nums[k]));
                        // Collections.sort(temp);
                        System.out.println(temp);
                        // set.add(temp);
                        ans.add(temp);
                    }

                }
            }
        }
        System.out.println(set);
            
        // for (List<Integer> triplets: set){
        //     ans.add(triplets);
        // }
        return ans;
    }

    public static void main(String[] args) {
            test t = new test();
            int[] nums = {-1,0,1,2,-1,-4};
            System.out.println(t.solve(nums));
    }
    
}
