DECLARE
	valorTotal NUMBER;
BEGIN
	SELECT SUM(Valor) INTO total FROM ProdutoPreco;
	IF total < 150 THEN
			DBMS_OUTPUT.PUT_LINE('Soma do produto menor 150.00');
		ELSIF total < 500 THEN
			DBMS_OUTPUT.PUT_LINE('Soma do produto está entre 150 e 500');
		ELSE
			DBMS_OUTPUT.PUT_LINE('Soma dos produtos está acima de 500,00');
		END IF;
END;
