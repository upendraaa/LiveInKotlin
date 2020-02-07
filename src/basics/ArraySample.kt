package basics

fun main() {

    //Pre initialized with values
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    array1.forEach {
        println("Array1 element $it")
    }
    //Initialized with size
    val array2 = arrayOfNulls<Int>(5)
    //This for loop wil exclude last value
    for (i in 0 until 5) {
        array2[i] = i * 2
    }
    //Accessing with index
    array2.forEachIndexed { index, i ->
        println("Value at $index is  $i ")
    }

    //Generate element via method
    val array3 = Array(5) { i -> "Generated element: $i" }
    array3.forEach {
        println("array3  $it")
    }


}