/*
Given two double variables, bestValue and secondBestValue, write some code that swaps their values. Declare any additional variables as necessary.
*/

double bestTemp = bestValue;
double secondTemp = secondBestValue;
bestValue = secondTemp;
secondBestValue = bestTemp;
