class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int len = arr.length;

        // 1️⃣ Find breaking point (first decreasing element from right)
        int i = len - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If no breaking point → no greater number possible
        if (i < 0) return -1;

        // 2️⃣ Find just greater element from right
        int j = len - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // 3️⃣ Swap
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // 4️⃣ Reverse the suffix (i+1 to end)
        reverse(arr, i + 1, len - 1);

        // 5️⃣ Convert back to number and check overflow
        long num = Long.parseLong(new String(arr));
        return (num > Integer.MAX_VALUE) ? -1 : (int) num;
    }

    // Helper function to reverse array
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}