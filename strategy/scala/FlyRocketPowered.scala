package com.abdulradi.designpatterns.strategy

class FlyRocketPowered extends FlyBehavior {
  def fly() = {
    println("I'm flying with a rocket");
  }
}
