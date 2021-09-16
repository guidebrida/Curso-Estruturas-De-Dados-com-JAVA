package teste;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Carro {

    public String carro;
    public String potencia;
    public String ano;
    public String marca;
    public Origem origem;


    public Carro(String carro, String potencia, String ano, String marca, Origem origem) {
        this.carro = carro;
        this.potencia = potencia;
        this.ano = ano;
        this.marca = marca;
        this.origem = origem;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }
}
