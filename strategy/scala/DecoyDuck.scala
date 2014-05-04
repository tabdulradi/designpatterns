package com.abdulradi.designpatterns.strategy

class DecoyDuck extends Duck {
 
  setFlyBehavior(new FlyNoWay());
  setQuackBehavior(new MuteQuack());
 
  def display() = {
    println("I'm a duck Decoy");
  }
}
