package com.wz.solution.Tree;
/*请实现一个函数，用来判断一颗二叉树是不是对称的。
注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。*/
/*思路1：分治的思想。根节点，不为空，则对称。左右子数都为空就是，不全为空就不是。都不为空的
 * 时候，若值相等就是，若不相等就不是。*/
/*思路2：若前序遍历等于后序遍历，那么对称，这种方法当节点值一样的时候显然是错误的*/

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class isSymmetrical {
	 boolean isSymmetrical(TreeNode pRoot)
	    {
	        if(pRoot==null)
	            return true;
	        return func(pRoot.left,pRoot.right);
	    }
	    boolean func(TreeNode left,TreeNode right){
	        if(left==null && right==null)
	            return true;
	        if(left!=null && right!=null)
	            return left.val==right.val&&func(left.left,right.right)&&func(left.right,right.left);
	        return false;
	    }
}
