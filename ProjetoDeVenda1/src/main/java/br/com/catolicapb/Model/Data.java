package br.com.catolicapb.Model;

public class Data {

    public int dia;
    public int mes;
    public int ano;

    public Data(
            int dia1,
            int mes1,
            int ano1
    ){
        this.dia = dia1;
        this.mes = mes1;
        this.ano = ano1;
    }

    public void calcularIdade(){
        int idade = 2024 - ano;
        System.out.println(idade);
    }

    @Override
    public String toString() {

        String texto = this.dia + "/" + this.mes + "/" + this.ano;
        String textoAlt = String.format("%d/%d/%d", this.dia, this.mes, this.ano);

        return texto;
    }
}
