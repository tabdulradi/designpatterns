package com.abdulradi.designpatterns.strategy

abstract class Duck {
  var flyBehavior: FlyBehavior = _
  var quackBehavior: QuackBehavior = _
  
  def setFlyBehavior(fb: FlyBehavior): Unit = {
    flyBehavior = fb
  }

  def setQuackBehavior(qb: QuackBehavior): Unit = {
    quackBehavior = qb
  }

  def display(): Unit

  def performFly() = 
    flyBehavior.fly()

  def performQuack() = 
    quackBehavior.quack()

  def swim() = 
    println("All ducks float, even decoys!")
}