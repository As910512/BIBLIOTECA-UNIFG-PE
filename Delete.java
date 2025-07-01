import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement; // Importa a classe Statement

public class Delete {

     * @param conn The database connection.
     * @throws SQLException If a database access error occurs.
     */
    private static void deleteData(Connection conn) throws SQLException {
        // O try-with-resources garante que o Statement seja fechado automaticamente
        try (Statement stmt = conn.createStatement()) {
            String deleteSQL = "DELETE FROM livros WHERE autor = 'Clarice Lispector';";
            int rowsAffected = stmt.executeUpdate(deleteSQL);
            System.out.println("\n" + rowsAffected + " registro(s) excluído(s).");
        }
    }

    public static void main(String[] args) {
        Connection connection = null; // Inicializa a conexão como nula

        try {

            System.out.println("Tentando conectar ao banco de dados...");
           
            if (connection != null) {
                deleteData(connection);
            } else {
                System.out.println("Não foi possível estabelecer a conexão com o banco de dados.");
            }

        } catch (SQLException e) {
            System.err.println("Erro SQL: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Garante que a conexão seja fechada, mesmo que ocorra um erro
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Conexão com o banco de dados fechada.");
                } catch (SQLException e) {
                    System.err.println("Erro ao fechar a conexão: " + e.getMessage());
                }
            }
        }
    }
}