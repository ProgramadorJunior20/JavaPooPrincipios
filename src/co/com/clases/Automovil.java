package co.com.clases;

public class Automovil implements Comparable<Automovil>{

    // Atributos
    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private TipoAutomovil tipo;

    private static Color colorPatente = Color.ROJO; // Atributo estático

    private static int capacidadEstanqueEstico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120; // Constante
    public static final int VELOCIDAD_MAX_CIUDAD = 60; // Constante

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_NEGRO = "Negro";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_GRIS = "Gris Oscuro";

    // Inicializando un constructor y le pasamos dos parameters
    // Constructores
    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo); // Con this(); invocamos un constructor
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) { // Sobrecarga de constructores
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Color getColorPatente() { //Método estático getters
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) { // Método estático setters
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstico() {
        return Automovil.capacidadEstanqueEstico;
    }

    public static void setCapacidadEstanqueEstico(int capacidadEstanqueEstico){
        Automovil.capacidadEstanqueEstico = capacidadEstanqueEstico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda) {
        if (indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    // Métodos
    public String verDetalle() {
        String detalle =  "auto.id = " + getId() + // Mostramos id
                "\nautomovil.fabricante = " + getFabricante() + // Solo utilizamos get para obtener y set para asignar valores
                "\nautomovil.modelo = " + getModelo();

        if (this.getTipo() != null){
            detalle += "\nautomovil.tipo = " + this.getTipo().getDescripcion();
        }

        detalle += "\nautimovil.colorPatente = " + colorPatente + // colorPatente atributo estático
                "\nautomovil.color = " + this.color;

        if(this.motor != null){
            detalle += "\nautomovil.cilindraje = " + this.motor.getCilindrada();
        }

        if (getConductor() != null){
            detalle += "\nConductor Toyota: " + this.getConductor();
        }

        if(getRuedas() != null){
            // Iterar la clase Rueda[] con un for y mostrar por pantalla las ruedas de un automovil
            detalle += "\nRuedes del automóvil: ";
            for (Rueda r: this.getRuedas()){
                detalle += "\n Fabricante: " + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho();
            }
        }

        return detalle;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " Frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(this.getEstanque().getCapacidad()*porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(this.getEstanque().getCapacidad()*(porcentajeBencina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km/(getCapacidadEstanqueEstico()*(porcentajeBencina / 100f));
    }

    // Sobre escritura de métodos

    @Override
    public boolean equals(Object obj) {
        // Si se trata del mismo es verdadero
        if (this == obj) {
            return true;
        }

        // Solo comparamos cuando tipo de dato es Automovil
        if (!(obj instanceof Automovil)) {
            return false;
        }

        // Si esto se cumple ambos objetos son iguales
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " : " + this.fabricante + " " + this.modelo;
    }

    /*@Override
    public int compareTo(Object o) { // Comparamos el objeto que estamos pasando con el atributo de la clase, para ordenarlos de forma ascendente A-Z.
        // Vamos a hacer un cast del objeto que pasamos como parametro
        Automovil a = (Automovil) o;

        return this.fabricante.compareTo(a.fabricante);
    }*/

    @Override
    public int compareTo(Automovil a) { // Comparamos el objeto que estamos pasando con el atributo de la clase, para ordenarlos de forma ascendente A-Z.
        return this.conductor.toString().compareTo(a.conductor.toString());
    }
}
