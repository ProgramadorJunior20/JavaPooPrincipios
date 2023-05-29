package co.com.clases;

import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        // Creando un objeto de la clase Automovil
        Motor motorToyota = new Motor(2.2, TipoMotor.BENCINA); // Creamos el objeto Motor y lo pasamos a setMotor
        Automovil toyota = new Automovil("Toyota", "Picot");
        toyota.setMotor(motorToyota);
        toyota.setEstanque(new Estanque());
        toyota.setColor(Color.NARANJO);

        Motor motorMazda = new Motor(2.2, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.NEGRO, motorMazda);
        //mazda.setEstanque(new Estanque(45));

        Date date = new Date();

        Motor motorNissan = new Motor(3.5, TipoMotor.DIESEL);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, new Estanque(50));

        Motor motorNissan2 = new Motor(4.0, TipoMotor.BENCINA);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.BLANCO, motorNissan2, new Estanque(50));

        Automovil auto = new Automovil();

        System.out.println("Son iguales? " + (nissan == nissan2));
        System.out.println("Son iguales con equals? " + (nissan.equals(nissan2)));

        System.out.println("mazda.fabricante = " + mazda.getFabricante());
        System.out.println("nissan.fabricante = " + nissan.getFabricante());
        System.out.println("nissan.capacidadEstanque = " + nissan.getEstanque().getCapacidad());
        System.out.println();
        System.out.println("date no es de tipo Automovil: " + auto.equals(date));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(toyota.verDetalle());
        System.out.println();
        System.out.println(nissan.verDetalle());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println("\n" + mazda.acelerarFrenar(2000));

        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(300, 0.6f));

        System.out.println("Kilómetros por litro " + mazda.calcularConsumo(300, 60));

        System.out.println("Kilómetros por litro " + nissan.calcularConsumo(300, 60));

        System.out.println(mazda.calcularConsumo(300, 70));

    }
}
