/*
Write the definition of a method, isReverse, whose two parameters are arrays of integers of equal size. The method returns true if and only if one array is the reverse of the other. ("Reverse" here means same elements but in reverse order.)
*/

boolean isReverse(int a[], int b[]) {
int k;
	
for (k=0; k<a.length && a[k]==b[a.length-1-k]; k++);
	return k==a.length;
}
