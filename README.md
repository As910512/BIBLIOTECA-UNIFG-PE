<img src="https://devicon-website.vercel.app/api/github/original.svg"></img>

Projeto inicial

🎉:Biblioteca UNIFG-PE
integrante 1 - Ayrton - responsável por garantir que o ambiente esteja pronto para a conexão com o banco de dados: garantir que o sistema pudesse 'conversar' com o SQLite. Isso envolveu carregar o driver JDBC, que é a ponte entre o Java e o banco de dados. Foi adcionado uma verificação para o caso de o driver não ser encontrado, o que é crucial para evitar falhas mais adiante e dar um feedback claro ao usuário ou desenvolvedor.

Integrante 2 - Carlos - responsável por gerenciar a conexão principal com o banco de dados e coordenar a chamada dos outros módulos de operação: Responsável por estabelecer a conexão real com o arquivo livros.db. Usei o try-with-resources para garantir que a conexão seja fechada automaticamente, mesmo se ocorrerem erros. Minha função principal é orquestrar a sequência de operações: criar a tabela, inserir, atualizar, consultar e excluir dados, chamando os métodos específicos desenvolvidos por outras pessoas.

Integrante 3 - David - Responsável por capturar e gerenciar exceções que possam ocorrer durante as operações do banco de dados ou quaisquer outras exceções inesperadas: aqui a missão foi garantir a robustez do programa. Implementei os blocos catch para interceptar quaisquer SQLException (problemas específicos do banco de dados) e Exception genéricas. Isso assegura que o programa não trave e que mensagens de erro úteis sejam exibidas. O bloco finally é essencial para indicar que todas as operações tentaram ser concluídas, independentemente do sucesso.

Integrante 4 - Davi - Responsável por definir e executar a lógica para criar a estrutura da tabela no banco de dados: Cuidou da fundação do nosso banco de dados: a criação da tabela livros. O comando SQL CREATE TABLE IF NOT EXISTS é fundamental para evitar erros se a tabela já existir. Defini as colunas id, titulo, autor e ano, garantindo que tivéssemos um esquema básico para armazenar as informações dos livros.

Integrante 5 - Emerson - Responsável por Inserir registros iniciais na tabela para popular o banco de dados: aqui a missão foi popular a tabela livros com alguns dados iniciais. Foi preparado as instruções INSERT para adicionar 'Dom Casmurro' e 'A Hora da Estrela'. Utilizado executeUpdate e registrado quantos registros foram afetados, o que é útil para confirmar se a inserção ocorreu corretamente.

Integrante 6 - Esdras - Responsável por Implementar a lógica para modificar registros existentes na tabela: Incarregado da funcionalidade de atualização. O método updateData altera o ano do livro 'Dom Casmurro' para 1900. Essa é uma operação crucial para manter a base de dados precisa. Novamente, utilizado o executeUpdate para executar a instrução SQL e verificar o número de linhas modificadas.

Integrante 7 - Mahely - Responsáveç por consultar o banco de dados e exibir os resultados de forma legível: responsável pela parte de 'leitura' do CRUD. Criou o método retrieveData para buscar todos os livros na tabela. É importante lidar com o caso de a tabela estar vazia, então foi adicionado uma verificação para isso. Para cada registro encontrado, extraído os dados e foi impresso no console, fornecendo uma visão clara do conteúdo do banco.

Intregante 8 - Juan - Responsável por implementar a funcionalidade para remover registros da tabela: responsável pela operação de exclusão. O método deleteData remove registros com base em um critério específico, neste caso, o autor 'Clarice Lispector'. É vital que essa operação seja precisa para não apagar dados indevidamente. O retorno do número de linhas afetadas também é útil para confirmar a exclusão.

--------------------------------------------------------------------------------------------------------------------------------------
Esta divisão demonstra como um projeto pode ser modularizado e como diferentes membros de uma equipe podem contribuir para componentes específicos de uma aplicação. Cada parte é funcional por si só, mas se integra para formar o programa completo.
