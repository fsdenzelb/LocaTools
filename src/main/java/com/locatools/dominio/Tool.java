package main.java.com.locatools.dominio;

public class Tool {
    private String nome;
    private String categoria;
    private double diaria;

    public Tool(String nome, String categoria, double diaria) {
        this.nome = nome;
        this.categoria = categoria;
        this.diaria = diaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }
}
