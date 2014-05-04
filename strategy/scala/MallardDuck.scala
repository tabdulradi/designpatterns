package com.abdulradi.designpatterns.strategy

case class MallardDuck(flyBehavior: FlyBehavior = new FlyWithWings(), quackBehavior: QuackBehavior = new Quack()) extends Duck {
  def display() = 
    println("I'm a real Mallard duck");
}
