/**
 * 
 */
function show(){
	var today=new Date();
	var fullyear=today.getFullYear();
	c=fullyear+1;
	var future=new Date("July 2,"+c);
	var diff=future.getTime()-today.getTime();
	//no of milliseconds
	var days=Math.ceil(diff/(1000*60*60*24));
	//converting to days
	var res="Only<u>"+days+"</u>days left till new year day";
	document.getElementById("res").innerHTML=res;
}