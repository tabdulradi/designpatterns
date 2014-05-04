package com.abdulradi.designpatterns.strategy

case class ModelDuck(flyBehavior: FlyBehavior = new FlyNoWay(), quackBehavior: QuackBehavior = new Quack()) extends Duck {  
  def display() = 
    System.out.println("I'm a model duck");  
}
