# Write your MySQL query statement below
SELECT  product_name , year  , price
FROM SALES S
JOIN PRODUCT P ON S.PRODUCT_ID=P.PRODUCT_ID
 