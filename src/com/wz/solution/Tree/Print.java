package com.wz.solution.Tree;
/*题目描述
从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。*/
/*思路：每次打印一个节点的时候，如果该节点有子节点，则把该节点的自家店放到一个队列的末尾。接下来到队列头部取出最早
进入队列的节点，重复前面的打印操作，直至队列中所有的节点都被打印出来。*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Print {
	public ArrayList<ArrayList<Integer>> solution(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
		if(pRoot==null)
			return ret;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(pRoot);
		while(!queue.isEmpty()){
			ArrayList<Integer> list=new ArrayList<>();
			int count=queue.size();
			while(count-->0){
				TreeNode node=queue.poll();
				list.add(node.val);
				if(node.left!=null)
					queue.add(node.left);
				if(node.right!=null)
					queue.add(node.right);				
			}
			ret.add(list);
		}
		return ret;
	}
}

