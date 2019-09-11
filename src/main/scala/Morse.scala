import scala.collection.immutable.Map

object Morse {
  def translate(input:String):String = {
    val dictionary = Map[String, String]("a" -> ".-", "n" -> "-.")
    // push input into new array
    // convert each element to morse code
    // concatenate all elements in the array and add spacing appropriately 

    val letters = new Array[String](2)
    var output = ""
    input.split("").foreach(output += dictionary(_))
    ""
  }
}
