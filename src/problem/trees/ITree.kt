package problem.trees

interface ITree {

    fun initTree(root: Int): TreeNode;
    fun setLeft(left: TreeNode)
    fun setRight(right: TreeNode)
    fun getLeft(): TreeNode?
    fun getRight(): TreeNode?
    fun inOrderTraverse(node: TreeNode?)
    fun preOrderTraverse(node: TreeNode?)
    fun postOrderTraverse(node: TreeNode?)


}