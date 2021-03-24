/*Joining and Grouping Exercise

Display customer's name next to sales rep,
sorted by customer's name */
SELECT customerName AS 'Customer Name' , concat(E.lastName, ', ',E.firstName) AS 'Sales Rep'
FROM customers C INNER JOIN employees E
ON C.salesRepEmployeeNumber = E.employeeNumber
ORDER BY customerName;

/* Display each product, the total number ordered, and the total sales of the product,
sorted by total sale descending.

Note: The syntax for Total Sale alias needed ' `' (backwards tick/tilda key) 
Another Note: Ordering by total sales wouldn't necessarily mean most popular product */
SELECT P.productName AS 'Product Name', SUM(quantityOrdered) AS 'Total # Ordered', SUM(quantityOrdered * priceEach) AS `Total Sale`
FROM orderdetails O INNER JOIN products P 
ON O.productCode = P.productCode
GROUP BY P.productName
ORDER BY `Total Sale` DESC;