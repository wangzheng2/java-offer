package com.wz.solution.Tree;

/*题目描述
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。*/
/*思路：在顺次打印基础上稍作修改。每次打印一个节点的时候，如果该节点有子节点，则把该节点的自家店放到一个队列的末尾。接下来到队列头部取出最早
进入队列的节点，重复前面的打印操作，直至队列中所有的节点都被打印出来。改变顺序时，隔行逆序*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZPrint {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if (pRoot == null)
			return ret;
		queue.add(pRoot);
		boolean flag = false; // 设置反转标志位
		while (!queue.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<>(); // 每一个层次用一个arraylist来装val
			int count = queue.size();                    //队列中的元素个数，即为每层节点个数。
			while (count-- > 0) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			if (flag)
				Collections.reverse(list);              //先拿到节点，然后再变顺序。
			flag = !flag;
			ret.add(list);
		}
		return ret;
	}
}


