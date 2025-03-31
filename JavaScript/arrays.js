function getSecondLargest(nums) {
  let max = -Infinity;
  let secondMax = -Infinity;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] > max) {
      secondMax = max;
      max = nums[i];
    } else if (nums[i] > secondMax && nums[i] < max) {
      secondMax = nums[i];
    }
  }
  return secondMax;
}
