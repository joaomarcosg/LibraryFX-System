package com.joao.libraryfx;

public class Author {

    private String name;
    private String email;
    private String cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void showDetails() {
        IO.println("Mostrando detalhes do autor");
        IO.println("Nome: " + name);
        IO.println("Email: " + email);
        IO.println("CPF: " + cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Author other)) return false;
        return this.name.equals(other.name);
    }
}
