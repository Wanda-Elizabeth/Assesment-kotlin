fun main(){
    name("codehive")
    var d=modulus(34,5)
    println(d)
      var O=fact("Rehema",23)
    println(O)
    var name="wanda"
    println(name.count())

}
fun name(v:String){
    println(v[4].toString() + v[5]+v[6]+v[7])

}
fun modulus(numA:Int,numB:Int):Int{
    var rem=numA%numB
    return rem
}
fun fact(Name:String,Age:Int):String{
    var c="Hi my name is $Name and i am $Age years old ."
    return c
}
fun Name(name:String):String{
    return name
}



