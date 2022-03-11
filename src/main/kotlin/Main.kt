import com.app.foo.Foo

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    val a = Foo()
    a.doSomething()
    println("Program arguments: ${args.joinToString()}")
}
