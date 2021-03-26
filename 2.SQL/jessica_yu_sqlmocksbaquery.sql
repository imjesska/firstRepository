/* Display orders made by users with first name of 'Marion' */
SELECT ORDER_ID, U.USER_ID, O.STORE_ID
FROM ORDERS O JOIN USERS U
on O.USER_ID = U.USER_ID
where U.FIRST_NAME = "Marion";

/* Display users that have not made an order. */
SELECT U.USER_ID, U.FIRST_NAME, U.LAST_NAME, U.CITY
FROM USERS U LEFT JOIN ORDERS O
on U.USER_ID = O.USER_ID
WHERE O.ORDER_ID IS NULL;

/* Display items and prices of items that have been a part of other orders. */
SELECT I.NAME, I.PRICE
FROM ITEMS I JOIN ORDER_ITEMS O
ON I.ITEM_ID = O.ITEM_ID
GROUP BY O.ITEM_ID
HAVING COUNT(I.ITEM_ID) >=2;

/* Display order id, name, item price, and quantity from orders in NYC,
sorted by order id ascending. */
SELECT O.ORDER_ID, I.NAME, I.PRICE, O.Quantity
FROM STORES S JOIN ORDERS 
ON S.STORE_ID = ORDERS.STORE_ID
	JOIN ORDER_ITEMS O 
	ON ORDERS.ORDER_ID = O.ORDER_ID
	JOIN ITEMS I
	ON O.ITEM_ID = I.ITEM_ID
WHERE S.CITY = "New York"
ORDER BY O.ORDER_ID;

/* Display the item name and revenue for each item. */
SELECT I.NAME AS 'ITEM_NAME', SUM(I.PRICE * O.QUANTITY) AS 'Revenue'
FROM ORDER_ITEMS O JOIN ITEMS I
ON O.ITEM_ID = I.ITEM_ID
GROUP BY I.NAME;

/* Display store name, number of times an order has been made at this store,
the sales figure of the store ranked from high to low,
sorted by order quantity descending. */
SELECT S.NAME, COUNT(ORDERS.ORDER_ID) AS 'ORDER_QUANTITY',

CASE
	WHEN COUNT(ORDERS.ORDER_ID) >= 3 THEN "High"
	WHEN COUNT(ORDERS.ORDER_ID) < 3 AND COUNT(ORDERS.ORDER_ID) > 1 THEN "Medium"
		ELSE "Low"
END AS SALES_FIGURE

FROM ORDERS JOIN STORES S
ON S.STORE_ID = ORDERS.STORE_ID
GROUP BY S.STORE_ID
ORDER BY COUNT(ORDERS.ORDER_ID) DESC;

