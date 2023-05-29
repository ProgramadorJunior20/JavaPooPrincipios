package co.com.clases;

import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {
        // Creando un objeto de la clase Automovil
        Persona conductorSubaru = new Persona("Luci","Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.NEGRO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato", "Mendez");
        Automovil mazda = new Automovil("Mazda", "BT-5", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);

        Persona bo = new Persona("Bo", "Till");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bo);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo", "Murillo");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.DIESEL), new Estanque(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jeff", "Palacio"));

        //Ahora vamos a instaciar un arreglo con los autos de la clase Automovil
        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos); // La clase Arrays y su método sort se utilizan para ordenar por medio de un contrato o interfaz.

        /*for (int i = 0; i < autos.length; i++){
            System.out.println(autos[i]);
        }*/

        for (Automovil auto: autos){
            System.out.println(auto);
        }


    }
}
