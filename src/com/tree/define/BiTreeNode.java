package com.tree.define;

public class BiTreeNode {
	public Object data;                    //节点的数据域
	public BiTreeNode lchild,rchild;       //左右孩子域
	//构造一个空节点
	public BiTreeNode() {
		this(null);
	}
	//构造一个左右孩子为空的二叉树
	public BiTreeNode(Object data) {
		this(data,null,null);
	}
	//构造一个左右孩子不为空的二叉树
	public BiTreeNode(Object data, BiTreeNode lchild, BiTreeNode rchild) {
		super();
		this.data = data;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	
	

}
