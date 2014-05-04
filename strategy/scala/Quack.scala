package com.abdulradi.designpatterns.strategy

case class Quack extends QuackBehavior {
  def quack() = {
    println("Quack")
  }
}
