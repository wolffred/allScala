class Lion extends Animal {

  def roar = println("roar")
  override def eat  = {super.eat; println("meat")}
  override val paws = 5

}
