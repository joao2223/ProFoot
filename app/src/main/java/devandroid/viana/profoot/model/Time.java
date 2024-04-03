package devandroid.viana.profoot.model;

public class Time {
    private int id;
    private String nomeDoTime;
    private int localizacao;
    private int divisao;
    private int libertadores;
    private int sulamericana;
    private int jogador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoTime() {
        return nomeDoTime;
    }

    public void setNomeDoTime(String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    public int getDivisao() {
        return divisao;
    }

    public void setDivisao(int divisao) {
        this.divisao = divisao;
    }

    public int getLibertadores() {
        return libertadores;
    }

    public void setLibertadores(int libertadores) {
        this.libertadores = libertadores;
    }

    public int getSulamericana() {
        return sulamericana;
    }

    public void setSulamericana(int sulamericana) {
        this.sulamericana = sulamericana;
    }

    public int getJogador() {
        return jogador;
    }

    public void setJogador(int jogador) {
        this.jogador = jogador;
    }
}
