
open class Person(name: String, lastName: String){
    var fullName: String

    init {
        fullName = "$name $lastName"
    }
    init {
        println(fullName)
    }
}

class Student(name: String, lastName: String) : Person(name, lastName){
    init {
        this.fullName = fullName.toUpperCase()
        println("O nome do aluno é ${this.fullName}")
    }
}

fun main(args: Array<String>) {
    val person1 = Person("Fulano","Sauro")
    val person2 = Person("Beltrano","Sauro")

    val student1 = Student("Fulano","Sauro")
    val student2 = Student("Beltrano","Sauro")
}



/*
*                CLASSES
*
*class Person{
    var name = ""
    var lastName = ""
}

fun main(args: Array<String>) {
    val person1 = Person()
    val person2 = Person()

    person1.name = "Fulano"
    person1.lastName = "da Silva"

    person2.name = "Beltrano"
    person2.lastName = "de Souza"

    person1.run {  }
    person2.run {  }

    println(person1.name + " " + person1.lastName)
}
* */

/*
*         Construtores e inicializadores
*
* class Person(name: String, lastName: String){
    var fullName: String

    init {
        fullName = "$name $lastName"
    }
    init {
        println(fullName)
    }
}

fun main(args: Array<String>) {
    val person1 = Person("Fulano","Sauro")
    val person2 = Person("Beltrano","Sauro")
}
*
* */

/*
*                 Heranças
*
open class Person(name: String, lastName: String){
    var fullName: String

    init {
        fullName = "$name $lastName"
    }
    init {
        println(fullName)
    }
}

class Student(name: String, lastName: String) : Person(name, lastName){
    init {
        this.fullName = fullName.toUpperCase()
        println("O nome do aluno é ${this.fullName}")
    }
}

fun main(args: Array<String>) {
    val person1 = Person("Fulano","Sauro")
    val person2 = Person("Beltrano","Sauro")

    val student1 = Student("Fulano","Sauro")
    val student2 = Student("Beltrano","Sauro")
}
* */