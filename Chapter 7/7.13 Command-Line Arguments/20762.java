/*
Write a 'main' method that examines its command-line arguments and
calls the (static) method displayHelp if the only argument is the class name. Note that displayHelp accepts no parameters
otherwise, 'main' calls the (static) method argsError if the number of arguments is less than four.  argsError accepts the number of arguments (an integer) as its parameter
otherwise, 'main' calls the (static) method processArgs, which accepts the command-line argument array as its parameter.
*/

public static void main(String[] args) {
	if(args.length==1){
		displayHelp();
	}
	else if(args.length < 4){
		argsError(args.length);
	}
	else {
		processArgs(args);
   }
}
