package cn.littlemotor.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * #104
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-depth-of-binary-tree
 */

public class MaximumDepthofBinaryTree {

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  //dfs
  public int maxDepthWithDFS(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftDepth = maxDepthWithDFS(root.left);
    int rightDepth = maxDepthWithDFS(root.right);
    return Math.max(leftDepth, rightDepth) + 1;
  }

  //bfs
  public int maxDepthWithBFS(TreeNode root) {

    if(root==null) return 0;

    int depth = 0;
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.offer(root);
    while( !queue.isEmpty() ){
      depth++;
      int size = queue.size();//注意，这里必须先拿到size!(size是上一层的node个数)
      for(int i = 0; i < size; i++){
        TreeNode node = queue.poll();
        if(node.left != null)
          queue.offer(node.left);
        if(node.right != null)
          queue.offer(node.right);
      }
    }
    return depth;
  }
}
