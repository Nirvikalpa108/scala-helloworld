import collection.mutable.Stack
import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {
  "FizzBuzz" should "return Fizz for each multiple of 3" in {
    FizzBuzz.convert(3) should be ("Fizz":String)
  }

  "FizzBuzz" should "return Buzz for each multiple of 5" in {
    FizzBuzz.convert(5) should be ("Buzz":String)
  }

  "FizzBuzz" should "return FizzBuzz for each multiple of 3 and 5" in {
    FizzBuzz.convert(15) should be ("FizzBuzz":String)
  }

  "FizzBuzz" should "return the input for any other numbers" in {
    FizzBuzz.convert(2) should be ("2":String)
  }

  "FizzBuzz" should "return the input for 0" in {
    FizzBuzz.convert(0) should be("0": String)
  }

  "FizzBuzz" should "return Fizz for -3" in {
    FizzBuzz.convert(-3) should be("Fizz": String)
  }

  "FizzBuzz" should "return the input for -2" in {
    FizzBuzz.convert(-2) should be("-2": String)
  }

  "FizzBuzz" should "return FizzBuzz" in {
    FizzBuzz.convert(3000000) should be("FizzBuzz": String)
  }

  "FizzBuzz" should "return input" in {
    FizzBuzz.convert(3000000001L) should be("3000000001": String)
  }
}


