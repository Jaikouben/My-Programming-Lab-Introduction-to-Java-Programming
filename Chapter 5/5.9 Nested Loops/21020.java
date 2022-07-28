/*
Assume the input data is structured as follows: first there is a non-negative integer specifying the number of employee timesheets to be read in. This is followed by data for each of the employees. The first number for each employee is an integer that specifies their pay per hour in cents. Following this are 5 integers, the number of hours they worked on each of the days of the workweek. Given this data, and given that an int variable total has been declared, write a loop and any necessary code that reads the data and stores the total payroll of all employees in total. Note that you will have to add up the numbers worked by each employee and multiply that by that particular employee's pay rate to get the employee's pay for the week-- and sum those values into total.

ASSUME the availability of a variable, stdin, that references a Scanner object associated with standard input.
*/

int numberOfTimesheets;
int centsPerHour = 0;
int hoursWorked;
total = 0;
numberOfTimesheets = stdin.nextInt();
 
for(int i = 1; i <= numberOfTimesheets; i++){
   hoursWorked = 0;
   centsPerHour = stdin.nextInt();
   for (int ii = 1; ii <= 5; ii++){
      hoursWorked = hoursWorked + stdin.nextInt();
   }
   total = total + (hoursWorked * centsPerHour);
}
