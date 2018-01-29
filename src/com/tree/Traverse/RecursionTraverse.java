package com.tree.Traverse;

import com.tree.define.BiTreeNode;

public class RecursionTraverse {
	public void preRootTraverse(BiTreeNode T){
		if(T!=null){
			System.out.println(T.data);    //访问根节点
			preRootTraverse(T.lchild);     //先根遍历左子树
			preRootTraverse(T.rchild);     //先根遍历右子树
		}
	}
	public void inRootTraverse(BiTreeNode T){
		if(T!=null){
			inRootTraverse(T.lchild);     // 中根遍历左子树
			System.out.println(T.data);   //访问根节点
			inRootTraverse(T.rchild);     //中根遍历右子树
		}
	}
	public void postRootTraverse(BiTreeNode T){
		if(T!=null){
			postRootTraverse(T.lchild);   //后根遍历左子树
			postRootTraverse(T.rchild);   //后根遍历右子树
			System.out.println(T.data);   //访问根节点
		}
	}
}
