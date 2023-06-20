DECLARE
    CURSOR cProduto IS SELECT Id From Produto WHERE Id IN (1, 2, 3);
    v_id NUMBER;
    
 BEGIN
    OPEN cProduto;
        LOOP
            FETCH cProduto INTO v_id;
            EXIT WHEN cProdutoPreco%NOTFOUND;
            
            UPDATE Produto SET Status = 0 WHERE ID = v_id;
        END LOOP;
    CLOSE cProduto;
END;
