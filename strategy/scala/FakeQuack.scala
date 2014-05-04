package com.abdulradi.designpatterns.strategy

class FakeQuack extends QuackBehavior {
  def quack() = {
    println("Qwak")
  }
}
