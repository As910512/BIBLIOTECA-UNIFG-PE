import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class biblio {

    // Nome do arquivo do banco de dados SQLite
    private static final String DB_URL = "jdbc:sqlite:livros.db";

    public static void main(String[] args) {
        // --- Parte 1: Carregamento do Driver JDBC e Configurações Iniciais ---
        // Responsável: Pessoa 1
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver JDBC para SQLite carregado com sucesso.");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("Erro (Pessoa 1): Driver JDBC para SQLite não encontrado. Verifique se o JAR está no classpath.");
            cnfe.printStackTrace();
            return; // Sai se o driver não for encontrado
        }
    } // Fim do método main
} // Fim da classe biblio

        
        