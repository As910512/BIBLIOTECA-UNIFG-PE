 } catch (SQLException se) {
            System.err.println("Erro SQL durante a operação do banco de dados: " + se.getMessage());
            se.printStackTrace();
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("\nOperações SQL concluídas.");
        }
    } // Fim do main

