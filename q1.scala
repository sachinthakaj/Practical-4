
@ main def  q1() = 
    val quantity = Array(100, 200, 300)
    val item = Array("Rice", "Sugar", "Dhal")
    displayInventory(quantity, item)
    println("-----------------------")
    restockitem(quantity,item,"Rice",20)
    println("-----------------------")
    sellitem(quantity,item,"Gaf",150)
    println("-----------------------")
    println("Enter a number:")
    var number=scala.io.StdIn.readInt()
    PatternMatching(number)
    println("-----------------------")
    q3()

    
    
  

def displayInventory(a1: Array[Int], a2: Array[String]): Unit = {
    var i = 0
    while (i < a1.length) {
      println(s"${a2(i)} :- ${a1(i)}")
      i += 1
    }
  }

def restockitem(a1:Array[Int],a2:Array[String],item:String,new_quantity:Int): Unit = {
    
    if(a2.contains(item)){
      var index=a2.indexOf(item)
      a1(index)=a1(index)+new_quantity
      displayInventory(a1:Array[Int],a2:Array[String])

    }
    else{
      println("There is no such item")
    }
}
def sellitem(a1:Array[Int],a2:Array[String],item:String,new_quantity:Int): Unit = {
    
    if(a2.contains(item)){
      var index=a2.indexOf(item)
      a1(index)=a1(index)-new_quantity
      if(a1(index) < 0){
       println("Not Enough Quantity")
      }
      else{
         displayInventory(a1:Array[Int],a2:Array[String])
      }  
      }
    else{
      println("There is no such item")
    }
    }
def PatternMatching(num:Int)=
  num match 
    case num if(num <= 0) => println(num+" is Negative/Zero")
    case num if(num % 2 == 0)=> println(num+" is an Even number")
    case _ => println(num+ " is an odd number")    

def q3():Unit={
  println(toUpper("SaChiNthKa"))
  println(toUpper("SaChiNthKa"))
  println(formatName("Benny")(toUpper))
  println(formatName("Saman")(toLower))

}

def toUpper(str: String):String = str match {
  case "" => ""
  case s =>
    if s.head >= 'a' & s.head <= 'z' then
      (s.head -32).toChar +: toUpper(s.tail)
    else
      s.head +: toUpper(s.tail)  
}    

def toLower(str: String):String = str match{
  case "" => ""
  case s =>
    if s.head >= 'A' & s.head <= 'Z' then
      (s.head +32).toChar +: toLower(s.tail)
    else
      s.head +: toLower(s.tail)  
}  

def formatName(name: String)(f: (String) => String): String ={
  f(name)
}


