/*
Write the definition of a method powerTo, which receives two parameters. The first is a double and the second is an int. The method returns a double.

If the second parameter is negative, the method returns zero. Otherwise it returns the value of the first parameter raised to the power of the second parameter.
*/

public double powerTo (double a, int b)
{
    double answer = 0;
    while ( b >= 0)
    {
        answer = Math.pow(a, (double)b);
        return answer;
    }
    return 0;
}
