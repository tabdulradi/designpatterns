package com.abdulradi.designpatterns.strategy

object MiniDuckSimulator {
  def main(args: Array[String]) {
    val mallard = new MallardDuck()
    val rubberDuckie = new RubberDuck()
    val decoy = new DecoyDuck()
    val model = new ModelDuck()
    mallard.performQuack()
    rubberDuckie.performQuack()
    decoy.performQuack()
    model.performFly()
    model.setFlyBehavior(new FlyRocketPowered())
    model.performFly()
  }
}