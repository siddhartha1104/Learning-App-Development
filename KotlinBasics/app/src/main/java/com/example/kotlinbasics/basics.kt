


fun main(){

    for(num in 1..10){
        print(num)
    }
    print("\n")

    for(num in 1..10){
        print("$num ")
    }

    print("\n")

    for(i in 12 downTo 1){
        print("$i ")
    }

    print("\n")

    for(i in 12 downTo 1 step 2){
        print("$i ")
    }

    print("\n")

    println("sum is: ${add(5,3)}")

}
fun add(a: Int, b: Int): Int{

    return a+b

}


