import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListaDeTarefas extends JFrame {
    private ArrayList<String> tarefas = new ArrayList<>();
    private JTextArea tarefasTextArea;

    public ListaDeTarefas() {
        // Configurações gerais da janela
        setTitle("Lista de Tarefas");
        setSize(400, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // Título
        JLabel tituloLabel = new JLabel("Lista de Tarefas");
        tituloLabel.setBounds(120, 10, 200, 20);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(tituloLabel);

        // Área de texto para exibir as tarefas
        tarefasTextArea = new JTextArea();
        tarefasTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(tarefasTextArea);
        scrollPane.setBounds(40, 40, 300, 150);
        add(scrollPane);

        // Botões
        JButton adicionarButton = new JButton("Adicionar Tarefa");
        adicionarButton.setBounds(40, 200, 150, 30);
        adicionarButton.setBackground(new Color(15, 250, 150));
        add(adicionarButton);

        JButton removerButton = new JButton("Remover Tarefa");
        removerButton.setBounds(190, 200, 150, 30);
        removerButton.setBackground(new Color(15, 250, 150));
        add(removerButton);

        JButton sairButton = new JButton("Sair");
        sairButton.setBounds(125, 245, 150, 30); // Centralizado na parte inferior
        sairButton.setBackground(Color.RED); // Cor de fundo vermelha
        sairButton.setForeground(Color.WHITE); // Texto em branco
        add(sairButton);

        JLabel autor = new JLabel("by misael alexandrino");
        autor.setBounds(200, 290, 250, 20);
        autor.setFont(new Font("Arial", Font.ITALIC, 15));
        add(autor);

        // Ação do botão "Adicionar Tarefa"
        adicionarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tarefa = JOptionPane.showInputDialog("Digite a tarefa a ser adicionada:");
                if (tarefa != null && !tarefa.isEmpty()) {
                    adicionarTarefa(tarefa);
                }
            }
        });

        // Ação do botão "Remover Tarefa"
        removerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String indiceStr = JOptionPane.showInputDialog("Digite o índice da tarefa a ser removida:");
                if (indiceStr != null && !indiceStr.isEmpty()) {
                    try {
                        int indice = Integer.parseInt(indiceStr);
                        if (indice >= 0 && indice < tarefas.size()) {
                            removerTarefa(indice);
                        } else {
                            JOptionPane.showMessageDialog(null, "Índice inválido.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Índice inválido.");
                    }
                }
            }
        });

        // Ação do botão "Sair"
        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sairDoPrograma();
            }
        });
    }

    private void adicionarTarefa(String tarefa) {
        // Adiciona a tarefa à lista e exibe na área de texto
        tarefas.add(tarefa);
        tarefasTextArea.append(tarefa + "\n");
        JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso.");
    }

    private void removerTarefa(int indice) {
        // Remove a tarefa da lista e atualiza a exibição
        tarefas.remove(indice);
        atualizarListaDeTarefas();
        JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso.");
    }

    private void atualizarListaDeTarefas() {
        // Limpa a área de texto e lista as tarefas novamente
        tarefasTextArea.setText("");
        for (String tarefa : tarefas) {
            tarefasTextArea.append(tarefa + "\n");
        }
    }

    private void sairDoPrograma() {
        // Sai do programa
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ListaDeTarefas().setVisible(true);
        });
    }
}
