/**
 * Part 1: Creates the 'livros' table if it does not exist.
 * @param conn The database connection.
 * @throws SQLException If a database access error occurs.
 */
private static void createTable(Connection conn) throws SQLException {
    try (Statement stmt = conn.createStatement()) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS livros (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "titulo VARCHAR (100)," +
                "autor VARCHAR (100)," +
                "ano INT" +
                ");";
        stmt.execute(createTableSQL);
        System.out.println("Tabela 'livros' criada ou já existente.");
    }
}