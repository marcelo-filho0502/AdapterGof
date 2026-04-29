public class XmlParaBinarioAdapter implements BibliotecaAnalises {

    private FornecedorDados fornecedor = new FornecedorDados();

    @Override
    public void analisar() {
        String xml = fornecedor.getDados();



        System.out.println("\n=== DEPOIS (BINÁRIO) ===");

        byte[] bytes = xml.getBytes();
        for (byte b : bytes) {
            String binario = String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
            System.out.print(binario + " ");
        }
        System.out.println();
    }
}