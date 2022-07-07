/*
Write a statement that adds 1 to the variable reverseDrivers if the variable speed is less than 0,adds 1 to the variable parkedDrivers if the variable speed is less than 1,adds 1 to the variable slowDrivers if the variable speed is less than 40,adds 1 to the variable safeDrivers if the variable speed is less than or equal to 65, and otherwise adds 1 to the variable speeders.
*/

if (speed < 0){
	reverseDrivers += 1;
}

else {
	if (speed < 1){
		parkedDrivers += 1;
	}
	else {
		if (speed < 40){
			slowDrivers += 1;
		}
		else {
			if (speed <= 65){
				safeDrivers += 1;
			}
			else {
				speeders += 1;
			}
		}
	}
}
