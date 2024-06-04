package Desafio;
public class alimentacao extends loja{
    private data dataAlvara; 

    public alimentacao(String nome, int i, int j, endereco endereco, data dataAlvara, data d1, int k) {
        super(nome, endereco);
        this.dataAlvara = dataAlvara;
    }

    public void setDataAlvara(data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public data getdataAlvara() {
        return dataAlvara;
    }

    public String toString() {
        return super.toString() + ", Data do Alvará: " + dataAlvara;
    }

}
