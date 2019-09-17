object ScalaBridge {
  val theAnswer = 42
  def hello(name:String, answer:Int) = {
    println(s"Hello $name, the answer is $answer")
  }
}

object Main extends App {
  import ScalaBridge._
  ScalaBridge.hello("Amina", 30)
}

