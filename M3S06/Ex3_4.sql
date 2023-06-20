CREATE OR REPLACE PROCEDURE ExibirTodosProdutos
    CURSOR cProduto IS SELECT Id, Descricao, Status, Cadastro, QuantidadeEmEstoque From Produto;
    nid NUMBER;
    vdescricao VARCHAR(200);
    nstatus NUMBER;
    tcadastro TIMESTAMP;
    nestoque NUMBER;
    
 BEGIN
    OPEN cProduto;
        LOOP
            FETCH cProduto INTO nid, vdescricao, nstatus, tcadastro, nestoque;
            EXIT WHEN cProdutoPreco%NOTFOUND;
                DBMS_OUTPUT.PUT_LINE(nid || vdescricao || nstatus || tcadastro || nestoque);
        END LOOP;
    CLOSE cProdutoPreco;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Erro: dados não encontrados.');
END;
