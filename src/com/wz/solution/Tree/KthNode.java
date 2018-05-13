package com.wz.solution.Tree;
/*题目描述
给定一颗二叉搜索树，请找出其中的第k大的结点。
例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。*/
/*思路：利用二叉搜索树中序遍历有序的特点。*/
public class KthNode {
	private TreeNode ret;
	private int count=0;
	public TreeNode KthNode(TreeNode pRoot,int k){
		KthNode(pRoot,k);
		return ret;
	}
	private void inorder(TreeNode root,int k){
		if(root==null || count>=k)
			return;
		inorder(root.left, k);
		count++;
		if(count==k)
			ret=root;
		inorder(root.right, k);
	}
}
