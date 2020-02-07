package problem

import java.util.*

class BinarySearch{


}

fun main() {

    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    var arr = arrayOfNulls<Int>(size)


    for (i in 0 until size) //this will exclude las element
    {
        arr[i] = scanner.nextInt()
    }

    for (i in arr) {
        println("Value is $i")
    }
}