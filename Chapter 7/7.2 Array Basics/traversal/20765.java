/*
An array of Strings, names, has been declared and initialized. Write the statements needed to determine whether any of the the array elements are null or refer to the empty String. Set the variable hasEmpty to true if any elements are null or empty-- otherwise set it to false.
*/

hasEmpty = false;
int k = 0;
for (k = 0; k < names.length; k++){
    if ((names[k] == null) || (names[k].equals("")))
    hasEmpty = true;
}
