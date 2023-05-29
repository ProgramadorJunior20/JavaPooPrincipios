package co.com.clases;

public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {
        // Creando un objeto de la clase Automovil
        Rueda[] ruedasToy = new Rueda[10];

        Persona conductorToyota = new Persona("Andres", "Perez");
        Motor motorToyota = new Motor(5.0, TipoMotor.DIESEL);
        Automovil toyota = new Automovil("Toyota", "Picot");
        toyota.setColor(Color.AZUL);
        toyota.setMotor(motorToyota);
        toyota.setEstanque(new Estanque(50));
        toyota.setTipo(TipoAutomovil.HATCHBACK);
        toyota.setConductor(conductorToyota);
        //toyota.setRuedas(ruedasToy);
        for (int i = 0; i < ruedasToy.length; i++){
            toyota.addRueda(new Rueda("Yokohamo", 16, 7.5));
        }

        // Modificando atributo estático
        Automovil.setCapacidadEstanqueEstico(45);
        Automovil.setColorPatente(Color.ROJO);
        float consumoKlPorL = Automovil.calcularConsumoEstatico(300, 60); // gasto o consumio el 50 por ciento del estanque



        Motor motorMazda = new Motor(2.2, TipoMotor.BENCINA);
        Persona bo = new Persona("Bo", "Till");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.NEGRO, motorMazda);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setConductor(bo);
        //mazda.setRuedas(ruedasMaz);
        Rueda[] ruedasMaz = new Rueda[5];
        for(int i = 0; i < ruedasMaz.length; i++){
            mazda.addRueda(new Rueda("Michelin", 18, 10.5)); // De esta forma se maneja el arreglo de forma interna en la clase automóvil
        }


        Motor motorNissan = new Motor(3.2, TipoMotor.BENCINA);
        //Persona tri = new Persona("Tri", "Mena");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, motorNissan, new Estanque(50));
        nissan.setConductor(new Persona("Tri", "Mena"));
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.addRueda(new Rueda("Pirelly", 20, 11.5))
                .addRueda(new Rueda("Pirelly", 20, 11.5))
                .addRueda(new Rueda("Pirelly", 20, 11.5))
                .addRueda(new Rueda("Pirelly", 20, 11.5))
                .addRueda(new Rueda("Pirelly", 20, 11.5));

        Rueda[] ruedasNissan2 = new Rueda[5];
        for (int i = 0; i < ruedasNissan2.length; i++){
           ruedasNissan2[i] = new Rueda("Pirelly", 20, 11.5);
        }

        Motor motorNissan2 = new Motor(3.5, TipoMotor.BENCINA);
        Persona chela = new Persona("Chela", "Palacio");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.NARANJO, motorNissan2, new Estanque(60), chela, ruedasNissan2);
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

       /* System.out.println("Conductor Toyota: " + toyota.getConductor());
        // Iterar la clase Rueda[] con un for y mostrar por pantalla las ruedas de un automovil
        System.out.println("Ruedas Toyota: ");
        for (Rueda r: toyota.getRuedas()){
            System.out.println("Fabricante: " + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho());
        }*/


    }
}
