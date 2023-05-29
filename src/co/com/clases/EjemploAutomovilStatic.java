package co.com.clases;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        // Creando un objeto de la clase Automovil
        Motor motorToyota = new Motor(5.0, TipoMotor.DIESEL);
        Automovil toyota = new Automovil("Toyota", "Picot");
        toyota.setColor(Color.AZUL);
        toyota.setMotor(motorToyota);
        toyota.setEstanque(new Estanque(50));
        toyota.setTipo(TipoAutomovil.HATCHBACK);

        // Modificando atributo estático
        Automovil.setCapacidadEstanqueEstico(45);
        Automovil.setColorPatente(Color.ROJO);
        float consumoKlPorL = Automovil.calcularConsumoEstatico(300, 60); // gasto o consumio el 50 por ciento del estanque


        Motor motorMazda = new Motor(2.2, TipoMotor.BENCINA);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.NEGRO, motorMazda, new Estanque(44));
        mazda.setTipo(TipoAutomovil.PICKUP);

        Motor motorNissan = new Motor(3.2, TipoMotor.BENCINA);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);

        Motor motorNissan2 = new Motor(3.5, TipoMotor.BENCINA);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.NARANJO, motorNissan2, new Estanque(60));
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil auto = new Automovil();


        System.out.println(toyota.verDetalle());
        System.out.println();
        System.out.println(nissan.verDetalle());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println(nissan2.verDetalle());

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilómetros por litro = " + consumoKlPorL);
        System.out.println("nissan = " + nissan);
        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA + "KL/H");
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD + "KL/H");

        // Creando una variable del tipo de la clase enum TipoAutomovil
        TipoAutomovil tipoToyota = toyota.getTipo();
        System.out.println("tipo toyota: " + tipoToyota.getNombre());
        System.out.println("tipo desc. toyota: " + tipoToyota.getDescripcion());
        System.out.println("tipo puerta toyota: " + tipoToyota.getNumeroPuerta());


    }
}
