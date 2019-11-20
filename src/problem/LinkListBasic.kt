package problem

class LinkListBasic{
    
    private var head: LinkListNode? = null;


    fun addItem(item:Int) {

        if (head == null) {
            head = LinkListNode(item);
        } else {

            var temp = head;

            while (temp!!.getNode() != null) {

                temp = temp.getNode();
            }

            temp.setNode(LinkListNode(item))
        }
    }

    fun iterateList(){

        var node = head;
        while (node!=null){
            println("Item ${node!!.getValue()}")
            node = node.getNode();
        }
    }





}

fun main(){

    var linkListBasic = LinkListBasic();

    linkListBasic.addItem(12)
    linkListBasic.addItem(9)
    linkListBasic.addItem(13)
    linkListBasic.addItem(8)
    linkListBasic.addItem(17)
    linkListBasic.addItem(10)

    linkListBasic.iterateList();

}