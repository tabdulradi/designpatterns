package com.abdulradi.designpatterns.strategy

class RubberDuck extends Duck {
  flyBehavior = new FlyNoWay()
  quackBehavior = new Squeak()

  def display() = {
    println("I'm a rubber duckie")
  }
}
