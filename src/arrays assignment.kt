import java.util.*

fun main(){
details("stella","female","kenya","single")
    cities()
    var names=girls("susan","brenda","sharon")
    println(Arrays.toString(names))

}
fun details(name:String,gender:String,country:String,relationship:String){
    var details= arrayOf(name,gender,country,relationship)
    println(Arrays.toString(details))
    numbers()

}
fun cities(){
    var cities= arrayOf("harare","mumbai","jarkata","india")
    println(cities[0].capitalize()+","+cities[1].capitalize()+","+cities[2]+","+cities[3])

}
fun numbers(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    val sum=numbers.component2()+numbers.component5()
    println(sum)
    println(numbers.indexOf(158))
    var sorting= numbers.sortedArray()
    for(elements in sorting){
        println(elements)
    }

    }
fun girls(first:String,second:String,third:String):Array<String>{
    var name= arrayOf(first,second,third)
    return name



}



