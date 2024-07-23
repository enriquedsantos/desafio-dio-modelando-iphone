public class iPhone {
    public static void main(String[] args) {
        aparelhoTelefonico  aTelefonico = new aparelhoTelefonico();
        aTelefonico.ligar();
        aTelefonico.atender();
        aTelefonico.iniciarCorreioVoz();

        reprodutorMusical rMusical = new reprodutorMusical();
        rMusical.tocar();
        rMusical.pausar();
        rMusical.selecionarMusica();

        navegadorInternet mInternet = new navegadorInternet();
        mInternet.exibirPagina();
        mInternet.adicionarNovaAba();
        mInternet.atualizarPagina();
    }
}
