package problem

//Creating stack using the link list

 class StackLinkList
{

    private var head:LinkListNode?= null;

    fun push(value:Int){

        if(head == null)
        {
            head = LinkListNode(value);
        }else {

            var node = LinkListNode(value)
            node.setNode(head!!)
            head = node;
        }
    }

    fun pop(){

        if(head == null)
        {
            println("Empty stack")
        }else
        {
            head = head!!.getNode();

            println("New head is $head")
        }

    }

    fun retrieveStack(){

        var node = head;
        while (node!=null)
        {
            print("${node.getValue()}  ")
            node = node.getNode();
        }
    }


}

fun main(){

    var stackLinkList=StackLinkList()

    stackLinkList.push(1);
    stackLinkList.push(2);
    stackLinkList.push(3);
    stackLinkList.push(4);
    stackLinkList.push(5);
    stackLinkList.push(6);

    stackLinkList.retrieveStack();

    stackLinkList.pop();
    stackLinkList.pop();
    stackLinkList.retrieveStack();
}
