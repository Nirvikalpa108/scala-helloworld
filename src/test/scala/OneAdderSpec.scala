import collection.mutable.Stack
import org.scalatest._

class OneAdderSpec extends FlatSpec with Matchers {

  "OneAdder" should "add one" in {
    OneAdder.addOne(1) should be (2)
  }
}
