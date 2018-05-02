

trait Animal {
  def speak
}
class Dog extends Animal{
  override def speak={println("bhonw")}
}
class Cat extends Animal{
  override def speak=println("meonw")
}
object Animal {
  def apply(animal:String)=animal match{
    case "Dog"=>new Dog().speak
    case "Cat"=>new Cat().speak
  }
}
object Starter extends App{
  val dog=Animal("Dog")
  val cat=Animal("Cat")
}