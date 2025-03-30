class Solution {
    public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
        generatePermutations(nums, nums.length, result);
        return result;
    }

    private static void generatePermutations(int[] nums, int n, List<List<Integer>> result) {
        if (n == 1) {
            List<Integer> perm = new ArrayList<>();
            for (int num : nums) {
                perm.add(num);
            }
            result.add(perm);
            return;
        }

        for (int i = 0; i < n; i++) {
            generatePermutations(nums, n - 1, result);

            // Swap based on even/odd index
            if (n % 2 == 0) {
                swap(nums, i, n - 1);
            } else {
                swap(nums, 0, n - 1);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}