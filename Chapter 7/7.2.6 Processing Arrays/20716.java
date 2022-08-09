/*
Given

an int variable k,
an int array incompletes that has been declared and initialized,
an int variable studentID that has been initialized, and
an int variable numberOfIncompletes,
write code that counts the number of times the value of studentID appears in incompletes and assigns this value to numberOfIncompletes.

You may use only k, incompletes, studentID, and numberOfIncompletes.
*/

for (numberOfIncompletes = 0, k = 0; k < incompletes.length; k++){
	if (incompletes[k] == studentID){
		numberOfIncompletes++;
	}
}
