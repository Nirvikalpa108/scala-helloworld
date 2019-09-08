import collection.mutable.Stack
import org.scalatest._

class MorseSpec extends FlatSpec with Matchers {
  "Morse" should "return .- when given a" in {
    Morse.translate("a") should be (".-")
  }

  "Morse" should "return .- -. when given an" in {
    Morse.translate("an") should be (".- -.")
  }
}
