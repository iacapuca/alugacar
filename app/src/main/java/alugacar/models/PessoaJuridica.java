package alugacar.models;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(boolean estaAtivo, String nome, String telefone, String endereco, String cnpj) {
        super(estaAtivo, nome, telefone, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
