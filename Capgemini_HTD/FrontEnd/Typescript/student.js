var Student = /** @class */ (function () {
    function Student(name, age, marks, degree) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.degree = degree;
    }
    return Student;
}());
// let student1= new Student('Priya',25,99);
// console.log(student1);
// student1.printDetails();
var student2 = {
    name: 'MAyuri',
    age: 21,
    marks: 99
};
console.log(student2);
var students = [
    new Student('Rohit', 299, 12),
    {
        name: 'Hrishi',
        marks: 250,
        age: 13
    },
    student2,
];
for (var _i = 0, students_1 = students; _i < students_1.length; _i++) {
    var student = students_1[_i];
    console.log(student);
}
