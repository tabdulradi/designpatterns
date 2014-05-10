package com.abdulradi.designpatterns.strategy

object MiniDuckSimulator1 {
 
  def main(args: Seq[String]) {
 
    val mallard = new MallardDuck with FlyWithWings with Quack
    mallard.quack()
    mallard.fly()
   
    val model = new ModelDuck() with Quack
    // model.fly() // Won't compile, because we are sure a model duck can't fly...
    val model2 = new ModelDuck with Quack with FlyRocketPowered // unless we add rockets!
    model2.fly()

  }
}
