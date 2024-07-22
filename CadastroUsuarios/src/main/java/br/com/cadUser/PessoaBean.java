package br.com.cadUser;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PessoaBean {
    private String nome;
    private List<String> nomes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void adicionarNome() {
        if (nome != null && !nome.trim().isEmpty()) {
            nomes.add(nome);
            nome = null; // Limpar o campo após adicionar
        }
    }
}
