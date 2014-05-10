package com.abdulradi.designpatterns.strategy

trait FlyRocketPowered extends FlyBehavior {
  def fly() = 
    println("I'm flying with a rocket");
}
