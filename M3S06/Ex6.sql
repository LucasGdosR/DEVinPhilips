CREATE OR REPLACE PROCEDURE DeletarProduto(idIn NUMBER) IS

  FKException EXCEPTION;
  AtivoException EXCEPTION;
  
BEGIN
  FOR entry IN (SELECT Id_Produto FROM ProdutoPreco WHERE Id_Produto = idIn) LOOP
      RAISE FKException;
  END LOOP;

  FOR entry IN (SELECT Id FROM Produto WHERE Id = idIn AND Status = 1) LOOP
      RAISE AtivoException;
  END LOOP;

  DELETE FROM Produto WHERE Id = idIn;
END;
