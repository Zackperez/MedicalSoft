package medicalsoft;
import medicalsoft.Interfaz.Ventana;
import medicalsoft.Validaciones.Validar;


public class MedicalSoft {

    public static void main(String[] args) {

        Ventana v = new Ventana();
        v.setVisible(true);
        
        Medico medico1 = new Medico();
        medico1.setNombre("Zack");
        medico1.setApellido("Perez");
        medico1.setFecha_nacimiento("30/11/1999");
        medico1.setEmail("bradley3008@hotmail.com");
        medico1.setCelular("3113109661");
        
        System.out.println("Nombre y Apellidos : "+medico1.getFullName());
        System.out.println("Edad= "+medico1.getEdad());
        System.out.println("Email: "+Validar.isEmail("bradley3008@hotmail.com")+medico1.getEmail());
        System.out.println("Celular= "+Validar.isCelular("3113109661"));
        System.out.println("Telefono= "+Validar.isTelefono("0353940751"));
    }
}
