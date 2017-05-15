/*The Employee table holds all employees including their managers. Every employee has an Id, and there is also a column for the manager Id.
+----+-------+--------+-----------+
| Id | Name  | Salary | ManagerId |
+----+-------+--------+-----------+
| 1  | Joe   | 70000  | 3         |
| 2  | Henry | 80000  | 4         |
| 3  | Sam   | 60000  | NULL      |
| 4  | Max   | 90000  | NULL      |
+----+-------+--------+-----------+
Given the Employee table, write a SQL query that finds out employees who earn more than their managers. For the above table, Joe is the only employee who earns more than his manager.
+----------+
| Employee |
+----------+
| Joe      |
+----------+
drop table Employee1;*/

create table Employee1 (
	id number, 
	Name varchar2(20),
	Salary number,
	ManagerId number
);

insert into Employee1 values (1, 'joe', 70000, 3);
insert into Employee1 values (2, 'Henry', 80000, 4);
insert into Employee1 values (3, 'Sam', 60000, null);
insert into Employee1 values (4, 'Max', 90000, null);

select a.Name  from Employee1 a join Employee1  b on b.Id = a.ManagerId where a.Salary > b.Salary;
/*
	ID NAME 		    SALARY  MANAGERID	      ID NAME			  SALARY  MANAGERID
---------- -------------------- ---------- ---------- ---------- -------------------- ---------- ----------
	 1 joe			     70000	    3	       3 Sam			   60000
	 2 Henry		     80000	    4	       4 Max			   90000
*/





--select a.Name from Employee1 a join Employee1  b on a.Id = b.ManagerId where a.Salary > b.Salary;

/*
	ID NAME 		    SALARY  MANAGERID	      ID NAME			  SALARY  MANAGERID
---------- -------------------- ---------- ---------- ---------- -------------------- ---------- ----------
	 3 Sam			     60000		       1 joe			   70000	  3
	 4 Max			     90000		       2 Henry			   80000	  4
*/