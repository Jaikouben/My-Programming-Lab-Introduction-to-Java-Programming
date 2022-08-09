/*
You are given two int variables j and k, an int array zipcodeList that has been declared and initialized, and an boolean variable duplicates.

Write some code that assigns true to duplicates if any two elements in the array have the same value, and that assigns false to duplicates otherwise. Use only j, k, zipcodeList, and duplicates.
*/

duplicates = false;

for (k = 0; k < zipcodeList.length; k++){
	for (j = 0; j < k; j++){
		if ( zipcodeList[j] == zipcodeList[k]){
			duplicates = true;
			break;
		}
	}
}
