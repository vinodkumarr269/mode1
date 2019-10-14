var i=0;
var x=0,y=0;
questions=[
"1.what is opps",
"2.introduced java",
"3.how to declare generics",
"4.who introduced c"
];
options=[
         ['hii','hello','how','sfsf'],
         ['a','b','c','d'],
         ['e','f','g','h'],
         ['i','j','k','l']
         ];
function show(){
	document.getElementById("question").innerHTML=questions[i];
	
}
function dis(){
	document.getElementById("option").innerHTML=options[x][y];
}
function nextQuestion(){
	i=i+1;
	if(i<4){
		show();
	}
	else{
		alert("exam over....");
	}
}