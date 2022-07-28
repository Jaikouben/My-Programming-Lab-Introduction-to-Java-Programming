/*
Write a method, makeEmailAddress, that is passed two String arguments: the first is a username, like "leadbelly" and the second is a domain name, like "blues.com". The method returns an email address formed from joining these with an "@": "leadbelly@blues.com".
*/

public String makeEmailAddress(String username, String domain){
	// Makes email
	String email = username + "@" + domain;
	
	// Returns email
	return email;
}
