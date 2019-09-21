import scala.collection.immutable.Map

object Morse {
  def translate(input:String):String = {
    val dictionary = Map[String, String]("a" -> ".-", "n" -> "-.")
    input.split("").map(x => dictionary(x)).mkString(" ")
    }
  }

