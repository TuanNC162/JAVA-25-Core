-- 1. Lấy thông tin tất cả các sản phẩm đã được đặt trong một đơn đặt hàng cụ thể.
SELECT Products.product_id, Products.product_name, OrderDetails.quantity
FROM OrderDetails
INNER JOIN Products ON OrderDetails.product_id = Products.product_id
WHERE OrderDetails.order_id = 1;

-- 2. Tính tổng số tiền trong một đơn đặt hàng cụ thể.
SELECT SUM(Products.price * OrderDetails.quantity) AS monney
FROM OrderDetails
INNER JOIN Products ON OrderDetails.product_id = Products.product_id
WHERE OrderDetails.order_id = 1;

-- 3. Lấy danh sách các sản phẩm chưa có trong bất kỳ đơn đặt hàng nào.
SELECT Products.product_id, Products.product_name
FROM Products
LEFT JOIN OrderDetails ON Products.product_id = OrderDetails.product_id
WHERE OrderDetails.product_id IS NULL;

-- 4. Đếm số lượng sản phẩm trong mỗi danh mục. (category_name, total_products)
SELECT Categories.category_name, COUNT(Products.product_id) AS soluong
FROM Categories
LEFT JOIN Products ON Categories.category_id = Products.category_id
GROUP BY Categories.category_name;

-- 5. Tính tổng số lượng sản phẩm đã đặt bởi mỗi khách hàng (customer_name, total_ordered)
SELECT Customers.customer_name, SUM(OrderDetails.quantity) AS soluong
FROM Customers
INNER JOIN Orders ON Orders.customer_id = Customers.customer_id
INNER JOIN OrderDetails ON OrderDetails.order_id = Orders.order_id
GROUP BY Customers.customer_name;

-- 6. Lấy thông tin danh mục có nhiều sản phẩm nhất (category_name, product_count)
SELECT Categories.category_name, COUNT(Products.product_id) AS soluong
FROM Categories
INNER JOIN Products ON Categories.category_id = Products.category_id
GROUP BY Categories.category_name
ORDER BY soluong DESC
LIMIT 1;

-- 7. Tính tổng số sản phẩm đã được đặt cho mỗi danh mục (category_name, total_ordered)
SELECT Categories.category_name, SUM(OrderDetails.quantity) AS soluong
FROM Categories
INNER JOIN Products ON Products.category_id = Categories.category_id
INNER JOIN OrderDetails ON OrderDetails.product_id = Products.product_id
GROUP BY Categories.category_name;

-- 8. Lấy thông tin về top 3 khách hàng có số lượng sản phẩm đặt hàng lớn nhất (customer_id, customer_name, total_ordered)
SELECT Customers.customer_id, Customers.customer_name, SUM(OrderDetails.quantity) AS soluong
FROM Customers
INNER JOIN Orders ON Customers.customer_id = Orders.customer_id
INNER JOIN OrderDetails ON Orders.order_id = OrderDetails.order_id
GROUP BY Customers.customer_id, Customers.customer_name
ORDER BY soluong DESC
LIMIT 3;

-- 9. Lấy thông tin về khách hàng đã đặt hàng nhiều hơn một lần trong khoảng thời gian cụ thể từ ngày A -> ngày B (customer_id, customer_name, total_orders)
SELECT Customers.customer_id, Customers.customer_name, COUNT(DISTINCT Orders.order_id) AS soluong
FROM Customers
INNER JOIN Orders ON Customers.customer_id = Orders.customer_id
WHERE Orders.order_date BETWEEN '2024-02-05' AND '2024-12-02'
GROUP BY Customers.customer_id, Customers.customer_name
HAVING soluong > 1;

-- 10. Lấy thông tin về các sản phẩm đã được đặt hàng nhiều lần nhất và số lượng đơn đặt hàng tương ứng (product_id, product_name, total_ordered)
SELECT Products.product_id, Products.product_name, sum(OrderDetails.quantity) AS soluong
FROM OrderDetails
INNER JOIN Orders ON Orders.order_id = OrderDetails.order_id
INNER JOIN Products ON Products.product_id = OrderDetails.product_id
INNER JOIN Customers ON Customers.customer_id = Orders.customer_id
GROUP BY product_id, product_name
ORDER BY soluong DESC
LIMIT 1;