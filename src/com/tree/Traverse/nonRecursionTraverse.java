package com.tree.Traverse;

import java.util.Stack;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.tree.define.BiTreeNode;

public class nonRecursionTraverse {
	/*
	 * 先根遍历:1。创建一个栈对象，根节点入栈 2.当栈为非空时，将栈顶结点弹出栈内并访该结点
	 * 3.对当前访问节点的非空左孩子结点相继依次访问，并将当前访问结点的非空右孩子节点压入栈内 4.重复执行步骤（2）（3），直到栈为空为止
	 */
	public void preRootTraverse(BiTreeNode T) {
		if (T != null) {
			Stack<BiTreeNode> stack = new Stack<>();// 构造栈
			stack.push(T); // 根节点入栈
			while (!stack.isEmpty()) {
				T = (BiTreeNode) stack.pop(); // 移除栈顶结点,并返回其值
				System.out.println(T.data); // 访问结点
				while (T != null) {
					if (T.lchild != null) { // 访问左孩子
						System.out.println(T.lchild.data);// 访问结点
					}
					if (T.rchild != null) { // 右孩子非空入栈
						stack.push(T.rchild);
					}
					T = T.lchild;
				}
			}
		}
	}

	/*
	 * 中根遍历:1.创建一个栈对象，根节点入栈 2. 若栈非空，则将栈顶节点的非空左孩子相继进栈
	 * 3.栈顶节点出栈并访问非空栈顶结点，并使该栈顶结点的非空右孩子结点入栈 4.重复执行步骤2和步骤3直到栈为空为止
	 */
	public void inRootTraverse(BiTreeNode T) {
		if (T != null) {
			Stack<BiTreeNode> stack = new Stack<>(); // 构造栈
			stack.push(T); // 根节点入栈
			while (!stack.isEmpty()) {
				while (stack.peek() != null) { // 将栈顶结点的左孩子节点相继入栈
					stack.push((BiTreeNode) stack.peek().lchild);
				}
				stack.pop(); // 空结点入栈
				if (!stack.isEmpty()) {
					T = (BiTreeNode) stack.pop(); // 移除栈顶结点,并返回其值
					System.out.println(T.data); // 访问结点
					stack.push(T.rchild); // 结点的右孩子入栈
				}
			}
		}
	}

	/*
	 * 后根遍历:1.创建一个栈对象,根节点进栈.引入访问标记变量flag和结点指针p.p为结点指针,赋初始值null
	 * 2.若栈非空,则栈顶点的非空左孩子相继进栈
	 * 3.若栈非空,查看栈顶结点,若栈顶节点的右孩子为空,或者与p相等,则将栈顶节点弹出栈并访问它,同时使p指向该节点,并置flag值为true.
	 * 否则,将栈顶节点的右孩子压入栈,并置flag值为false
	 * 4.若flag值为true,则重读执行步骤3,否则,重复执行步骤2和步骤3,直到栈为空为止
	 */
	public void postRootTraverse(BiTreeNode T) {
		if (T != null) {
			Stack<BiTreeNode> stack = new Stack<>(); // 构造栈
			stack.push(T); // 根节点进栈
			Boolean flag; // 访问标记
			BiTreeNode p = null; // p指向刚被访问的结点
			while (!stack.isEmpty()) {
				while (stack.peek() != null) { // 将栈顶结点的左孩子相继入栈
					stack.push(((BiTreeNode) stack.peek()).lchild);
					stack.pop(); // 空结点退栈
				}
				while (!stack.isEmpty()) {
					T = (BiTreeNode) stack.peek(); // 查看栈顶元素
					if (T.rchild == null || T.rchild == p) {
						System.out.println(T.data); // 访问结点
						stack.pop(); // 移除栈顶栈顶元素
						p = T; // p指向刚被访问的结点
						flag = true; // 设置访问标记
					} else {
						stack.push(T.rchild); // 右孩子结点入栈
						flag = false; // 设置未被访问标记
					}
					if (!flag)
						break;
				}
			}
		}
	}

}
