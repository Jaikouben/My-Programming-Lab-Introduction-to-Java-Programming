/*
Clunker Motors Inc. is recalling all vehicles in its Extravagant line from model years 1999-2002. A boolean variable named recalled has been declared. Given a variable modelYear and a String modelName write a statement that assigns true to recalled if the values of modelYear and modelName match the recall details and assigns false otherwise.
*/

if ((modelYear >= 1999 && modelYear <= 2002) && modelName.equals("Extravagant")){
	recalled = true;
}
else {
	recalled = false;
}
