package com.abdulradi.designpatterns.strategy

case class DecoyDuck(flyBehavior: FlyBehavior = new FlyNoWay(), quackBehavior: QuackBehavior = new MuteQuack()) extends Duck { 
  def display() = 
    println("I'm a duck Decoy")
}
