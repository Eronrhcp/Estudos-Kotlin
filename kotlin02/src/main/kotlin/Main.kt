fun main(args: Array<String>) {

    // MAP
    // Quando utilizar? Buscas frequentes!
    //um mapOf é imutável
    val map = mutableMapOf("A" to 1, "B" to 2, "C" to 3)
    println(map)
    println(map["B"])
    println(map.isEmpty())
    println(map.count())
    map["A"] = 10
    map["B"] = 20
    map["c"] = 30
    println(map)
    println(map.remove("c"))

    for((key,value)in map){
        println("key: $key, value: $value")
    }
}




/*
*     ARRAYS
*
*   val nums = arrayOf(1,2,3,4)
    println(nums.size)
    println(nums.isEmpty())
    println(nums.first())
    println(nums[1])
    println(nums.sliceArray(0..2).size)
    println(nums.contains(4))
    nums[0] = 10
    println(nums.indexOf(4))
    nums.forEachIndexed { index, el ->
    println("index: $index, elemento: $el")}
*
*
* */
/*
*     LISTAS
*
*
    val l = arrayListOf<Int>(1,2,3,4)
    l.add(5)
    l.remove(1)
    l.addAll(arrayListOf(10,11,11))
    l.set(0,100)

    val n = listOf<String>("a", "b")
*
*
* */