package problem

class LinkListNode{

    private var value:Int?
    private var linkListNode:LinkListNode?

    constructor(value:Int){

        this.value = value;
        linkListNode = null;
    }

     fun setNode(node: LinkListNode)
    {
        this.linkListNode = node;
    }

     fun getNode(): LinkListNode? {
        return linkListNode;
    }

     fun setValue(value: Int){
        this.value = value;
    }

     fun getValue(): Int? {
        return value;
    }



}