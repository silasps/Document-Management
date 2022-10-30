package domain.documento;

import repository.DocumentsList;

import java.util.List;

public class Documento {

    private static Integer contador = 0;

    Integer identificador;
    Integer identificadorResponsavel;
    Integer identificadorCriador;
    String linkDocumento;
    String estadoDocumento;
    String local;

    public Documento(Integer identificadorResponsavel, Integer identificadorCriador, String linkDocumento, String estadoDocumento, String local) {
        this.identificador = contador++;
        this.identificadorResponsavel = identificadorResponsavel;
        this.identificadorCriador = identificadorCriador;
        this.linkDocumento = linkDocumento;
        this.estadoDocumento = estadoDocumento;
        this.local = local;
        DocumentsList.adicionar(this);
    }



    //Getters and Setters

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Integer getIdentificadorResponsavel() {
        return identificadorResponsavel;
    }

    public void setIdentificadorResponsavel(Integer identificadorResponsavel) {
        this.identificadorResponsavel = identificadorResponsavel;
    }

    public String getLinkDocumento() {
        return linkDocumento;
    }

    public void setLinkDocumento(String linkDocumento) {
        this.linkDocumento = linkDocumento;
    }

    public String getEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(String estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }

    public Integer getIdentificadorCriador() {
        return identificadorCriador;
    }

    public void setIdentificadorCriador(Integer identificadorCriador) {
        this.identificadorCriador = identificadorCriador;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "idDoc='" + identificador + '\'' +
                ", idCriador='" + identificadorResponsavel + '\'' +
                ", idResp='" + identificadorResponsavel + '\'' +
                ", link=" + linkDocumento + '\'' +
                ", local=" + local + '\'' +
                ", estado=" + estadoDocumento +
                '}';
    }
}
