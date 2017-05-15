/*Write a SQL query to find all duplicate emails in a table named Person.
+----+---------+
| Id | Email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
For example, your query should return the following for the above table:
+---------+
| Email   |
+---------+
| a@b.com |
+---------+
Note: All emails are in lowercase.*/

--approach 1
Select email from Person group by email where count(email) > 1;
--approach 2
Select distinct a.email from Person a left join Person b on a.email = b.email where a.Id != b.Id;
--approach 3
SELECT DISTINCT a.Email FROM Person a
LEFT JOIN (SELECT Id, Email from Person GROUP BY Email) b
ON (a.email = b.email) AND (a.Id = b.Id)
WHERE b.Email IS NUL