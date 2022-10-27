package exemplos.exemplosArray;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exemplo03 {
    // Desafio incluir a opção alterar!
    public static void main(String[] args) {
        // arraylista é uma classe java mais flexivel para manipular uma lista
        ArrayList<String> lista = new ArrayList<String>();
        int selecionado = 0;
        Object[] opcoes = { "Incluir", "Listar", "Apagar", "Alterar" };
        do {
            try {
                selecionado = JOptionPane.showOptionDialog(
                        null,
                        "O que você deseja?",
                        "Exemplo",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null, opcoes, opcoes[0]);
                // bloco incluir
                if (selecionado == 0) { // opcoes[selecionado].equals("Incluir")
                    String item = JOptionPane.showInputDialog("Digite");
                    if (item != null) {
                        lista.add(item); // guarda na lista o item digitado
                    }
                }
                // bloco listar
                if (selecionado == 1) {
                    String msg = "";
                    for (String item : lista) {
                        msg += item + "\n";
                    }
                    if (msg.equals("")) {
                        msg = "\"Lista sem registro\"";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                }
                // bloco apagar
                if (selecionado == 2 && lista.size() > 0) {
                    Object[] opcaoApagar = new Object[lista.size()];
                    for (int i = 0; i < opcaoApagar.length; i++) {
                        opcaoApagar[i] = lista.get(i);
                    }
                    Object itemSelecionado = JOptionPane.showInputDialog(
                            null,
                            "Selecione o item para apagar",
                            "Apagar",
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            opcaoApagar,
                            opcaoApagar[0]);
                    // System.out.println(itemSelecionado.toString());
                    for (int i = 0; i < lista.size(); i++) {
                        if (itemSelecionado != null && itemSelecionado.equals(lista.get(i))) {
                            lista.remove(i);
                        }
                    }
                }
                // bloco alterar
                if (selecionado == 3) {
                    if (lista.size() > 0) {
                        Object[] opcoesAlterar = new Object[lista.size()];
                        for (int i = 0; i < opcoesAlterar.length; i++) {
                            opcoesAlterar[i] = lista.get(i);
                        }
                        Object itemSelecionado = JOptionPane.showInputDialog(
                                null,
                                "Selecione um item para alterar",
                                "Alterar",
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                opcoesAlterar,
                                opcoesAlterar[0]);
                        for (int i = 0; i < lista.size(); i++) {
                            if (itemSelecionado != null && itemSelecionado.equals(lista.get(i))) {
                                String item = JOptionPane.showInputDialog("Digite o novo item", lista.get(i));
                                lista.set(i, item);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Não possivel fazer alteração nenhum item na lista.");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace(); // plota o erro
                // o try catch serve para evitar que o programa seja interrompido
                // inesperadamente.
                JOptionPane.showMessageDialog(null, "Erro inesperado identificado com try-catch");
            }
        } while (selecionado != -1);

    }
}
