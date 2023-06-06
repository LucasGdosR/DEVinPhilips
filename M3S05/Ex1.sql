CREATE TABLE Produto(
	Id NUMBER PRIMARY KEY,
	Descricao VARCHAR(100) NOT NULL,
	[Status] NUMBER(1) NOT NULL DEFAULT (0),
	Cadastro DATETIME NOT NULL,
	QuantidadeEmEstoque NUMBER
);

INSERT INTO Produto(Id, Descricao, Status, Cadastro, QuantidadeEmEstoque) VALUES
	(1, 'Produto A', 1, TO_DATE('2023-05-01', 'YYYY-MM-DD'),  100),
	(2, 'Produto B', 0, TO_DATE('2023-05-02', 'YYYY-MM-DD'),  90),
	(3, 'Produto C', 1, TO_DATE('2023-05-03', 'YYYY-MM-DD'),  80),
	(4, 'Produto D', 0, TO_DATE('2023-05-04', 'YYYY-MM-DD'),  70),
	(5, 'Produto E', 1, TO_DATE('2023-05-05', 'YYYY-MM-DD'),  60),
	(6, 'Produto F', 0, TO_DATE('2023-05-06', 'YYYY-MM-DD'),  50),
	(7, 'Produto G', 1, TO_DATE('2023-05-07', 'YYYY-MM-DD'),  40),
	(8, 'Produto H', 0, TO_DATE('2023-05-08', 'YYYY-MM-DD'),  30),
	(9, 'Produto I', 1, TO_DATE('2023-05-09', 'YYYY-MM-DD'),  20),
	(10, 'Produto J', 0, TO_DATE('2023-05-10', 'YYYY-MM-DD'),  10);
