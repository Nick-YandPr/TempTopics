package Collections.HashMap.task6LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        /*
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]
        */

        System.out.println(Arrays.toString(
                twoSum(new int[]{2, 7, 11, 15}, 9)
        ));
        System.out.println(Arrays.toString(
                twoSum(new int[]{3,2,4}, 6)
        ));
        System.out.println(Arrays.toString(
                twoSum(new int[]{3,3}, 6)
        ));
    }

    public /**/ static /**/ int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberToIndex = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (numberToIndex.containsKey(nums[i])){
                return new int[]{i, numberToIndex.get(nums[i])};
            }
            numberToIndex.put(target - nums[i], i);
        }
        return null;
    }
}
