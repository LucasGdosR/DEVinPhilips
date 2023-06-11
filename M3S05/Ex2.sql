CREATE TABLE ProdutoPreco(
	Id NUMBER PRIMARY KEY,
	IdProduto NUMBER,
	Valor NUMBER(10, 2) NOT NULL,
	Status NUMBER(1) NOT NULL DEFAULT (0),
	Cadastro DATE NOT NULL,
	CONSTRAINT fk_orcamento_pedido FOREIGN KEY(IdProduto) REFERENCES Produto.Id
);