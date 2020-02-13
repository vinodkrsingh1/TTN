
document.write('Find the simple Intrest');
document.write("<br>")
simpleIntrest()
function simpleIntrest(){
    var amount=prompt("Enter the amount:"); 
    var rateIntrest = prompt('rate of intrest:'); 
    var year=prompt('no. of years:'); 
    var si=(amount*year*rateIntrest)/100;
    document.write(' you simple intrest is: ',si);
}
