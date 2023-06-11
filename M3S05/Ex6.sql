BEGIN
  FOR produto IN (SELECT Valor FROM ProdutoPreco WHERE Valor > 100 FETCH FIRST 3 ROWS ONLY) LOOP
    produto.Valor := produto.Valor + (produto.Valor * 0.15);
  END LOOP;
END;
