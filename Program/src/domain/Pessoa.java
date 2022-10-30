package domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
    //Atributos
    private Integer identificador; //deverá ser gerado automaticamento pelo sistema
    private String nome;
    private String sobrenome;
    private LocalDate dataDeNascimento;
    private String cpf; //validar se o CPF é válido
    private String enderecoCompleto;
    private Integer idade;
    private String cargo;

    //construtores
    public Pessoa(){
    }

    Pessoa(
            Integer identificador,
            String nome,
            String sobrenome,
            LocalDate dataDeNascimento,
            String cpf,
            String enderecoCompleto,
            String cargo
    ){
        this.identificador = identificador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.enderecoCompleto = enderecoCompleto;
        this.idade = calculaIdade();
        this.cargo = cargo;
    }

    public Integer calculaIdade(){
        this.idade = LocalDate.now().getYear() - dataDeNascimento.getYear();
        return this.idade;
    }

    //Getters
    public Integer getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //    public static SimpleDateFormat getSdf() {
//        return sdf;
//    }

    //Setters
    public void setIdentificador(String identificador) {
        this.identificador = Integer.valueOf(identificador);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

//    public static void setSdf(SimpleDateFormat sdf) {
//        Pessoa.sdf = sdf;
//    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "identificador=" + identificador +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", cpf='" + cpf + '\'' +
                ", enderecoCompleto='" + enderecoCompleto + '\'' +
                ", idade=" + idade +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
