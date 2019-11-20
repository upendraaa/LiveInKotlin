package problem

fun main(){

    var inputArray = arrayOf(12,2,23,44,78,1,34,56,789,34)

    var max =0;
    var sMax = 0;

    for (i in 0..inputArray.size-1){

        if(max<inputArray[i]){

            var  temp = max;
            max = inputArray[i]
            sMax = temp;
        }
    }

    println("Value of Max $max  Value of second Max $sMax")

}