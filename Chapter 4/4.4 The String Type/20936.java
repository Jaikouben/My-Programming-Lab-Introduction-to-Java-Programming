/*
Clunker Motors Inc. is recalling all vehicles in its Extravagant line from model years 1999-2002 as well all vehicles in its Guzzler line from model years 2004-2007. A boolean variable named recalled has been declared. Given a variable modelYear and a String modelName write a statement that assigns true to recalled if the values of modelYear and modelName match the recall details and assigns false otherwise.
*/

if ((modelYear >= 1999 && modelYear <= 2002 && modelName == "Extravagant") || (modelYear >= 2004 && modelYear <= 2007 && modelName == "Guzzler")){
	recalled = true;
}
else {
	recalled = false;
}
