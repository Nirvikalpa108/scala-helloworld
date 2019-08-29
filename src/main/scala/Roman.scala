import scala.collection.immutable._

object Roman {
  val dictionary = HashMap("I"-> 1, "II" -> 2, "III" -> 3, "IV" -> 4)
  def convert(romanNumeral: String): Int = dictionary(romanNumeral)
}
