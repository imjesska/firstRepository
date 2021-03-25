USE classicmodels;
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

/* Display the order status and the number of orders in each status, 
sorted alphabetically */
SELECT status AS 'Order Status', SUM(D.QuantityOrdered) AS '# Orders'
FROM orders O INNER JOIN orderdetails D
ON O.orderNumber = D.orderNumber
GROUP BY status
ORDER BY STATUS;

/* Display product line and the total number sold from that product line,
sorted by number sold descending. */
SELECT P.productLine AS 'Product Line', SUM(D.quantityOrdered) AS `# Sold`
FROM products P INNER JOIN orderdetails D
ON P.productCode = D.productCode
GROUP BY productLine
ORDER BY `# Sold` DESC;

/* Display employee name with the number of orders placed and the total sales made,
only displaying info from employees working as Sales Rep,
sorted by total sales descending. */
SELECT concat(E.lastName, ', ',E.firstName) AS 'Sales Rep', 
	COUNT(DISTINCT O.orderNumber) AS `# Orders`, 
 	coalesce(SUM(quantityOrdered * priceEach), 0.00) AS `Total Sales`
 	
FROM customers C LEFT JOIN employees E
	ON C.salesRepEmployeeNumber = E.employeeNumber
LEFT JOIN orders O
	ON O.customerNumber = C.customerNumber
LEFT JOIN orderdetails D
	ON O.orderNumber = D.orderNumber
WHERE E.jobTitle = 'Sales Rep'
GROUP BY E.employeeNumber;

/*Display the month and year of payments received,
sorted by date. */
SELECT DATE_FORMAT(P.paymentDate, "%M") AS 'Month',
	DATE_FORMAT(P.paymentDate, "%Y") AS 'Year', 
	FORMAT(SUM(P.amount), 2) AS 'Payments Received'
FROM payments P
GROUP BY 1,2
ORDER BY P.paymentDate;