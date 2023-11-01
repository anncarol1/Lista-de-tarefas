# Lista de Tarefas

## Descrição
Este é um aplicativo simples de lista de tarefas criado em Java com a interface gráfica Swing. O aplicativo permite que você adicione tarefas, remova tarefas específicas e liste todas as tarefas na interface do usuário.

## Requisitos
- Java Development Kit (JDK) instalado. O JDK utilizado no desenvolvimento foi o JDK 20.0.2.
- Ambiente de desenvolvimento Java, como Eclipse, IntelliJ IDEA ou qualquer outro de sua escolha.
  
## Bibliotecas Utilizadas
O projeto utiliza as seguintes bibliotecas Java e suas funções:

1. **javax.swing.JFrame:** Classe responsável por criar uma janela com decorações e botões de controle.

2. **javax.swing.JLabel:** Utilizada para exibir informações na interface, como o título "Lista de Tarefas".

3. **javax.swing.JTextArea:** Cria uma área de texto não editável para exibir e listar as tarefas adicionadas.

4. **javax.swing.JScrollPane:** Fornece barras de rolagem em torno da JTextArea para rolar a lista de tarefas.

5. **javax.swing.JButton:** Usada para criar botões na interface, como "Adicionar Tarefa", "Remover Tarefa" e "Sair".

6. **java.awt.Color:** Biblioteca AWT usada para definir as cores de fundo dos componentes da interface.

7. **java.awt.Font:** Biblioteca AWT utilizada para definir o tamanho e estilo da fonte do texto, como o título e o autor.

8. **java.awt.event.ActionEvent e java.awt.event.ActionListener:** Classes AWT para criar ações de botões, como responder aos eventos de clique nos botões.

9. **java.util.ArrayList:** Usada para criar e gerenciar uma lista dinâmica de tarefas.

10. **javax.swing.JOptionPane:** Classe Swing usada para exibir janelas de diálogo pop-up para entrada de texto e exibição de mensagens ao usuário.

## Como Usar
1. **Compilando e Executando o Projeto:**
   - Abra seu ambiente de desenvolvimento Java.
   - Crie um novo projeto Java ou adicione a classe `ListaDeTarefas.java` a um projeto existente.
   - Compile e execute o projeto.

2. **Interface do Usuário:**
   - A janela da aplicação será aberta, apresentando uma interface simples de lista de tarefas.

3. **Adicionar Tarefa:**
   - Clique no botão "Adicionar Tarefa".
   - Uma janela de diálogo será exibida, onde você pode digitar a tarefa que deseja adicionar.
   - Clique em "OK" para adicionar a tarefa à lista.

4. **Remover Tarefa:**
   - Clique no botão "Remover Tarefa".
   - Uma janela de diálogo será exibida, onde você pode digitar o índice da tarefa a ser removida.
   - Se o índice for válido, a tarefa será removida.

5. **Listar Tarefas:**
   - As tarefas adicionadas serão listadas na área de texto na interface.

6. **Sair do Programa:**
   - Clique no botão "Sair" para encerrar o programa.

## Personalização
Você pode personalizar a aparência e o comportamento da interface de acordo com suas preferências. O código é aberto e pode ser modificado para atender às suas necessidades.

## Contribuições
Sinta-se à vontade para contribuir com melhorias ou correções para este código. Você pode abrir problemas (issues) ou enviar solicitações de pull (pull requests) neste repositório.
