// Fornecedor — dados em XML
public class FornecedorDados {
    public String getDados() {
        return "<usuario>João</usuario><senha>1234</senha><cor>azul</cor>";
    }

    @Override
    public String toString() {
        return getDados();
    }
}
