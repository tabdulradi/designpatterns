Strategy Pattern
================
## Direct Translation
First I started with a direct translation from Java version (by HeadFirst) to Scala.
I used [javatoscala.com](http://javatoscala.com/) to help me in this.

## State is the root of all evils
Being a Scala developer made me REALLY hate mutable state. It was hard in the begining to live without defining some `var` here and there, but after time I learned how to survive.

So, first thing I replaced the two variables in Duck.scala to `val`s
```
val flyBehavior: FlyBehavior
val quackBehavior: QuackBehavior
```
Of course I had to remove `setFlyBehavior` and `setQuackBehavior`, they are useless now. But how clients would upgrade ducks into different flying behaviors? A typical answer would be to dump the old duck, and get a new superior one.   

Here comes Scala's case class to rescue. I changed all sub-classes of Duck to be case classes instead of a normal class. Now I got the `copy` method for free.
```
val model = new ModelDuck()
model.performFly()
val model2 = model.copy(flyBehavior = new FlyRocketPowered())
model2.performFly()
```

So far so good. However I hate one thing here.
`FlyNoWay` and `MuteQuack` should never exist. If the duck can't fly/quack, the compiler should be aware of it. Let's see what we can do with this ...

