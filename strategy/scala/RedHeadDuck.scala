package com.abdulradi.designpatterns.strategy

case class RedHeadDuck(flyBehavior: FlyBehavior = new FlyWithWings(), quackBehavior: QuackBehavior = new Quack()) extends Duck {
  def display() =
    println("I'm a real Red Headed duck")
}