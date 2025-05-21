import registroacademico.Alumno;
import registroacademico.ISearch;
import registroacademico.Maestro;
public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Juan Perez");
        alumno.setDireccion("Calle 123");
        alumno.registrar();
        alumno.modificar();

        Maestro maestro = new Maestro();
        maestro.setNombre("Maria Lopez");   
        maestro.setDireccion("Avenida 456");
        maestro.registrar();
        maestro.modificar();
        ver(alumno);
    
    }
    public static void ver(ISearch iSearch ){
        iSearch.obtenerTodos();
        iSearch.obtenerPorId(1);        
    }
}
