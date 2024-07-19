CREATE DATABASE stores;
USE stores;
CREATE TABLE Product(PdtId INT PRIMARY KEY, Pname VARCHAR(20), Price DOUBLE(3,2),Qtyinstock INT);
CREATE TABLE  Sale(saleId INT PRIMARY KEY, Deliveryaddress VARCHAR(50));
CREATE TABLE Saleitem(saleId INT,PdtId INT, Qty INT,FOREIGN KEY (saleId) REFERENCES Sale(saleId),FOREIGN KEY (PdtId) REFERENCES Product(PdtId),PRIMARY KEY(saleId,PdtId));

CREATE TRIGGER abc1
AFTER INSERT ON Saleitem
FOR EACH ROW
UPDATE Product SET Qtyinstock=Product.Qtyinstock-new.Qty WHERE PdtId=new.PdtId;


INSERT INTO Product VALUES (101,"pencil", 5, 10);
SELECT * FROM Product;
INSERT INTO Product VALUES (102,"pen", 3, 10);
INSERT INTO Sale(saleId,Deliveryaddress) VALUES(001,"home123"),(002,"home345");
INSERT INTO Saleitem VALUES (001,102,8);
INSERT INTO Saleitem VALUES (002,101,3);
INSERT INTO Saleitem VALUES (002,102,1);
SET sql_safe_updates=0;
SHOW TRIGGERS;