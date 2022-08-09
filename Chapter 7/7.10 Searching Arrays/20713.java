/*
Given:

an int variable k,
an int array currentMembers that has been declared and initialized,
an int variable memberID that has been initialized, and
an boolean variable isAMember,
write code that assigns true to isAMember if the value of memberID can be found in currentMembers, and that assigns false to isAMember otherwise. Use only k, currentMembers, memberID, and isAMember.
*/

for(k = 0, isAMember = false; k < currentMembers.length && !isAMember; isAMember = (currentMembers[k++] == memberID));
