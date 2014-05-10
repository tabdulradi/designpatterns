package com.abdulradi.designpatterns.strategy

trait Duck {

  def display(): Unit

  def swim() = 
    println("All ducks float, even decoys!")
}