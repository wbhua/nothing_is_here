package easy;


public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		
		return firrec(root,root);
	}
	public boolean firrec(TreeNode root1,TreeNode root2){
		if(root1 == null && root2 == null)
			return true;
		if(root2 == null || root1 == null)
			return false;
		return firrec(root1.left,root2.right)&&
				firrec(root1.right,root2.left)&&
				root1.val == root2.val ;
		
	}
	public boolean check(TreeNode node){
		if(node.left == null || node.right ==null)
			return false;
		if(node.left.val == node.right .val )
			return true;
		else
			return false;
	}
}
