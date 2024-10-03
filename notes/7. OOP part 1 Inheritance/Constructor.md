A constructor is used in the creation of an object.
It is a special type of code block that has a specific name and parameters, much like a method

It has the same name as the class itself, and it doesn't return any values
You never include a return type from a constructor, not even void

You can, and should, specify an appropriate access modifier to control who should be able to create new instances of the class, using this selector

public class Account {
	public Account(){[
		//some constructor inside code
	}
}

if class contains no constructor declarations, then a default constructor is implicitly declared

Constructors can be overloaded

