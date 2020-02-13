var input1 = prompt('enter the string: ');
palindrome()
function palindrome(){
   
    var modifyStr = input1.split('');
   
    var modifyStr = modifyStr.reverse();
    
    var modifyStr = modifyStr.join('');
    
    if(input1==modifyStr){
        document.write("Given string is palindrome");
    }
    else{
        document.write('String is not a palindrome');
    }

}
