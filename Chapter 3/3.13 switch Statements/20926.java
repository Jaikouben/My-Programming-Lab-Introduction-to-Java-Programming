/*
HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings are listed below:

200, OK (fulfilled)
403, forbidden
404, not found
500, server error
Given an int variable status, write a switch statement that prints out, on a line by itself, the appropriate label from the above list based on status.
*/

switch (status){
	case 200: System.out.println("OK (fulfilled)");
		break;
	case 403: System.out.println("forbidden");
		break;
	case 404: System.out.println("not found");
		break;
	case 500: System.out.println("server error");
		break;
}
