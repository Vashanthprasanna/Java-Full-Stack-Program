// Basic

var Id = "101";
var Name = "Arun";
var Salary = "150000";

function basic(){
  document.write("<h1>Welcome to JavaScript</h1>");
  document.write("Employee ID : " + Id + "<br>");
  document.write("Employee Name : " + Name + "<br>");
  document.write("Employee Salary : " + Salary + "<br>");
}


// prompt & confirm

function Confirm(){
  confirm("Want to continue ?");
}

function Prompt(){
  var user_name = prompt("Enter Name: ");
  alert("HI " + user_name + " ! , How are you...");
}


// getElementById()

function Calculate(){
  var num1 = parseInt(document.getElementById("num1").value);
  var num2 = parseInt(document.getElementById("num2").value);
  var op = document.getElementById("op").value;
  var res = "";
  if(op == "add") 
    res = "Addition : " + (num1 + num2);
  if(op == "sub") 
    res = "Subtraction : " + (num1 - num2);
  if(op == "mul") 
    res = "Multiplication : " + (num1 * num2);
  if(op == "div") 
    res = "Division : " + (num1 / num2);

  document.getElementById("dm").innerHTML = res;
}


// Function

var a = 10;
var b = 2;


function add() {
  document.write(" <br> Addition : " + (a + b));
}
function sub() {
  document.write(" <br> Subtraction : " + (a - b));
}
function mul() {
  document.write(" <br> Multiplication : " + a * b);
}
function div() {
  document.write(" <br> Division : " + a / b);
}


// Alert

function add1() {
  alert("Addition : " + (a + b));
}
function sub1() {
  alert("Subtraction : " + (a - b));
}
function mul1() {
  alert("Multiplication : " + a * b);
}
function div1() {
  alert("Division : " + a / b);
}


// Window

function Open() {
  window.open();
}

function Open() {
  window.cl();
}


// Factorial


function check(){
  var num = parseInt(document.getElementById("num").value);
  var fact = 1;
  for(i=1;i<=num;i++){
    fact=fact*i;
  }
  document.getElementById("demo").innerHTML = fact;
}


// onFocus && onEvent

function evnt(){
  var number = parseInt(document.getElementById("num").value);
  var factorial = 1;
  for(i=1;i<=number;i++){
    factorial=factorial*i;
  }
  document.getElementById("demo").innerHTML = factorial;
}