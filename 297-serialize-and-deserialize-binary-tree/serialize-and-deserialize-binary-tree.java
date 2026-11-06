/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Serialize: Tree -> String
    public String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();

        preorder(root, sb);

        return sb.toString();
    }

    private void preorder(TreeNode root, StringBuilder sb) {

        if (root == null) {
            sb.append("N,");
            return;
        }

        sb.append(root.val).append(",");

        preorder(root.left, sb);
        preorder(root.right, sb);
    }

    // Deserialize: String -> Tree
    public TreeNode deserialize(String data) {

        String[] nodes = data.split(",");
        int[] index = {0};

        return buildTree(nodes, index);
    }

    private TreeNode buildTree(String[] nodes, int[] index) {

        if (nodes[index[0]].equals("N")) {
            index[0]++;
            return null;
        }

        TreeNode root = new TreeNode(
            Integer.parseInt(nodes[index[0]++])
        );

        root.left = buildTree(nodes, index);
        root.right = buildTree(nodes, index);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));