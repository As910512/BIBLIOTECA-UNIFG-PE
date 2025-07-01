 /**
     * Part 2: Inserts sample data into the 'livros' table.
     * @param conn The database connection.
     * @throws SQLException If a database access error occurs.
     */
    private static void insertData(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            // Note: For subsequent runs, these inserts might cause issues if not handled (e.g., using INSERT OR IGNORE)
            // For simplicity, we are inserting directly. If you run this multiple times, new IDs will be generated.
            String insert1SQL = "INSERT INTO livros (titulo, autor, ano) VALUES ('Dom Casmurro', 'Machado de Assis', 1899);";
            int rowsAffected = stmt.executeUpdate(insert1SQL);
            System.out.println(rowsAffected + " registro(s) inserido(s): Dom Casmurro.");

            String insert2SQL = "INSERT INTO livros (titulo, autor, ano) VALUES ('A Hora da Estrela', 'Clarice Lispector', 1977);";
            rowsAffected = stmt.executeUpdate(insert2SQL);
            System.out.println(rowsAffected + " registro(s) inserido(s): A Hora da Estrela.");
        }
    }