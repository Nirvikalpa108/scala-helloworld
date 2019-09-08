import scala.collection.immutable.Map

object Morse {
  def translate(input:String):String = {
    val dictionary = Map[String, String]("a" -> ".-", "n" -> "-.")
    // create empty array of length = input.length
    var output = ""
    input.split("").foreach(output += dictionary(_))
    return output
    // push output into the empty array
    // concatenate the completed array as appropriate
  }
}
