String url = "jdbc:oracle:thin:@localhost:1521/dihphilips";
String user = "admin";
String password = "1234";

try (Connection con = DriverManager.getConnection(url, user, password)) {
	Statement statement = con.createStatement();
	statement.execute("INSERT INTO PRODUTOS (NOME, DESCRICAO, PRECO) VALUES ('Whey Protein Concentrado', 'Suplemento proteico para atletas', 100)");
catch (SQLException e) {}
