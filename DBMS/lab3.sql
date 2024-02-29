create database university;
use university;
create table STUDENT (Name varchar(10),Student_number int(2) primary key, Class int(2),Major varchar(20));
insert into STUDENT values("Smith",17,1,"CS"),("Brown",8,2,"CS");

create table COURSE (Course_name varchar(30),Course_number varchar(20) primary key,Credit_hours int(2), Department varchar(15));
insert into COURSE values("Intro to Computer Science","CS1310",4,"CS"),("Data Structures","CS3320",4,"CS"),("Discrete Mathamatics","MATH2410",3,"MATH"),("Database","CS3380",3,"CS");

create table SECTION (Section_identifier int(3) primary key,Course_number varchar(20),Semester varchar(10),Year int(2),Instructor varchar(15),foreign key (Course_number) references COURSE(Course_number));
insert into SECTION values (85,"MATH2410","Fall",07,"King"),(92,"CS1310","Fall",07,"Anderson"),(102,"CS3320","Spring",08,"Knuth"),(112,"MATH2410","Fall",08,"Chang"),(119,"CS1310","Fall",08,"Anderson"),(135,"CS3380","Fall",08,"Stone");

create table GRADE_REPORT (Student_number int(2),Section_identifier int(3),Grade varchar(2),foreign key (Student_number) references STUDENT(Student_number),foreign key (Section_identifier) references SECTION(Section_identifier),primary key(Student_number,Section_identifier));
insert into GRADE_REPORT values (17,112,"B"),(17,119,"C"),(8,85,"A"),(8,92,"A"),(8,102,"B"),(8,135,"A");

create table PREREQUISITE (Course_number varchar(20) ,Prerequisite_number varchar(20),foreign key (Course_number) references COURSE(Course_number),foreign key (Prerequisite_number) references COURSE(Course_number),primary key(Course_number,Prerequisite_number));
insert into PREREQUISITE values("CS3380","CS3320"),("CS3380","MATH2410"),("CS3320","CS1310");

# Retrieve the list of all courses and grades of Smith
select g.Grade,c.Course_name from STUDENT s inner join GRADE_REPORT g on s.Student_number = g.Student_number inner join SECTION se on g.Section_identifier= se.Section_identifier inner join COURSE c on se.Course_number=c.Course_number where s.Name="Smith";

#list name of students who took sectin 'DATABASE' offered in fall and their grades.
select s.Name,g.Grade from STUDENT s join  GRADE_REPORT g on s.Student_number = g.Student_number inner join SECTION se on g.Section_identifier= se.Section_identifier inner join COURSE c on se.Course_number=c.Course_number where c.Course_name="Database" and se.Semester="Fall";