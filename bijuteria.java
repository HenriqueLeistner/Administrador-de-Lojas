package Desafio;
public class bijuteria extends loja{
  
    private double metaVendas;

    public bijuteria(String nome, int i, int j, endereco endereco, data d1, double metaVendas, int k) {
        super(nome, endereco);
        this.metaVendas = metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public double getmetaVendas() {
        return metaVendas;
    }

    public String toString() {
        return super.toString() + ", Meta de Vendas: " + metaVendas;
    }

}
