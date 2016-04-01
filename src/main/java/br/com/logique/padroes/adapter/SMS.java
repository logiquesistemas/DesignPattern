package br.com.logique.padroes.adapter;

/**
 * Created by Gustavo on 01/04/2016.
 */
public class SMS {

    private String destino;
    private String origem;
    private String texto;

    private SMS(String destino, String origem, String texto) {
        this.destino = destino;
        this.origem = origem;
        this.texto = texto;
    }

    public static SMS of(String destino, String origem, String texto){
        return new SMS(destino, origem, texto);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
