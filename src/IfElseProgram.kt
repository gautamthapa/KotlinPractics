fun main(args: Array<String>) {
    var a: Int = 8
    var b: Int = 90

    if (a % 2 == 0)
        println("$a is even number")
    else
        println("$a is odd number")

//---------------------------------------------------------
    // find greatest number
    var result: Int = 0
    result = if (a > b)
        a
    else if (a < b)
        b
    else
        0
    println(result)


    //---------------------------------------------------------
    // String comparison
    var str1: String ="Imgautam"
    var str2: String ="Imgautam"

   /*
   *  if (str1.equals(str2))    //  if (str1.equals(str2, true))  - this ignores the condition
        println("Same")
    else
        println("Not same")*/
    //or
    if (str1==str2)
        println("Same")
    else
        println("Not same")

}