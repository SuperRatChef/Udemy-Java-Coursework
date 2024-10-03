
If you have defined multiple constructor implementations in your code(overloading), you can call the other constructor within your constructor with this keyword

public Account(){
	this(34234)
	//other code that gets executed;
}
public Account(number){
	this.number = number;
}

take a note that your constructor should start with this expression if you are planning on chaining your constructors
