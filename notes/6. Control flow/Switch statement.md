can be used instead of chaining multiple if else statements in after one another

switch(value){
	case x:
		//some code
		break
	case d: case f: case r:
		//some code
		break
	default:
		//default code that runs if nothing matches
}

### switch value types
allowed:
byte, short, int, char, byte, short, integer, char, string,, enum

not allowed:
long, float, double, boolean or their wrappers


#### fall through in switch statement
Once a switch case label matches the swithch variable, no more cases are checked.

Any code after the case label that matches will be executed, until a break statement 
occurs.

Without break statement, execution will continue to fall through in any case labels declared below the first match.