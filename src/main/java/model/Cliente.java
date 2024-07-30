package model;

import jakarta.persistence.*;

@Entity

public class Cliente {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String nome;

    private String email;

    private int idade;

    @ManyToOne (cascade = CascadeType.ALL)
    private Categoria categ;

    public Categoria getCateg() {
        return categ;
    }

    public void setCateg(Categoria categ) {
        this.categ = categ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }




}
