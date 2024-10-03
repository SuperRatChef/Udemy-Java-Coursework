Method overloading occurs when a class has multiple methods with the same name, but the methods are declared with different parameters

In practical, you can execute multiple methods with the same name, but you call it with different arguments

### How java does resolve the correct method to execute?
Using method signatures. 

Methods signatures consists of the name of the method, and the uniqueness of the declaration of its parameters. 
	-method return type is not part of the signature
	-parameter names are not part of the signature, but the types are.