/*
Write a method, getEmailDomain, that is passed a String argument that is an email address and returns the domain name part. So if "mozart@salzberg.de" is passed, the method returns "salzberg.de". Assume that the argument will always be a correctly formatted email address.
*/

public String getEmailDomain(String email){
	// Gets position
	int position = email.indexOf('@');
	position = position + 1;
	
	// Gets domain
	String domainName = email.substring(position);
	
	// Returns username
	return domainName;
}
