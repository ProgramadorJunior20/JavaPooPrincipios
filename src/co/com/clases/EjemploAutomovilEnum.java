package co.com.clases;

public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        // Creando un objeto de la clase Automovil
        Motor motorSubaru = new Motor(2.2, TipoMotor.BENCINA);
        Automovil subaru = new Automovil("subaru", "Impreza");
        subaru.setColor(Color.NEGRO);
        subaru.setMotor(motorSubaru);
        //subaru.setMotor(new Motor(2.2, TipoMotor.BENCINA)); // de esta forma támbien se puede instaciar un objeto
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Motor motorMazda = new Motor(2.0, TipoMotor.DIESEL);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.NEGRO, motorMazda);
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        // Creando una variable del tipo de la clase enum TipoAutomovil
        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo Automovil: " + tipo.getNombre());
        System.out.println("tipo desc. Automovil: " + tipo.getDescripcion());

        tipo = mazda.getTipo();

        switch (tipo) {
            case CONVERTIBLE:
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
                break;
            case PICKUP:
                System.out.println("El automovil es de doble cabina o camioneta");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y típicamente deportivo");
                break;
            case HATCHBACK:
                System.out.println("Es un automivil mediano compacto, con aspecto deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte, de empresas");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un Automovil mas grande, con maleta grande...");
        }

        // Iterando enumeradores
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta: tipos){
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }


    }
}
