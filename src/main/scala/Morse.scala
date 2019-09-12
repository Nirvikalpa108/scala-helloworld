import scala.collection.immutable.Map

object Morse {
  def translate(input:String):String = {
    val dictionary = Map[String, String]("a" -> ".-", "n" -> "-.")
    val letters = new Array[String](2)
    val word = input.split("")
    for ((letter: String, i: Int) <- word.view.zipWithIndex) {
      letters.update(i, dictionary(letter))
    }
    letters.mkString(" ")
  }
}
