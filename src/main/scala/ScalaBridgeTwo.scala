class ScalaBridgeTwo {

}

class Pet(name: String, animal: String) {
  def hello  = s"My name is $name and I am a $animal"
}

val dotty = new Pet("Dotty", "cat")
val bruno = new Pet("Bruno", "dog")