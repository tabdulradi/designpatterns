package com.abdulradi.designpatterns.strategy

class ModelDuck extends Duck {
  
  flyBehavior = new FlyNoWay()
  quackBehavior = new Quack()

  def display() = {
    System.out.println("I'm a model duck");
  }
}
