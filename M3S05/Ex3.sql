SELECT (
  Produto.Id,
  ProdutoPreco.Id,
  Produto.Descricao,
  ProdutoPreco.Valor,
  TO_CHAR(Produto.Cadastro, 'MM/YYYY'))
FROM Produto INNER JOIN ProdutoPreco ON Produto.Id = ProdutoPreco.IdProduto;
