package problem

import java.util.*

class ConnectedArray{


    fun getArray(): Array<Array<Int>> {

        var intArray = arrayOf<Array<Int>>()

        var row = Scanner(System.`in`).nextInt();
        var column = Scanner(System.`in`).nextInt();

        println("Number of row is $row And number of cloumns is $column")

        for (i in 0..row-1 ) {
            var array = arrayOf<Int>()
            for (j in 0..column-1) {
                array += Scanner(System.`in`).nextInt();
            }
            intArray += array
        }

        for (array in intArray) {
            for (value in array) {
                print("$value ")
            }
            println()
        }
        return intArray;
    }


    fun getConnectedSize(row:Int, column:Int, input:Array<Array<Int>>):Int{

        if(row <0 || column <0 || row>=input.size|| column>=input[row].size)
        {
            return 0;
        }

        if(input[row][column] == 0)
        {
            return 0;
        }

        input[row][column]=0;

        var size =1;
        //until will be row-1 to row+1
        for(i in row-1 until row+2 step 1){

            for (j in column-1 until  column+2 step 1){

                if(i != row || j != column){
                    size += getConnectedSize(i, j, input)

                }
            }
        }

        return  size;
    }

    fun findMaxConnectedArray(input: Array<Array<Int>>){
        println("Number of row is ${input.size} And number of cloumns is ${input[0].size}")

        var maxSize = 0;

        for (i in 0 until input.size step 1){

            for( j in 0 until input[i].size step 1){

              if(input[i][j]==1)
              {
                  var size = getConnectedSize(i,j,input)
                  maxSize = Math.max(size,maxSize)
              }

            }
        }
        println("Max connected size $maxSize")
    }

}




fun main(){

    val  connectedArray= ConnectedArray();
    var inputArray = connectedArray.getArray();
    connectedArray.findMaxConnectedArray(inputArray)

}