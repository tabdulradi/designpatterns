package com.abdulradi.designpatterns.strategy

trait ModelDuck extends Duck { this: QuackBehavior =>
  def display() = 
    println("I'm a model duck")
}

object ModelDuck {
  def apply() = 
    new ModelDuck with Quack
}