fun main ()
{
   //Variables and Constants

    //Integer
    var x = 5
    var y = 4
    println(x+y)

    var Age = 35
    val result = Age/7*5
    println(result)

    //Defining
    val myInterger: Int

    //Initialize
    myInterger = 10

    val a: Int = 23
    println(a/2)

    //Long
    var myLong: Long = 100

    //Double and Float
    val pi = 3.14
    println(pi*2)

    val myfloat = 3.14f
    println(myfloat*2)

    var myAge: Double
    myAge = 23.0
    println(myAge/2)

    //Strings
    val myString = "mert can Unek"
    val name = "Mert Can"
    val surname = "Unek"

    val fullName = name + " " + surname
    println(fullName)

    println(myString.capitalize())

    //Boolean
    var myBoolean : Boolean = true
    myBoolean = false

    var isAlive = true
    println(3<5)
    println(8<5)

    //Conversion
    var myNumber = 5
    var myLongNumber = myNumber.toLong()
    println(myLongNumber)

    var input = "10"
    var inputInteger = input.toInt()
    println(inputInteger * 2)

    //Collections

    //Arrays
    val myArray = arrayOf("Mehmet","Ali","Mert","Can")
    println(myArray[0])
    myArray[0] = "Cilek"
    println(myArray[0])
    myArray.set(1,"Oglus")
    println(myArray[1])

    val numberArray = arrayOf(1,2,3,4,5)
    println(numberArray[3])

    val mynewArray = doubleArrayOf(1.0,2.0,3.0,4.0)
    val mixedArray = arrayOf(5,"Mert")
    println(mixedArray[0])
    println(mixedArray[1])

    //List -- ArrayList

    val myMusician = arrayListOf<String>("Mert","Can")
    myMusician.add("Oglus")
    println(myMusician[2])
    myMusician.add(0,"Cilek")
    println(myMusician[0])

    val myArrayList = ArrayList<Int>()
    myArrayList.add(1)
    myArrayList.add(200)

    val myMixedArrayList = ArrayList<Any>()
    myMixedArrayList.add("Elma")
    myMixedArrayList.add(12.25)
    myMixedArrayList.add(true)

    println(myMixedArrayList[0])
    println(myMixedArrayList[1])
    println(myMixedArrayList[2])

    //Set

    val myExampleArray = arrayOf(1,1,2,3,4)
    println("element 1: ${myExampleArray[0]}")
    println("element 2: ${myExampleArray[1]}")
    println("element 3: ${myExampleArray[2]}")

    val mySet = setOf<Int>(1,1,2,3)
    println(mySet.size)

    //for Each
    mySet.forEach{ println(it) }

    val myStringSet = HashSet<String>()
    myStringSet.add("Mertcan")
    myStringSet.add("Mertcan")
    println(myStringSet.size)

    //Map -- HashMap

    val fruitArray = arrayOf("Apple","Banana")
    val caloriesArray = arrayOf("100","200")

    println("${fruitArray[0]}: ${caloriesArray[0]}")

    val fruitCalorieMap = hashMapOf<String,Int>()
    fruitCalorieMap.put("Apple",100)
    fruitCalorieMap.put("Banana",150)

    println(fruitCalorieMap["Apple"])
    
    val myHashMap = HashMap<String,String>()

    val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2, "C" to 3)
    println(myNewMap["C"])

    //Control Statements

    val myNumberAge = 32

    if(myNumberAge<30)
    {
        println("<30")
    }else if(myNumberAge>=30 && myNumberAge<40)
    {
        println(">=30 && <40")
    }

    val day = 3
    var dayString = ""

    /*
    if(day == 1)
    {
        dayString = "Monday"
    }else if (day == 2)
    {
        dayString = "Tuesday"
    }else if (day == 3)
    {
        dayString = "Wednesday"
    }
    println(dayString)

     */

    when (day)
    {
        1-> dayString = "Monday"
        2-> dayString = "Tuesday"
        3-> dayString = "Wednesday"
        else -> dayString = " "
    }
    println(dayString)

    //Loops

    val myArrayofNumbers = arrayOf(12,15,18,21,24,27,30,33)
    val q = myArrayofNumbers[0] / 3 * 5
    println(q)

    for(number in myArrayofNumbers)
    {
        val z = number / 3 * 5
        println(z)
    }

    val myStringArrayList = ArrayList<String>()
    myStringArrayList.add("Mert")
    myStringArrayList.add("Can")
    myStringArrayList.add("Unek")
    myStringArrayList.add("Oglus")
    myStringArrayList.add("Cilek")

    for (str in myStringArrayList)
    {
        println(str)
    }

    var j = 0
    while (j<10)
    {
        println(j)
        j++

    }
}