package medicalsoft;

public class MedicalSoft {

    public static void main(String[] args) {
        
        /*Medico primerMedico = new Medico("Zack","Perez");
        System.out.println(primerMedico.getNombre());
        System.out.println(primerMedico.getApellido);*/
        
        Medico medico1 = new Medico();
        medico1.setNombre("Zack");
        medico1.setApellido("Perez");
        medico1.setFecha_nacimiento("30/11/1999");
        
        System.out.println("El medico "+medico1.getFullName()+" y su edad es: "+medico1.getEdad()+"");
    }

}
