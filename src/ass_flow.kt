fun main(){
 numbers()
    words("sabdio", "sarah", "waunita", "diana")
    robot(3)
    robot(12)
    game()


}
fun numbers(){
    for(num in 1..100){
        if(num % 2 !=0){
            println(num)
        }
    }
}
fun words(name1:String, name2:String, name3:String, name4:String,):Array<String>{
    var names= arrayOf(name1,name2,name3,name4)
    for (name in names)
        if(name.length>5) {
            println(name)
        }
    return names
}
fun robot(age:Int){
    if(age<=6){
        println("serve a glass of milk for the guest")
    }
    else if(age in 6..15){
        println("serve a bottle of fanta orange for the guest")
    }
    else
        println("serve a bottle of coka cola for the quest")
}
fun game(){
    for(numbers in 1..100) {
        if (numbers % 3 == 0 && numbers% 5 ==0) {
            println("FizzBuzz")
        } else if (numbers % 3 ==0) {
            println("Fizz")
        } else if (numbers % 5 ==0) {
            println("Buzz")}
        else{
            println(numbers)
        }
    }
}