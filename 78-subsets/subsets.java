class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void dfs(int[] nums, int index,
                     List<Integer> path,
                     List<List<Integer>> result) {

        result.add(new ArrayList<>(path)); // store subset

        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);          // choose
            dfs(nums, i + 1, path, result); // explore
            path.remove(path.size() - 1);   // un-choose
        }
    }
}
