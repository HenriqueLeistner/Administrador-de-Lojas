package Desafio;
public class informatica extends loja{
    
    private double seguroEletronicos;

    public informatica(String nome, int i, int j, endereco endereco, data d1, double seguroEletronicos, int k) {
        super(nome, endereco);
        this.seguroEletronicos = seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getseguroEletronicos() {
        return seguroEletronicos;
    }

    public String toString() {
        return super.toString() + ", Seguro de Eletrônicos: " + seguroEletronicos;
    }

}
