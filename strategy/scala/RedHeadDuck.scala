package com.abdulradi.designpatterns.strategy

case class RedHeadDuck extends Duck with FlyWithWings with Quack {
  def display() = 
    println("I'm a real Red Headed duck")
}