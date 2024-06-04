package Desafio;

public class data {
    private int dia;
    private int mes;
    private int ano;

    public data(int dia, int mes, int ano) {
        if (!validarData(dia, mes, ano)) {
            System.out.println("Data inválida. Utilizando data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    // Getters e setters

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto () {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    private boolean validarData(int dia, int mes, int ano) {
        if (dia < 1 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        }
        if (mes == 2) {
            if (dia > 29) {
                return false;
            }
            if (dia == 29 && !verificaAnoBissexto(ano)) {
                return false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                return false;
            }
        } else {
            if (dia > 31) {
                return false;
            }
        }
        return true;
    }

    private boolean verificaAnoBissexto (int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }


}
