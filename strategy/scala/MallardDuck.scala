package com.abdulradi.designpatterns.strategy

class MallardDuck extends Duck {
 
	quackBehavior = new Quack()
  flyBehavior = new FlyWithWings()
 
	def display() = {
		println("I'm a real Mallard duck");
	}
}
