UPDATE estudantes SET media_geral = 10 WHERE nome = 'Antonio';

UPDATE cursos SET ead = '1' WHERE id_professor NOT IN (SELECT id FROM professores WHERE estado <> 'SC');

DELETE FROM cursos WHERE nome = 'PL/SQL';