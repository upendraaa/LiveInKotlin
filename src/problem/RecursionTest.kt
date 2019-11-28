package problem

class RecursionTest{


    fun factorial(n:Int):Int{

        if(n == 1)
        {
            return 1;
        }else {
            return n * factorial(n-1);
        }

    }
}

fun main(){

    var recursionTest = RecursionTest();

    val factorialValue = recursionTest.factorial(4);

    println("Factorial value is $factorialValue")
}