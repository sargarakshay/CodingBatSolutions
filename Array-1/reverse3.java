// Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

// reverse3([1, 2, 3]) → [3, 2, 1]
// reverse3([5, 11, 9]) → [9, 11, 5]
// reverse3([7, 0, 0]) → [0, 0, 7]

public int[] reverse3(int[] nums) {
    int index = 0;
    int temp = nums[0];
    for(int i = nums.length-1; i >= 0; i--) {
      nums[index++] = nums[i];
    }
    nums[nums.length-1] = temp;
    return nums;
  }
  