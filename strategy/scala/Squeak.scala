package com.abdulradi.designpatterns.strategy

trait Squeak extends QuackBehavior {
  def quack() = 
    println("Squeak")
}
