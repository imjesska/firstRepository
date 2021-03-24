/* Simple Queries Exercise

Displays the name, product line, and buy price of all the products,
 sorted by the most expensive item first. */
SELECT productName AS Name, productLine AS 'Product Line', buyPrice AS 'Buy Price'
FROM products
ORDER BY buyPrice DESC;

/* Displays the first name, last name, and city of the customers from Germany,
sorted alphabetically by last name. */
SELECT contactFirstName AS 'First Name', contactLastName AS 'Last Name', city AS 'City'
FROM customers
WHERE country = 'Germany'
ORDER BY contactLastName;

/* Display the status of orders alphabetically */
SELECT unique Status,
COUNT(*) AS 'Orders' FROM orders
GROUP BY STATUS;

/* Displays payments made on or after January 1, 2005,
sorted by payment date. */
SELECT amount AS 'Payment', paymentDate AS 'Date'
FROM payments
WHERE paymentDate > '2005-01-01'
ORDER BY paymentDate;

/* Displays last name, first name, email, and job title of
only the employees working from the San Francisco office,
sorted alphabetically by last name. */
SELECT lastName AS 'Last Name', firstName AS 'First Name', Email, jobTitle AS 'Title'
FROM employees E INNER JOIN offices O
ON E.officeCode = O.officeCode
WHERE O.city = 'San Francisco'
ORDER BY lastName;

/* Display name, product line, scale, and vendor of car products
from classic and vintage lines only,
sorted by product line first then alphabetically/numerical by name. */
SELECT productName AS Name, S.productLine AS 'Product Line', productScale AS Scale, productVendor AS Vendor
FROM products P INNER JOIN productlines S
ON P.productLine = S.productLine
WHERE S.productLine = 'Classic Cars' 
	OR S.productLine = 'Vintage Cars'
ORDER BY productName;