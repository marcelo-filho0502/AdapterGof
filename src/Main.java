public class Main {
    public static void main(String[] args) {

        ArquivoOriginal meuArquivo = new ArquivoOriginal();

        InterfaceSistemaInternacional rh = new AdapterInternacional(meuArquivo);
        rh.exibirDadosInternacionais();

        System.out.println();

        InterfaceSistemaEngenharia mkt = new AdapterEngenharia(meuArquivo);
        mkt.exibirDadosTecnicos();
    }
}