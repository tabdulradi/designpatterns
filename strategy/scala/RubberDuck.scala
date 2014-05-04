package com.abdulradi.designpatterns.strategy

case class RubberDuck(flyBehavior: FlyBehavior = new FlyNoWay(), quackBehavior: QuackBehavior = new Squeak()) extends Duck {
  def display() = 
    println("I'm a rubber duckie")
}
