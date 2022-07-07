/*
Clunker Motors Inc. is recalling all vehicles in its Extravagant line from model years 1999-2002 as well all vehicles in its Guzzler line from model years 2004-2007. Given a variable modelYear and a String modelName write a statement that prints the message "RECALL" to standard output if the values of modelYear and modelName match the recall details.
*/

if ((modelYear >= 1999 && modelYear <= 2002 && modelName.equals("Extravagant")) || (modelYear >= 2004 && modelYear <= 2007 && modelName.equals("Guzzler"))){
	System.out.println("RECALL");
}
