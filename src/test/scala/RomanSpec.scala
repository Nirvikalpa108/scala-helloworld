import collection.mutable.Stack
import org.scalatest._

class RomanSpec extends FlatSpec with Matchers {
  "Roman" should "change I to 1" in {
    Roman.convert("I") should be (1)
  }
}
