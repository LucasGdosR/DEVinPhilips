CREATE OR REPLACE PROCEDURE ListarProdutoPrecoPorIdProduto(idIn NUMBER, soma OUT NUMBER) IS
BEGIN
    SELECT SUM(ProdutoPreco.Valor) INTO soma
    FROM Produto JOIN ProdutoPreco ON Produto.Id = ProdutoPreco.Id_Produto
    WHERE Id_produto = idIn;
END
