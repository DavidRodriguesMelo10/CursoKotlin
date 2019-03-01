package fundamentos

// conceito de orientacao a objeto
//literal ponto
fun main(args: Array<String>) {
    val a: Int = 33.dec()
    var b: String = a.toString()

    println("Int: $a")
    println("Primeiro char da String b é: ${b.first()}")
}