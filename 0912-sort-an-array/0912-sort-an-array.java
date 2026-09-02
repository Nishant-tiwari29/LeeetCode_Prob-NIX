import java.util.Random;

class Solution {
    private final Random rand = new Random();

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int l, int r) {
        if (l >= r) return;

        int pivotIndex = l + rand.nextInt(r - l + 1);
        int pivot = nums[pivotIndex];
        swap(nums, l, pivotIndex);

        int lt = l;
        int i = l + 1;
        int gt = r;

        while (i <= gt) {
            if (nums[i] < pivot) {
                swap(nums, lt++, i++);
            } else if (nums[i] > pivot) {
                swap(nums, i, gt--);
            } else {
                i++;
            }
        }

        
        quickSort(nums, l, lt - 1);
        quickSort(nums, gt + 1, r);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}