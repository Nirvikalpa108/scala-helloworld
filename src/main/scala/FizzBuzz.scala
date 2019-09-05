import scala.math.BigInt

object FizzBuzz {
  def convert(input:BigInt):String = {
    if (input != 0) {
      if (input % 15 == 0) return "FizzBuzz"
      else if (input % 5 == 0) return "Buzz"
      else if (input % 3 == 0) return "Fizz"
      else return input.toString
    }
    input.toString
  }
}

