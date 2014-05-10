package com.abdulradi.designpatterns.strategy

trait Quack extends QuackBehavior {
  def quack() = 
    println("Quack")
}
