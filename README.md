# Quality-of-classes-and-OO-design![Screenshot 2023-09-29 120601](https://github.com/samakhraim/Quality-of-classes-and-OO-design/assets/62477773/b1e55ce4-c57c-4b44-b7c6-d8fed5e8ccc2)

Instead of using three classes:

Student
Course
University

I used 5 different classes to split up all the functionalities and methods.
This was done to make my code follow clean Object Oriented Programing conventions.
I created the following classes:

University.java:
It has name, location, list of all the students, and a list of all the courses as attributes.
In addition, it has three main methods:
add_students() : which adds a student into the list of the students in the University.
add_courses() : which adds courses into the list of the courses taught at the University.
get_all_courses() : a method that prints out all the courses taught at the University.

This made the University class more "Single-dependency" like.

Student.java:
It has student_id, name, email, and a list of all courses the student is enrolled in.

It has only 1 main method:

getStudentCourses() : which is responsible for printing out all the courses a Student is enrolled in.

Courses.java:

It has course_code, title, instructor, max_capacity, and a list of all the enrolled students in that Course.

It has 2 main methods:

update_capacity() : which updates the count of students in a certain course.
getCourseEnrollment() : which prints out all the students enrolled in a Course.

IReport.java:

This is an interface that has been implemented. It has three main attributes. report_id, report_date, and report_type.
Its main method is:

generate_all_report() : which generates a report for all the Courses taught at the University, a report for all the enrolled students at a certain course, and a report for all the courses a certain student is enrolled in.

