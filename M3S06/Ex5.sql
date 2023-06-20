CREATE OR REPLACE PROCEDURE AtualizarProdutoPreco(idIn NUMBER, valorIn NUMBER) IS
    ProdutoNaoExisteException EXCEPTION;
    ProdutoDesativadoException EXCEPTION;
    
    FRAGMA EXCEPTION_INIT(ProdutoNaoExisteException, -200001);
    FRAGMA EXCEPTION_INIT(ProdutoNaoExisteException, -200002);
    
BEGIN
    IF (SELECT COUNT(*) FROM ProdutoPreco WHERE Id = idIn) = 0 THEN
        RAISE ProdutoNaoExisteException
    END IF;
    IF (SELECT Status FROM ProdutoPreco WHERE Id = idIn) = 0 THEN
        RAISE ProdutoDesativadoException;
    END IF;
    UPDATE ProdutoPreco SET Valor = valorIn WHERE Id = idIn;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Erro: dados não encontrados.');
END;
