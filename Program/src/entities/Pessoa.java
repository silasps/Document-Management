package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
    //Atributos
    private String identificador; //deverá ser gerado automaticamento pelo sistema
    private String nome;
    private String sobrenome;
    private Date dataDeNascimento;
    private String cpf; //validar se o CPF é válido
    private String enderecoCompleto;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    //construtores
    public Pessoa(){
    }

    public Pessoa(
            String identificador,
            String nome,
            String sobrenome,
            Date dataDeNascimento,
            String cpf,
            String enderecoCompleto
    ){
        this.identificador = identificador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.enderecoCompleto = enderecoCompleto;
    }

    //Getters
    public String getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    //Setters
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        Pessoa.sdf = sdf;
    }

    //Métodos - ?? Inferir e consultar ??

}
