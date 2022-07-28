/*
Write a method, getEmailUserName, that is passed a String argument that is an email address and returns the user-name part. So if "mozart@salzberg.de" is passed, the method returns "mozart". Assume that the argument will always be a correctly formatted email address.
*/

public String getEmailUserName(String email){
	// Gets position
	int position = email.indexOf("@");
	
	// Gets username
	String emailUserName = email.substring(0, position);
	
	// Returns username
	return emailUserName;
}
