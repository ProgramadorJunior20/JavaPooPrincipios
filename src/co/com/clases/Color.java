package co.com.clases;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NEGRO("Negro"),
    GRIS("Gris Oscuro"),
    NARANJO("Naranja");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
