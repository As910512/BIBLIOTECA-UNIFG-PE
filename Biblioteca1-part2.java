// Main execution flow
try (Connection conn = Driver Manager.getConnection(DB_URL)) {
System.out.println("Conexão com o banco de dados SQLite estabelecida.");
// Part 1: Table Creation createTable(conn);
// Part 2: Data Insertion insertData(conn);
// Part 3: Data Update updateData(conn);
// Part 4: Data Retrieval
(Select)
retrieveData(conn);
// Part 5: Data Deletion deleteData(conn);
// Retrieve data again after deletion to show the final state 
System.out.println("\n---Registros após a exclusão final---);
retrieveData(conn); // Re-use the retrieveData method
}
