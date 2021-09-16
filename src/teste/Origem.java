package teste;

public enum Origem {
    America("america"),
    Alemanha("alemanha"),
    japao("japao"),
    italia("italia"),
    frança("franca");

    private String descricao;

    Origem(String descricao){
        this.descricao= descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
