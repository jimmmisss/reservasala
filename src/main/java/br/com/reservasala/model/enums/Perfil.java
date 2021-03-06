package br.com.reservasala.model.enums;

public enum Perfil {

    ADMIN(1, "ROLE_ADMIN"),
    USUARIO(2, "ROLE_USUARIO");

    private int cod;
    private String descricao;

    Perfil(Integer id, String descricao) {
        this.cod = id;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Perfil toEnum(Integer cod) {

        if(cod == null) {
            return null;
        }

        for (Perfil x : Perfil.values()) {
            if(cod.equals(x.getCod())){
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);

    }

}
