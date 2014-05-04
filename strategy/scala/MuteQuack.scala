package com.abdulradi.designpatterns.strategy

case class MuteQuack extends QuackBehavior {
  def quack() = {
    System.out.println("<< Silence >>");
  }
}
