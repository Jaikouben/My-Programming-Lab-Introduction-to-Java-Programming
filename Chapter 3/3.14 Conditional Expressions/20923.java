/*
Assume that month is an int variable whose value is 1 or 2 or 3 or 5 ... or 11 or 12. Write an expression whose value is "jan" or "feb" or "mar" or "apr" or "may" or "jun" or "jul" or "aug" or "sep" or "oct" or "nov" or "dec" based on the value of month. (So, if the value of month were 4 then the value of the expression would be "apr".).
*/

(month == 1) ? "jan" : (month == 2) ? "feb" : (month == 3) ? "mar" : (month == 4) ? "apr" : (month == 5) ? "may" : (month == 6) ? "jun" : (month == 7) ? "jul" : (month == 8) ? "aug" : (month == 9) ? "sep" : (month == 10) ? "oct" : (month == 11) ? "nov" : "dec"
