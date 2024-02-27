use company;

# 1. Write a query to display all the countries.
select country_name as Countries from countries;

# 2. Write a query to display specific columns like email and phone number for all the employees
select email, phone_number from employees;

# 3. Write a query to display the data of employee whose last name is “Fay”.
select * from employees where last_name="Fay";

# 4. Write a query to find the hire date for employees whose last name is “Grant” or “Whalen”.
select hire_date from employees where last_name in ("Grant","Whalen");

# 5. Write a query to display name of the employee who is shipping clerk
select concat(first_name," ",last_name) as Employee_Name from employees where job_id=(select job_id from jobs where job_title="shipping clerk");

# 6. Write a query to get all the employees who work for department 8.
select concat(first_name," ",last_name) as Employee_Name, department_id from employees where department_id="8";

# 7. Write a query to display the departments in the descending order
select department_name from departments order by department_name desc;

# 8. Write a query to display all the employees whose last name starts with “K”.
select concat(first_name," ",last_name) as Employee_Name from employees where last_name like "K%";

# 9. Display name of the employees whose hire dates are between 1995 and 1997.
select concat(first_name," ",last_name) as Employee_Name, hire_date from employees where year(hire_date) between 1995 and 1997;

# 10. Write a query to display jobs where the maximum salary is less than 5000
select job_title from jobs where job_id in(select job_id from employees group by job_id having max(salary)<5000);

# 11. Write a query to display email address in lower case.
select lower(email) from employees;

# 12. Write a query to display name of the employees who were hired in 1995.
select concat(first_name," ",last_name) as Employee_Name from employees where year(hire_date)=1995;

# 13. Write a query to insert an employee “Paul Newton” in department 11.
insert into employees (employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) values(207,'Paul','Newton','paul.newton@sqltutorial.org','585.123.4567','1987-07-17',2,12000.00,101,11);
# 14. Write a query to delete the shipping department.
delete from departments where department_name="shipping";
desc employees;
