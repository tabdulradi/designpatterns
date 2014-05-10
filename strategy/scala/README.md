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

## Compile time Strategy pattern
First design principle I learned from Head First Design Patterns was
> Identify the aspects of you application that vary and separate them from what stays the same.

I applied this principle one step further. For me the aspect that vary was fly/quack ability, not only the behavior. Because some Ducks can't fly, some can. Those who can fly, can fly in different ways.
We should let the compiler know about this, so...   
1. I removed fly and quack methods from the base Duck class.
2. Converted all Behavior classes to traits
3. Converted base class Duck to a trait

Now I have options to extend and mix-in the behavior I want for each Duck
### Malard Duck
```
case class MallardDuck extends Duck with FlyWithWings with Quack {...}
val duck = MallardDuck()
duck.fly()
duck.quack()
```
A MallardDuck flies with wings and can quack. You probably won't need to change any behavior later. 

### Rubber Duck
```
case class RubberDuck extends Duck with Squeak {...}
val duck = MallardDuck()
//duck.fly() // Won't compile
duck.quack()
```
A Rubber duck can quack by squaking, but for sure it won't fly, even the compiler knows that.

### Model Duck
```
trait ModelDuck extends Duck { this: QuackBehavior => ... }
// val duck = new ModelDuck() // Won't compile
val duck = new ModelDuck with Quack
//duck.fly() // Won't compile
duck.quack()
```
A Model duck is different, it knows it can quack, but not sure how. The compile won't let you instantiate one without telling it how to quack.
Once you provide a quack behavior you can have your duck and play with it.
```
val duck = new ModelDuck with Quack with FlyRocketPowered
duck.fly()
``` 
Although a regular Model duck doesn't know how to fly. but you can always tie it to a rocket!
Now the compiler will let you call `fly` method on it.

## Conclusion
My code is not a typical strategy pattern any more. I'd call this "compile time strategy pattern" or "policy-based class design". 
You can mix-in whatever strategies you want by defining new sub-classes. But you lost the ability to change behaviors at run time, which you shouldn't do anyway if you want to stick to immutable objects.