package com.abdulradi.designpatterns.strategy

class MuteQuack extends QuackBehavior {
  def quack() = {
    System.out.println("<< Silence >>");
  }
}
