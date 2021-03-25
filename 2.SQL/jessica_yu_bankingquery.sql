USE Banking;

-- Display each bank branch's product and product type
SELECT NAME AS 'Product', PRODUCT_TYPE_CD AS 'Type'
FROM PRODUCT
GROUP BY 1;

-- Display each bank branch's name, branch's city, the employee's last name and title
SELECT B.NAME AS 'Branch Name', B.CITY AS 'City', E.LAST_NAME AS 'Employee Last Name', E.TITLE AS 'Title'
FROM BRANCH B INNER JOIN EMPLOYEE E
ON B.BRANCH_ID = E.ASSIGNED_BRANCH_ID
ORDER BY B.NAME;

-- Display a list of each unique employee title
SELECT DISTINCT TITLE
FROM EMPLOYEE;

-- Display the last name and title of each employee and the last name and title of the employee's boss
SELECT concat(E.LAST_NAME, ', ', E.TITLE) AS 'Employee', 
	concat(S.LAST_NAME, ', ', S.TITLE) AS 'Supervisor'
FROM EMPLOYEE E INNER JOIN EMPLOYEE S
ON E.SUPERIOR_EMP_ID = S.EMP_ID
ORDER BY E.LAST_NAME;

-- Display the name of account's product, available balance, and customer's last name
SELECT P.NAME AS 'Product Name', A.AVAIL_BALANCE AS 'Available Balance', I.LAST_NAME AS 'Customer Last Name'
FROM ACCOUNT A JOIN PRODUCT P
ON A.PRODUCT_CD = P.PRODUCT_CD
	JOIN INDIVIDUAL I
	ON I.CUST_ID = A.CUST_ID
ORDER BY P.NAME;

-- Display a list of transactions for customer's whose last name starts with 'T'
SELECT I.LAST_NAME AS 'Customer Last Name', T.AMOUNT AS 'Total Amount', T.FUNDS_AVAIL_DATE AS 'Funds Available',
T.TXN_DATE AS 'Transaction Date', T.TXN_TYPE_CD AS 'Transaction Type'
FROM ACC_TRANSACTION T INNER JOIN ACCOUNT A
ON A.ACCOUNT_ID = T.ACCOUNT_ID
	INNER JOIN INDIVIDUAL I 
	ON A.CUST_ID = I.CUST_ID
	WHERE I.LAST_NAME LIKE "T%";