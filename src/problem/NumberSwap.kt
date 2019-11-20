package problem

class NumberSwap {


}

fun main(){

swapWithTemp();
    swapWithoutTemp()

}

fun swapWithTemp():Unit{

    var a =90
    var b= 30

    println("Initial value of a $a, value of b $b")

    var temp = a;
    a = b;
    b = temp;

    println("Exchange value of a $a, value of b $b")

}

fun swapWithoutTemp():Unit{

    var a =90
    var b= 30

    println("Initial value of a $a, value of b $b")

    b = (a+b);
    a = b -a;
    b = b -a;

    println("Exchange value of a $a, value of b $b")

}