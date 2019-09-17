trait Star {
  def lumin: Double
  def age: Integer

  case class RedGiant(lumin: Double, age: Integer) extends Star
  case class Neutron(lumin: Double, age: Integer) extends Star
  case class Supernova(lumin: Double, age: Integer) extends Star
}
