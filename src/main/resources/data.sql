CREATE TABLE Prices(
CodProd varChar(40) CONSTRAINT PK_CodProd PRIMARY KEY,
precio float
);

INSERT INTO Prices (CodProd, precio) VALUES ('prod001', 5);