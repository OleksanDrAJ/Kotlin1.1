fun main(){
    sayHello()
    secondFunction(35, 9)
    println(saySomthg())
}

fun saySomthg(): String = "Hey dude"

fun sayHello(){
    println("Hello from first function")
}

fun secondFunction(x: Int, y:Int): Int{
    var res = x + y
    println("Summary= $res")
    return res
}