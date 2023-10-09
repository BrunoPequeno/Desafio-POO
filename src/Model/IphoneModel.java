package Model;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorWeb;
import Interfaces.ReprodutorMusical;

public class IphoneModel implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {
    private int codigo;
    private int senha;
    public String nomeUsuario;

    public IphoneModel(int codigo, int senha, String nomeUsuario) {
        this.codigo = codigo;
        this.senha = senha;
        this.nomeUsuario = nomeUsuario;
    }

    public int getCodigo(){
        return codigo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender(String nome) {
        System.out.println("Recebendo ligação... " + nome + "\n         -- Atender? --");
    }

    @Override
    public void iniciarCorreioVoz(String numero) {
        System.out.println(numero + " deixou um recado" + "\n   -- Deseja reproduzir? --");
    }

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}
