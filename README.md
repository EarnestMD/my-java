A concrete method means, the method has complete definition but it can be overridden in the inherited class. If we make this method "final" then it can not be overriden. Declaring a method or class "final" means its implementation is complete. It is compulsory to override the abstract methods in the subclass otherwise the subclass would also be an abstract class and has to be declared abstract.

Concrete methods in Java are nothing but just like any other normal methods. The methods which are not abstract methods are called to be concrete methods in java. If we want to execute those concrete methods create an instance(object) of the class and call to that specific method.

If you declare an abstract method in a class then you must declare the class abstract as well. you can’t have an abstract method in a concrete class. In Java, it is not possible to instantiate an abstract class. An abstract class may contain abstract and concrete methods (i.e with body implementation).

Yes, subclasses inherit/override concrete methods from an abstract superclass if they are not private, final or static, they can be overridden.

No, They don't have to implement the concrete methods. But, they can override the concrete methods, unless they are not marked final.
