package problem

class DoubleLInkLIstNode{


    private var previousNode:DoubleLInkLIstNode?
    private var nextNode:DoubleLInkLIstNode?
    private var value:Int?

    constructor(value:Int)
    {
        this.value = value;
        previousNode = null;
        nextNode = null
    }



    fun getPreviousNode(): DoubleLInkLIstNode? {
        return previousNode;
    }

    fun getNextNode(): DoubleLInkLIstNode? {
        return nextNode;
    }

    fun setPreviousNode(node: DoubleLInkLIstNode) {
        this.previousNode = node
    }

    fun setNextNode(node: DoubleLInkLIstNode) {
        this.nextNode = node
    }

    fun setValue(value: Int) {
        this.value = value
    }

    fun getValue():Int? {
        return value
    }
}