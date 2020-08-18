package problem.trees

class TreeImplementation : ITree {


    lateinit var rootNode: TreeNode

    /**
     * Left node should be less than root node
     * Right node can be greater of equals to root node
     */

    fun insertNodeAsBinaryTree(node: TreeNode?, value: Int) {

        if (node!!.root > value) {

            if (node!!.leftNode != null) {
                insertNodeAsBinaryTree(node.leftNode, value)
            } else {
                node.leftNode = initTree(value)
            }
        } else {

            if (node!!.rightNode != null) {
                insertNodeAsBinaryTree(node.rightNode, value)
            } else {
                node.rightNode = initTree(value)
            }
        }

    }


    override fun initTree(root: Int) = TreeNode(root, null, null)

    override fun setLeft(left: TreeNode) {
        rootNode.leftNode = left
    }

    override fun setRight(right: TreeNode) {
        rootNode.rightNode = right
    }

    override fun getLeft() = rootNode.leftNode

    override fun getRight() = rootNode.rightNode

    /**
     * Left-Root-Right
     */
    override fun inOrderTraverse(node: TreeNode?) {

        if (node != null) {
            inOrderTraverse(node.leftNode)
            println("In-Order ${node.root}")
            inOrderTraverse(node.rightNode)
        }

    }

    /**
     * Root-Left-Right
     */

    override fun preOrderTraverse(node: TreeNode?) {
        if (node != null) {
            println("Pre-Order ${node.root}")
            preOrderTraverse(node.leftNode)
            preOrderTraverse(node.rightNode)
        }
    }

    override fun postOrderTraverse(node: TreeNode?) {
        if (node != null) {
            postOrderTraverse(node.leftNode)
            postOrderTraverse(node.rightNode)
            println("Post-Order ${node.root}")

        }
    }
}


fun main() {

    var treeImplementation = TreeImplementation()

    treeImplementation.rootNode = treeImplementation.initTree(20)
    treeImplementation.insertNodeAsBinaryTree(treeImplementation.rootNode, 24)
    treeImplementation.insertNodeAsBinaryTree(treeImplementation.rootNode, 28)
    treeImplementation.insertNodeAsBinaryTree(treeImplementation.rootNode, 12)
    treeImplementation.insertNodeAsBinaryTree(treeImplementation.rootNode, 35)
    treeImplementation.insertNodeAsBinaryTree(treeImplementation.rootNode, 78)
    treeImplementation.insertNodeAsBinaryTree(treeImplementation.rootNode, 10)
    treeImplementation.insertNodeAsBinaryTree(treeImplementation.rootNode, 15)
    treeImplementation.insertNodeAsBinaryTree(treeImplementation.rootNode, 5)
    treeImplementation.insertNodeAsBinaryTree(treeImplementation.rootNode, 9)

    treeImplementation.inOrderTraverse(treeImplementation.rootNode)
    treeImplementation.preOrderTraverse(treeImplementation.rootNode)
    treeImplementation.postOrderTraverse(treeImplementation.rootNode)

}