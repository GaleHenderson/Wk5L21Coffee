/**
 * 
 */

function validateInfo(){
	// 1. get the textbox value
	var first = document.getElementById("firstname").value;
	var last = document.getElementById("lastname").value;
	var password = document.getElementById("PW").value;
	var confirm = document.getElementById("confirm").value;
	
	if (first.length <= 2){
		alert("Please enter a longer first name!");
		document.getElementById("firstname").focus();
		return false; // this keeps the form data from being submitted based
						// on your condition
	}
	
	if (last.length < 2){
		alert("Please enter a longer last name!");
		document.getElementById("lastname").focus();
		return false; // this keeps the form data from being submitted based
						// on your condition
	}
	
	if (PW != confirm){
		alert("Passwords must match!");
		return false;
	}
	

	
	
}