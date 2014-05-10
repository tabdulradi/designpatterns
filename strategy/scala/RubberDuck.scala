package com.abdulradi.designpatterns.strategy

case class RubberDuck extends Duck with Squeak {
  def display() = 
    println("I'm a rubber duckie")
}