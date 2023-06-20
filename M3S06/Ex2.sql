DECLARE
    CURSOR cProdutoPreco IS SELECT Id, Status, Preco From ProdutoPreco;
    v_id NUMBER;
    v_status NUMBER;
    v_preco NUMBER;
    
 BEGIN
    OPEN cProdutoPreco;
        LOOP
            FETCH cProdutoPreco INTO v_id, v_status, v_preco;
            EXIT WHEN cProdutoPreco%NOTFOUND;
            
            IF (v_status = 1 AND v_valor < 1000) THEN
                DBMS_OUTPUT.PUT_LINE('O id ' || v_id || ' tem status 1 e valor menor que 1000.');
            END IF;
        END LOOP;
    CLOSE cProdutoPreco;
END;
