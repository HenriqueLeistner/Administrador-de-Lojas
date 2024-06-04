package Desafio;
public class vestuario extends loja{
   
    private boolean produtosImportados;

    public vestuario(String nome, int i, int j, Desafio.endereco endereco, data d1, boolean produtosImportados, int k) {
        super(nome, endereco);
        this.produtosImportados = produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public boolean getprodutosImportados() {
        return produtosImportados;
    }

    public String toString() {
        return super.toString() + ", Produtos Importados: " + produtosImportados;
    }

}
