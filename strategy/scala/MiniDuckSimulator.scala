package com.abdulradi.designpatterns.strategy

object MiniDuckSimulator {
  def main(args: Array[String]) {
    val mallard = MallardDuck()
    val rubberDuckie = RubberDuck()
    val decoy = DecoyDuck()
    val model = ModelDuck()
    mallard.quack()
    rubberDuckie.quack()
    //decoy.quack() // // Won't compile, because we are sure a decoy duck won't quack
    // model.fly() // Won't compile, because we are sure a model duck can't fly...
    val model2 = new ModelDuck with Quack with FlyRocketPowered // unless we add rockets!
    model2.fly()
  }
}