/*
Clunker Motors Inc. is recalling all vehicles from model years 2001-2006. A boolean variable named norecall has been declared. Given a variable modelYear write a statement that assigns true to norecall if the value of modelYear does NOT within the recall range and assigns false otherwise.

Do not use an if statement in this exercise!
*/

if (modelYear < 2001 || modelYear > 2006){
	norecall = true;
}

else {
	norecall = false;
}
