package com.abdulradi.designpatterns.strategy

class RedHeadDuck extends Duck {
  flyBehavior = new FlyWithWings()

  quackBehavior = new Quack()

  def display() {
    println("I'm a real Red Headed duck")
  }
}