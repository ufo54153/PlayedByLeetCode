import arcturus.util.*;

public class Solution1 extends Solution {
    /**
     * 题目描述：利用给出的前序遍历和中序遍历的结果（两个数组），还原二叉树。
     * 解：
     * 递归求解。前序遍历得到的结果具有这样的递归结构：
     *      根节点  左子树的前序遍历结果  右子树的前序遍历结果
     * 中序遍历得到的结果具有这样的递归结构：
     *      左子树的中序遍历结果  根节点  右子树的中序遍历结果
     * 先利用前序遍历数组得到根节点，然后依次递归求解即可
     * @param preorder
     * @param inorder
     * @return
     */
    @Override
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeCore(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeCore(int[] preorder, int pstart, int pend, int[] inorder, int istart, int iend) {
        if (pstart > pend) return null;
        TreeNode node = new TreeNode(preorder[pstart]);
        int pos = istart;
        for (int i = istart; i <= iend; i++) {
            if (inorder[i] == preorder[pstart]) {
                pos = i;
                break;
            }
        }
        node.left = buildTreeCore(preorder, pstart + 1, pos - istart + pstart, inorder, istart, pos - 1);
        node.right = buildTreeCore(preorder, pos - istart + pstart + 1, pend, inorder, pos + 1, iend);
        return node;
    }
}