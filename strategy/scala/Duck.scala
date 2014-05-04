package com.abdulradi.designpatterns.strategy

abstract class Duck {

  val flyBehavior: FlyBehavior

  val quackBehavior: QuackBehavior
  
  def display(): Unit

  def performFly() = 
    flyBehavior.fly()

  def performQuack() = 
    quackBehavior.quack()

  def swim() = 
    println("All ducks float, even decoys!")
}