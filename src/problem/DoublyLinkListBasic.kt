package problem


class DoublyLinkListBasic{


    var head:DoubleLInkLIstNode?=null

    fun addItemAtLast(value:Int)
    {
        if(head == null){
            head = DoubleLInkLIstNode(value)
        }
        else{

            var currentNode = head;
            var node = DoubleLInkLIstNode(value)

            while (currentNode!!.getNextNode()!=null){
                currentNode = currentNode.getNextNode();
            }

            node.setPreviousNode(currentNode)
            currentNode.setNextNode(node)

        }
    }

    fun iterateItem( node: DoubleLInkLIstNode){

        var currentNode = node;

        while (currentNode!=null)
        {
            println("Value is ${currentNode.getValue()}")
            currentNode = currentNode.getNextNode()!!
        }

    }
}


fun main(){

    var doublyLinkListBasic = DoublyLinkListBasic();
    doublyLinkListBasic.addItemAtLast(10)
    doublyLinkListBasic.addItemAtLast(12)

    doublyLinkListBasic.addItemAtLast(4)
    doublyLinkListBasic.addItemAtLast(14)
    doublyLinkListBasic.addItemAtLast(5)
    doublyLinkListBasic.addItemAtLast(15)

    doublyLinkListBasic.iterateItem(doublyLinkListBasic.head!!)


}

