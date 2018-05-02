/*
===[Generics]===
keyword: "out", "in"
In Kotlin, class and type are totally different concept
Ex] List-Class, List<String> - type 		
*/

fun main(args: Array<String>){
	var objet = genericsExample<String>("JAVA")
	var objet1 = genericsExample<Int>(10)
	
	var objet2 = genericExample2<Int>(10)
		var objet3 = genericExample2<Double>(10.00)
}

class genericsExample<T>(input:T){
	init{
		println("I am getting called with the value " + input)
	}
}

//When we want to assign the generic type to any of its super type, use "out" keyword
//When we want to assign the generic type to any of its sub-type, use "in" keyword

class genericExample2<out T>(input:T){
	init{
		println("I am getting called with the value " + input)
	}
}