package thiagorabaioli.laf.entities.enums;

public enum TypeOfLost {
    WHITH_VALUE(1, "WITH VALUE"),
    WITHOUT_VALUE(2, "WITH OUT VALUE"),
    OTHER(3, "OTHER");

    private int cod;
    private String description;

    private TypeOfLost(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static TypeOfLost toEnum(Integer cod) {
        if(cod == null){
            return null;
        }
        for (TypeOfLost t : TypeOfLost.values()) {
            if (cod.equals(t.getCod())) {
                return t;
            }
        }
        throw new IllegalArgumentException("No enum constant with value: " + cod);
    }
}
