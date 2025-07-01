  /**
     * Part 4: Retrieves and prints all data from the 'livros' table.
     * @param conn The database connection.
     * @throws SQLException If a database access error occurs.
     */
    private static void retrieveData(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM livros;")) {
            System.out.println("\n--- Registros atuais na tabela 'livros' ---");
            if (!rs.isBeforeFirst()) { // Checks if the ResultSet is empty
                System.out.println("Nenhum registro encontrado.");
            } else {
                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id") +
                                       ", Título: " + rs.getString("titulo") +
                                       ", Autor: " + rs.getString("autor") +
                                       ", Ano: " + rs.getInt("ano"));
                }
            }
        }
    }
