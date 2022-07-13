fun main(){
    var items: Array<Int> = arrayOf(4,6,1,7,2,0,15)
    var list: List<Int> = listOf(4,6,1,7,2,0,15)
    var mList= mutableListOf<Any>(4,6,1,7,2,0,15) //mutable list with add remove replace etc

    mList.add("new Element")
    var dogs = listOf("Bob", "Mark")
    mList.addAll(2, dogs)

    println(items[4])
    println(items.get(0))
    items.set(2, 100)
    println(items.get(2))
    println(items.size)
    println("=======")

    var map: Map<Int,String> = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    var map2: Map<Int,Any> = mapOf(1 to "One", 2 to 2, 3 to true) //Any type let put different types in map
    var map3= mapOf(1 to "One", 2 to 2, 3 to true)

    var mutMap= mutableMapOf(1 to "One", 2 to "Two", 3 to "Three")
    mutMap.put(4, "Four")

    mutMap.forEach{key, value -> println("$key -> $value") }


    /*
    for (el in items){
        println(el)
    }

    //print array
    items.forEach { el-> println(el) }

    items.forEachIndexed{index, el ->
        println("Element: $el has index: $index")
    }
     */




}

