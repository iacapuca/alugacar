package alugacar.models;

public class PessoaFisica extends Cliente{
    private String cpf;
    private String cnh;

    public PessoaFisica(boolean estaAtivo, String nome, String telefone, String endereco, String cpf, String cnh) {
        super(estaAtivo, nome, telefone, endereco);
        this.cpf = cpf;
        this.cnh = cnh;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
