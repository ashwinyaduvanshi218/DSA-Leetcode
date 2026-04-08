import java.util.*;

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            long curr = nums[i];

            while (!st.isEmpty() && st.peek() == curr) {
                curr += st.pop();
            }

            st.push(curr);
        }

        return new ArrayList<>(st);
        // List<Long> result = new ArrayList<>(st);
        //return result;
        
    }
}
/*
import java.util.*;

class Solution {
    public long[] stackToArray(int[] nums) {
        Stack<Long> st = new Stack<>();

        // Fill stack (example logic — same as your merge)
        for (int i = 0; i < nums.length; i++) {
            long curr = nums[i];

            while (!st.isEmpty() && st.peek() == curr) {
                curr += st.pop();
            }

            st.push(curr);
        }

        // Convert stack → array (using loop)
        long[] arr = new long[st.size()];
        int index = 0;

        for (Long val : st) {
            arr[index++] = val;
        }

        return arr;
    }
}*/


/*
List<Long> result = new ArrayList<>(st);
return result;
🎯 Short Interview Answer (1–2 lines)

👉
“This uses the ArrayList constructor that takes a Collection and copies all elements from the given collection into a new list, preserving iteration order.”

🧠 Deep Explanation (step-by-step)
🔹 1. Kaunsa constructor call ho raha hai?
new ArrayList<>(Collection<? extends E> c)

👉 Ye constructor kisi bhi Collection ko accept karta hai
👉 Stack bhi Collection hai (via Vector)

🔹 2. Internally kya hota hai?
Step A: Collection → Array
Object[] arr = c.toArray();

👉 Stack ke saare elements ek array me convert ho jaate hain

Step B: Array copy into ArrayList
elementData = Arrays.copyOf(arr, arr.length);
size = arr.length;

👉 ArrayList apna internal array bana leta hai
👉 Aur usme elements copy kar deta hai

🔹 3. Order ka kya hota hai?

👉 Order same rehta hai as iteration order

Stack iterate hota hai:

Bottom → Top

So:

new ArrayList<>(st)

👉 Result:

[bottom ... top]
🔹 4. Copy ya reference?

👉 Ye shallow copy hai

New list banegi ✔
But elements same reference honge (agar objects hain)
📦 Example (clear visualization)
Stack<Integer> st = new Stack<>();
st.push(2);
st.push(4);
st.push(8);

List<Integer> list = new ArrayList<>(st);

👉 Result:

list = [2, 4, 8]
⚠️ Important Points (interview gold)
✔ 1. Stack safe rehta hai
st unchanged
✔ 2. Time Complexity
O(n)
✔ 3. Why better than loop?
Cleaner code
Internally optimized
Less error-prone
❌ 4. Common mistake
List<Long> result = st; // WRONG

👉 Ye copy nahi hai — same reference hai

🧠 Pro-Level Insight (impress interviewer)

👉
“ArrayList constructor internally uses toArray() of the collection and then copies it into its own dynamic array, ensuring encapsulation and preventing structural dependency on the original collection.”

🚀 Final Answer (best polished version)

Agar interviewer pooche:

👉 “What does new ArrayList<>(st) do?”

Tum bolo:

“It creates a new ArrayList by copying all elements from the given collection. Internally, it converts the collection into an array using toArray() and then copies it into its internal array. The order of elements is preserved based on the collection’s iteration order, and the original collection remains unchanged.”
*/