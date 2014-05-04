package com.abdulradi.designpatterns.strategy

class FlyNoWay extends FlyBehavior {
  def fly() = {
    println("I can't fly");
  }
}
