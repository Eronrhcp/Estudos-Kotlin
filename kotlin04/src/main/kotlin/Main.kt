
fun main(args: Array<String>) {
     val names = arrayListOf<String>()

    names.add("Fulano")
    names.add("Beltrano")
    names.add("Sauron")
    names.add("Bilbo")

    val filtered = names.filter {
        it.contains("a")
    }

    println(filtered)
}


/*
*         GENERICS
*
data class Student(val name: String)

interface MyArray<T>{
    fun addItem(item: T)
    fun removeItem(item: T)
}

class MyArrayImplement<T> : MyArray<T>{
    var items = arrayListOf<T>()

    override fun addItem(item: T) {
        items.add(item)
    }

    override fun removeItem(item: T) {
        items.remove(item)
    }

}

fun main(args: Array<String>) {
    val names = arrayListOf<String>()

    val mList = MyArrayImplement<Student>()
    mList.addItem(Student("Beltrano"))
}
*
* */

/*
*         LAMBDAS
*
fun handleInt(x: Int, operation: (Int) -> Unit){
    operation(x)
}

fun main(args: Array<String>) {
     handleInt(10){ numero ->
         print("Olá ${numero * 50}")
     }
}
*
* */