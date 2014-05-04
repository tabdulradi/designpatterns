package com.abdulradi.designpatterns.strategy

object MiniDuckSimulator1 {
 
  def main(args: Seq[String]) {
 
    val mallard = new MallardDuck()
    mallard.performQuack()
    mallard.performFly()
   
    val model = new ModelDuck()
    model.performFly()
    model.setFlyBehavior(new FlyRocketPowered())
    model.performFly()

  }
}
