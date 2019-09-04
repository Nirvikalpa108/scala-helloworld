import collection.mutable.Stack
import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {
  "FizzBuzz" should "return Fizz for each multiple of 3" in {
    FizzBuzz.convert(3) should be ("Fizz")
  }
}
