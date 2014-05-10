package com.abdulradi.designpatterns.strategy

case class MallardDuck extends Duck with FlyWithWings with Quack {
  def display() = 
    println("I'm a real Mallard duck");  
}