package alugacar.models;

public abstract class Cliente {
    private boolean estaAtivo;
    private String nome;
    private String telefone;
    private String endereco;

    public Cliente(boolean estaAtivo, String nome, String telefone, String endereco) {
        this.estaAtivo = estaAtivo;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
