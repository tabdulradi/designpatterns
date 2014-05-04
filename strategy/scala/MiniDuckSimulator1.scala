package com.abdulradi.designpatterns.strategy

object MiniDuckSimulator1 {
 
  def main(args: Seq[String]) {
 
    val mallard = MallardDuck()
    mallard.performQuack()
    mallard.performFly()
   
    val model = ModelDuck()
    model.performFly()
    val model2 = model.copy(flyBehavior = new FlyRocketPowered())
    model2.performFly()

  }
}
