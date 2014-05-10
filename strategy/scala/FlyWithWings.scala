package com.abdulradi.designpatterns.strategy

trait FlyWithWings extends FlyBehavior {
  def fly() = 
    println("I'm flying!!")
}
