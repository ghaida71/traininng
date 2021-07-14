

function newtoken(fname,phone,age)
{
    /* 
    TODO -
       1. verify the correctness of phone number . It must have 10 numerical digits
       2. if phone number is valid then extract the first 2 and the last 2 digits to make a number and store it in phtoken else phtoken=0
       3. if fname (firstname) length is less than 2 then set fntoken=xy else set fntoken to the first 2 characters of fname
       4. Generate the final token which is a combination of fntoken + (added value of phtoken and age)
       5. Return the finally constructed token
    */

	var phtoken = '';
	var fntoken = '';
	
	if (phone.length == 10){
		phtoken = parseInt(phone.charAt(0) + phone.charAt(1) + phone.charAt(8) + phone.charAt(9)); 
	} else {
		phtoken=0
	}
	
	if (fname.length >= 2){
		fntoken = fname.charAt(0) + fname.charAt(1); 
	} else {
		fntoken= 'xy';
	}
	
	var num = String(phtoken + age);
	
	return 'Your token Number is ' + fntoken+num;
}

function getToken(fname,phone,dob)
{
    
    /*
       TODO - Calculate the age based on date of birth (dob)
      if the age is greater than or equal to 18 then generate the token by calling the newtoken function 
       and passing the firstname, phone and age as arguments - newtoken(fname,phone,age); 
       else specify token value as "Not eligible to receive token" 
       Return the token value to tokenGen function
    */
    
	//calculate month difference from current date in time  
    var month_diff = Date.now() - new Date(dob).getTime();  
      
    //convert the calculated difference in date format  
    var age_dt = new Date(month_diff);   
      
    //extract year from date      
    var year = age_dt.getUTCFullYear();  
      
    //now calculate the age of the user  
    var age = Math.abs(year - 1970);  

	if(age >= 18){
		return newtoken(fname,phone,age);
	} else {
		return "Not eligible to receive token";
	}
}

function tokenGen()
{
	var fname=document.getElementById("fname").value;
	var phone=document.getElementById("phone").value;
	var dob=document.getElementById("dob").value;
	
	if(fname.length!=0 && phone.length!=0 && dob.length!=0)
	{
		token=getToken(fname,phone,dob);
		document.getElementById("result").innerHTML=token;
	}
	else
	{
	    document.getElementById("result").innerHTML="Please enter all details to generate token";
	    return "Please enter all details to generate token";
	}
}
