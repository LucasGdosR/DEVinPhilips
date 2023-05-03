Busque os cursos que possuem número máximo de alunos maior do que 30 e que sejam presenciais.

SELECT * FROM cursos WHERE max_estudantes > 30 AND ead = '0';

Busque os professores nascidos na América do Sul.

SELECT * FROM professores WHERE nacionalidade IN ['brasileiro', 'argentino'];
-- etc

Busque os alunos cujos nomes comecem com a letra J.

SELECT * FROM estudantes WHERE nome LIKE 'J%';

Busque os alunos com a média geral maior do que 7, ordenando do maior para o menor.

SELECT * FROM estudantes WHERE media_geral > 7 ORDER BY media_geral DESC;

Busque por todos os cursos ministrados por professoras.

SELECT * FROM cursos WHERE id_professor IN (SELECT id FROM professores WHERE sexo = 'feminino');

Busque por todos os alunos que estão matriculados em cursos EAD.

SELECT * FROM estudantes WHERE id IN (SELECT id_estudante FROM notas WHERE id_curso IN (SELECT id FROM cursos WHERE ead = '1'));