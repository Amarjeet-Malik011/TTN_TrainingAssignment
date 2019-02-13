//Ques.1: for calculating simple interest
function simple_interest() {
    var amount = prompt("Enter amount:");
    var rate = prompt("Enter interest rate:");
    var years = prompt("Enter number of years:");
    var simple_interest = (amount * rate * years) / 100;
    document.write("Simple Interest is: " + simple_interest);
}
//Ques.2: for checking whether string is palindrome or not
function palindrome() {
    //checking whether string is a palindrome or not
    var str=prompt("Enter the string: ");
    var flag=1;
    for(var i=0;i<str.length/2;i++)
    {
        if(str[i]!=str[str.length-i-1])
        {
            document.write("Not a palindrome");
            flag=0;
            break;
        }
    }
    if(flag==1)
        document.write("String is a palindrome");
}
//Ques.3: for calculating area of circle
function area_of_circle() {
    var radius=prompt("Enter the radius");
    var area=3.14*radius*radius;
    document.write("area of circle is = "+area);
}
//Ques.4: copying object
function copy_object() {
    var employee=[
    {
        name:"dolly",
        salary:1300000
    },
    {
        name:"adi",
        salary:10000
    }
    ];
    var employee_clone={};
    for(var k in employee)
        employee_clone[k]=employee[k];
    console.log(employee_clone);
}
//Ques.5(a): for assigning employee_info and printing them on console
function employee_info() {
  var emp=
  [
      {
          name:"Amarjeet malik",
          age:22,
          salary:8000,
          DOB:"04/08/1996"
      },
      {
          name:"Dolly",
          age:21,
          salary:10000,
          DOB:"14/11/1997"
      },
      {
          name:"Surya",
          age:19,
          salary:4000,
          DOB:"03/07/1999"
      },
      {
          name:"Sampriti",
          age:19,
          salary:900,
          DOB:"12/08/1999"
      }
  ];
  console.log("Employees info:");
  console.log(emp);
}
//Ques.5(b): for printing employee with salary >5000
function employee_salary_gt_5000() {
    var emp=
        [
            {
                name:"Amarjeet malik",
                age:22,
                salary:8000,
                DOB:"04/08/1996"
            },
            {
                name:"Dolly",
                age:21,
                salary:10000,
                DOB:"14/11/1997"
            },
            {
                name:"Surya",
                age:19,
                salary:4000,
                DOB:"03/07/1999"
            },
            {
                name:"Sampriti",
                age:19,
                salary:900,
                DOB:"12/08/1999"
            }
        ];
    console.log("employees with salary > 5000");
    for (var i in Object.values(emp))
    {
        if(emp[i].salary>5000)
        console.log(emp[i]);
    }
}
//Ques.5(c): //grouping employee by age
function employee_grouping_by_age() {
    var emp=
        [
            {
                name:"Amarjeet malik",
                age:22,
                salary:8000,
                DOB:"04/08/1996"
            },
            {
                name:"Dolly",
                age:21,
                salary:10000,
                DOB:"14/11/1997"
            },
            {
                name:"Surya",
                age:19,
                salary:4000,
                DOB:"03/07/1999"
            },
            {
                name:"Sampriti",
                age:19,
                salary:900,
                DOB:"12/08/1999"
            }
        ];
    var group={};
    console.log("Grouping employees by age");
    for (var i=0;i< emp.length;i++)
    {
        if(!group[emp[i].age])
            group[emp[i].age]=[emp[i]];
        else
            group[emp[i].age].push(emp[i]);
    }
    console.log(group);
}
/*Ques.5(d): for fetching employees with salary less than 1000 and age greater than 20.
Then give them an increment 5 times their salary.
 */
function employee_filter_by_age_and_salary() {
    var emp=
        [
            {
                name:"Amarjeet malik",
                age:22,
                salary:8000,
                DOB:"04/08/1996"
            },
            {
                name:"Dolly",
                age:21,
                salary:10000,
                DOB:"14/11/1997"
            },
            {
                name:"Surya",
                age:19,
                salary:4000,
                DOB:"03/07/1999"
            },
            {
                name:"Sampriti",
                age:19,
                salary:900,
                DOB:"12/08/1999"
            },
            {
                name:"Sunny",
                age:21,
                salary:900,
                DOB:"15/08/1997"
            }
        ];
    console.log("employees with salary < 1000 and age > 20 :");
    for(var i in Object.values(emp))
    {
        if(emp[i].salary<1000 && emp[i].age > 20)
        {
            console.log(emp[i]);
        }
    }
    console.log("After 5 times increment");
    for(var i in Object.values(emp))
    {
        if (emp[i].salary < 1000 && emp[i].age > 20)
        {
            emp[i].salary=emp[i].salary*5;
            console.log(emp[i]);
        }
    }
}