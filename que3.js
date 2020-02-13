document.write('Find the area of circle');
function areaCircle(){
    document.write("<br>");
    var radius = prompt('enter the radius of circle: ');
    var areaCir = 3.14*radius*radius;
    document.write(" The radius of circle is: ",areaCir);
}
areaCircle()