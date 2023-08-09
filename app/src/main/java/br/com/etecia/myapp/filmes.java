package br.com.etecia.myapp;

public class filmes {

    private String Titulo;

    private int Imagem;

    private String Descricao;

    private String Categoria;


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getImagem() {
        return Imagem;
    }

    public void setImagem(int imagem) {
        Imagem = imagem;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public filmes(String titulo, int imagem, String descricao, String categoria) {
        Titulo = titulo;
        Imagem = imagem;
        Descricao = descricao;
        Categoria = categoria;


    }
}