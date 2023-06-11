BEGIN
  FOR produto IN (SELECT Status FROM Produto) LOOP
    IF produto.status = 1 THEN
      DBMS_OUTPUT.PUT_LINE('ativo');
    ELSE
      DBMS_OUTPUT.PUT_LINE('desativado');
    END IF;
  END LOOP;
END;
