fun main(args: Array<String>) {
    /*
    *  var means variable and val means final that means constant
    * */

    // use of var and sum program
    var a : Int=120
    var b : Int =20
    var result : Int = a+b
    println("The addition of $a and $b is $result")


 /*
   // Making objects of kotlin classes
    var clName=Alien()
    clName.name="Harish"
    println("Name is : ${clName.name}")
    clName = Alien()
    println("Name is : ${clName.name}")  // here concatenation using $ sign
    */


    // Access the java class via kotlin class
    // here is no need to write setName and getName ... because that is done by kotlin for us
    // java and kotlin are interoperable
    var imgautam = Aliens()
    imgautam.name="Imgautam"
    println(imgautam.name)
}