package com.abdulradi.designpatterns.strategy

object MiniDuckSimulator {
  def main(args: Array[String]) {
    val mallard = MallardDuck()
    val rubberDuckie = RubberDuck()
    val decoy = DecoyDuck()
    val model = ModelDuck()
    mallard.performQuack()
    rubberDuckie.performQuack()
    decoy.performQuack()
    model.performFly()
    val model2 = model.copy(flyBehavior = new FlyRocketPowered())
    model2.performFly()
  }
}