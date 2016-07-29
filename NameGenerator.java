
/**
 * Se trata de generar el nombre que uno mismo tendría utilizando el sistema que se utilizó en la película:
 * La Guerra de las Galaxias
 */
public class NameGenerator
{
    //las dos primeras constantes son para el nombre en la película.
    //public static final String APELLIDO_REAL3 = "Aller";
    //public static final String NOMBRE_REAL3 = "Francisco";
    //las dos siguientes para el 1º apellido en la película.
    //public static final String APELLIDO_MAMA2 = "Gonzalez";
    //public static final String CIUDAD_NACI3 = "Leon";

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
    }
    
    /**
     * MUESTRA EL NOMBRE QUE TENDRÍAS EN LA PELÍCULA: LA GUERRA DE LAS GALAXIAS.
     * INTRODUZCA LOS DATOS QUE SE LE SOLICITAN.
     */
    public String generateStarWarsName(String suApellido, String suNombre, String apellidoSuMama,  
                                                    String ciudadDeNacimiento){  
        final String APELLIDO_REAL3 = suApellido;
        final String NOMBRE_REAL3 = suNombre;   
        final String APELLIDO_MAMA2 = apellidoSuMama;
        final String CIUDAD_NACI3 = ciudadDeNacimiento;
        
        final int CLAVE_A = 0;
        final int CLAVE_B = 2;
        final int CLAVE_C = 3;
        
        String namePeli = APELLIDO_REAL3.substring(CLAVE_A, CLAVE_C)+NOMBRE_REAL3.substring(CLAVE_A, CLAVE_C)+
                           "  " +APELLIDO_MAMA2.substring(CLAVE_A, CLAVE_B)+CIUDAD_NACI3.substring(CLAVE_A, CLAVE_C);
                             
        System.out.println("---- TU NOMBRE EN LA PELÍCULA DE LA GUERRA DE LAS GALAXIAS, SERÍA: --- \n" +
                          APELLIDO_REAL3.substring(CLAVE_A, CLAVE_C)+NOMBRE_REAL3.substring(CLAVE_A, CLAVE_C)+
                          "  " +APELLIDO_MAMA2.substring(CLAVE_A, CLAVE_B)+CIUDAD_NACI3.substring(CLAVE_A, CLAVE_C));
        return namePeli;
    }
}













