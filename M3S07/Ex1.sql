CREATE OR REPLACE FUNCTION CalculaDesconto(idProduto NUMBER, aplicarDesconto NUMBER) RETURN NUMBER IS

BEGIN
	FOR valor IN (SELECT Valor FROM ProdutoPreco WHERE ID = idProduto) LOOP
		IF aplicarDesconto = 1 THEN
			RETURN valor * 0.85;
		ELSE
			RETURN valor;
		END IF;
	END LOOP;
END;
