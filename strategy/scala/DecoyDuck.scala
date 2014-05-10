package com.abdulradi.designpatterns.strategy

case class DecoyDuck extends Duck { 
  def display() = 
    println("I'm a duck Decoy")
}