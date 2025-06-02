class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // First pass: move all non-zero values forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Second pass: fill the rest with zeros
        for (int i = insertPos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
