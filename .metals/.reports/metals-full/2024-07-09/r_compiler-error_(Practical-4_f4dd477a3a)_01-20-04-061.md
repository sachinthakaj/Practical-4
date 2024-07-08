file:///C:/Users/Sachinthaka/OneDrive/Desktop/2Y%20SEM1/Functional%20Programming/Practical-4/q1.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sachinthaka/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 1332
uri: file:///C:/Users/Sachinthaka/OneDrive/Desktop/2Y%20SEM1/Functional%20Programming/Practical-4/q1.scala
text:
```scala

@ main def  q1() = 
    val quantity = Array(100, 200, 300)
    val item = Array("Rice", "Sugar", "Dhal")
    displayInventory(quantity, item)
    println("-----------------------")
    restockitem(quantity,item,"Rice",20)
    println("-----------------------")
    sellitem(quantity,item,"Gaf",150)
     println("-----------------------")
    
    
  

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
  num m@@    







```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.sortSubclasses(MatchCaseCompletions.scala:326)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:276)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:307)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:109)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/Sachinthaka/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/Int.scala