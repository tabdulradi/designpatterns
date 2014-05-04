package com.abdulradi.designpatterns.strategy

class Quack extends QuackBehavior {
  def quack() = {
    println("Quack")
  }
}
