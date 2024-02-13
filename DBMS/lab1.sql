create database company;
use company;
create table employees(employee_id  varchar(10) primary key, first_name varchar(10),last_name varchar(10),email varchar(20),phone_number varchar(10), hire_date date,job_id varchar(10), salary double(10,2), manager_id varchar(10), department_id varchar(10),foreign key (department_id) references departments(department_id),foreign key(job_id)references jobs (job_id), foreign key(manager_id)references employees(employee_id));

create table jobs (job_id varchar(10) primary key, job_title varchar(10), min_salary double(10,2),max_salary double(10,2));

create table departments(department_id varchar(10) primary key, department_name varchar(10), location_id varchar(10),foreign key (location_id)references locations(location_id));

create table dependents(dependent_id varchar(10),first_name varchar(10),last_name varchar(10),relationship varchar(10), employee_id varchar(10),foreign key (employee_id)references employees(employee_id));

create table regions(region_id varchar(10) primary key,region_name varchar(10));

create table countries(country_id varchar(10) primary key, country_name varchar(10), region_id varchar(10) ,foreign key (region_id) references regions(region_id));

create table locations(location_id varchar(10) primary key, street_address varchar(10), postal_code varchar(10), city varchar(10),state_province varchar(10),country_id varchar(10), foreign key (country_id) references countries(country_id));

#Rename Departmentd table to Dept.
alter table departments rename dept;
alter table countries modify country_name varchar(30);
alter table jobs modify job_title varchar(40);
#add commission column to the employee table
alter table employees add comission varchar(10);
desc departments;


# data for regions
INSERT INTO regions(region_id,region_name) VALUES ('1','Europe');
INSERT INTO regions(region_id,region_name) VALUES ('2','Americas'); 
INSERT INTO regions(region_id,region_name) VALUES ('3','Asia');
INSERT INTO regions(region_id,region_name) VALUES ('4','Middle East and Africa');

# data for countries
INSERT INTO countries(country_id,country_name,region_id) VALUES ('AR','Argentina','2');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('AU','Australia','3');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('BE','Belgium','1');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('BR','Brazil','2');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('CA','Canada','2');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('CH','Switzerland','1');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('CN','China','3');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('DE','Germany','1');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('DK','Denmark','1');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('EG','Egypt','4');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('FR','France','1');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('HK','HongKong','3');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('IL','Israel','4');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('IN','India','3');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('IT','Italy','1');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('JP','Japan','3');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('KW','Kuwait','4');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('MX','Mexico','2');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('NG','Nigeria','4');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('NL','Netherlands','1');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('SG','Singapore','3');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('UK','United Kingdom','1');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('US','United States of America','2');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('ZM','Zambia','4');
INSERT INTO countries(country_id,country_name,region_id) VALUES ('ZW','Zimbabwe','4');


#data for locations
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES ('1400','2014 Jabberwocky Rd','26192','Southlake','Texas','US');
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES ('1500','2011 Interiors Blvd','99236','South San Francisco','California','US');
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES ('1700','2004 Charade Rd','98199','Seattle','Washington','US');
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES ('1800','147 Spadina Ave','M5V 2L7','Toronto','Ontario','CA');
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES ('2400','8204 Arthur St',NULL,'London',NULL,'UK');
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES ('2500','Magdalen Centre, The Oxford Science Park','OX99ZB','Oxford','Oxford','UK');
INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id) VALUES ('2700','Schwanthalerstr. 7031','80925','Munich','Bavaria','DE');
select * from locations;
desc locations;



#data for jobs
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES ('1','Public Accountant',4200.00,9000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('2','Accounting Manager',8200.00,16000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('3','Administration Assistant',3000.00,6000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('4','President',20000.00,40000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('5','Administration Vice President',15000.00,30000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('6','Accountant',4200.00,9000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES
('7','Finance Manager',8200.00,16000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES
('8','Human Resources Representative',4000.00,9000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('9','Programmer',4000.00,10000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('10','Marketing Manager',9000.00,15000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('11','Marketing Representative',4000.00,9000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES
('12','Public Relations Representative',4500.00,10500.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('13','Purchasing Clerk',2500.00,5500.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('14','Purchasing Manager',8000.00,15000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES
('15','Sales Manager',10000.00,20000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES
('16','Sales Representative',6000.00,12000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary)
VALUES ('17','Shipping Clerk',2500.00,5500.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES
('18','Stock Clerk',2000.00,5000.00);
INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES
('19','Stock Manager',5500.00,8500.00);


#data for department
desc dept;
INSERT INTO
departments(department_id,department_name,location_id) VALUES
('1','Administration','1700');
INSERT INTO
departments(department_id,department_name,location_id) VALUES
('2','Marketing','1800');
INSERT INTO
departments(department_id,department_name,location_id) VALUES
('3','Purchasing','1700');
INSERT INTO
departments(department_id,department_name,location_id) VALUES
('4','Human Resources','2400');
INSERT INTO
departments(department_id,department_name,location_id) VALUES
('5','Shipping','1500');
INSERT INTO
departments(department_id,department_name,location_id) VALUES
('6','IT','1400');
INSERT INTO
departments(department_id,department_name,location_id) VALUES
('7','Public Relations','2700');
INSERT INTO
departments(department_id,department_name,location_id) VALUES
('8','Sales','2500');
INSERT INTO
departments(department_id,department_name,location_id) VALUES
('9','Executive','1700');
INSERT INTO
departments(department_id,department_name,location_id) VALUES
('10','Finance','1700');
INSERT INTO
departments(department_id,department_name,location_id) VALUES
(11,'Accounting',1700);