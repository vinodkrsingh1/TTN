function Employee(Name,Age,Salary,DOB){
    this.Name=Name;
    this.Age=Age;
    this.Salary=Salary;
    this.DOB=DOB;
}
var Employee1= new Employee("vinod","18","8000","6-feb-1998")
var Employee2=new Employee("pramod","16","900","12-may-1977")
var Employee3=new Employee("nitin","25","200","18-jul-2001")
var Employee4=new Employee("arjun","31","5000","24-sept-1996")
var Employee5=new Employee("rakesh","25","8000","30-nov-1988")
var Employee6=new Employee("bharat","55","11000","3-jan-1982")
var Employee7=new Employee("darshan","44","9500","10-july-1991")
var company = [Employee1,Employee2,Employee3,Employee4,Employee5,Employee6,Employee7]

var question1 =[];
for (var j = 0; j < company.length; j++){
    if (company[j].Salary>=5000){
        question1.push(company[j].Name);
    }

}
document.writeln("all employees with salary greater than 5000 are : ",question1)
document.write('<br>')
var below20=[];
var bt20n40=[];
var above40age=[];

for (var j = 0; j < company.length; j++){
    if (company[j].Age<=20){
        below20.push(company[j].Name);   
    }
    if (company[j].Age>20&&company[j].Age<=40){
        bt20n40.push(company[j].Name);   
    }
    if (company[j].Age>40){
        above40age.push(company[j].Name);   
    }
}
document.writeln("Employes below age 20 : ",below20)
document.write('<br>')
document.writeln("Employes below age between 20 and 40 : ",bt20n40)
document.write('<br>')
document.writeln("Employes below age above 40 : ",above40age)
document.write('<br>')
var company2 = company
for(i=0;i<company.length;i++){
    if(company[i].Salary<1000 && company[i].Age>20){
        company2[i].Salary=(company[i].Salary)*5
        document.writeln('new salaries of ', company2[i].Name ,' is : ', company2[i].Salary)
    }
    else{
        company2[i].Salary=company2[i].Salary
    }
}
