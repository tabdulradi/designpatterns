package com.abdulradi.designpatterns.strategy

trait FakeQuack extends QuackBehavior {
  def quack() = 
    println("Qwak")
}
