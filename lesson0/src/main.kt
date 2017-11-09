fun main(args: Array<String>){

    var a1 = "123"
    println(a1)

    var a7: Byte = 2
    var a6: Short = 11
    var a2: Int = 123
    var a5: Float = .1F // ~int
    var a4: Double = .1 // ~long
    var a3: Long = 123

    var b1: Float = a2.toFloat()

    var c1: Char = 'a'
    var bol: Boolean = true

    var name: String = "Evi"
    println("hello $name")

    var UserName = FirstKotlinClass(name) //экземпляр класса?
    println("${UserName.username} This is val of class")
    UserName.PrintName()

    val result = MyFun4(3,4F) // F- Float var
    print(result)
}

fun MyFun1(): Int {
    return 1
}

fun MyFunA(a: Long): Int {
    return a.toInt()
}

fun MyFun3(){
    println("MyFun3")
}

fun MyFun4(a: Long, b: Float) = a + b