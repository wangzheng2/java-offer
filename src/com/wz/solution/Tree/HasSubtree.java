package com.wz.solution.Tree;

/*题目描述
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）*/
/*思路：分治法，递归解决。当root1和root2都不为空的时候做比较，否则直接返回false，如果找到对应root2根节点的点，
 * 以这个根节点为起点判断是否包含root2，如果找不到，那么就再去找root1的左儿子当作起点，去判断是否包含root2，
 * 如果还找不到，那么就再去root1的右儿子当作起点，去判断是否包含root2，返回结果。
 * 如果root2已经遍历完了都能对应的上，返回true。如果root2还没有遍历完，root1却遍历完了。返回false
 * 如果其中有一个点没有对应上，返回false。如果根节点对应的上，那么就分别去子节点里面匹配*/
public class HasSubtree {
	public boolean solution(TreeNode root1, TreeNode root2) {
		boolean resulst = false;
		if (root1 == null || root2 == null)
			return false;
		if (root1.val == root2.val)
			resulst = isSubtree(root1, root2);
		if (!resulst)
			resulst = isSubtree(root1.left, root2);
		if (!resulst)
			resulst = isSubtree(root1.right, root2);
		return resulst;
	}
	private boolean isSubtree(TreeNode root1, TreeNode root2){
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.val!=root2.val)
			return false;
		return isSubtree(root1.left, root2.left)&&isSubtree(root1.right, root2.right);
	}
}
