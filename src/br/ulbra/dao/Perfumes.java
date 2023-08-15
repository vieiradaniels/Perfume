package br.ulbra.dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;

/**
 *
 * @author Daniel Vieira
 */
public class Perfumes {

    ArrayList listaPerfumes;

    public Perfumes() {
        listaPerfumes = new ArrayList();
    }

    public void salvar(String elemento) {
        listaPerfumes.add(elemento);
        JOptionPane.showMessageDialog(null, "Perfume salvo!");
    }

    public String listar() {
        String res = "";
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lista vazia, adicione algum perfume!");
        } else {
            for (int i = 0; i < listaPerfumes.size(); i++) {
                res += (i + 1) + "-" + listaPerfumes.get(i) + "\n";
            }
        }
        return res;
    }

    public void excluir(int i) {
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Impossível excluir, pois a lista encontra-se vazia!");
        } else {
            if ((i - 1) >= 0 && (i - 1) < listaPerfumes.size()) {
                listaPerfumes.remove(i - 1);
                JOptionPane.showMessageDialog(null, "Perfume removido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Perfume inexistente!");
            }
        }
    }

    public void editar(int i, String novo) {
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há como editar uma lista vazia!");
        } else {
            if ((i - 1) >= 0 && (i - 1) < listaPerfumes.size()) {
                listaPerfumes.set(i - 1, novo);
                JOptionPane.showMessageDialog(null, "Perfume alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Este perfume não pertence a lista!");
            }
        }
    }

    public void ordenar() {

        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não há perfumes para ordenar!");
        } else {
            Collections.sort(listaPerfumes, String.CASE_INSENSITIVE_ORDER);
            JOptionPane.showMessageDialog(null, "Perfumes ordenados de A a Z!");
        }
    }
    
    public void ordenarZA(){
        if (listaPerfumes.isEmpty()){
            JOptionPane.showMessageDialog(null,"Não há perfumes para ordenar!");
        }else{
            Collections.sort(listaPerfumes,  String.CASE_INSENSITIVE_ORDER);
            Collections.reverse(listaPerfumes);
            JOptionPane.showMessageDialog(null, "Perfumes ordenados de Z a A!");
        }
    }

    public void pesquisar(String termo) {
        if (listaPerfumes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A lista de perfumes está vazia!");
        } else {
            boolean encontrado = false;
            for (int i = 0; i < listaPerfumes.size(); i++) {
                if (listaPerfumes.get(i).equals(termo)) {
                    JOptionPane.showMessageDialog(null, "Perfume encontrado: " + listaPerfumes.get(i));
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Perfume não encontrado!");
            }
        }
    }
}
