package datos;

import entidades.Persona;
import java.util.*;

public class PersonaDatos {
    public List<Persona> listaPersonas = new ArrayList<Persona>();
    public int id = 0;

    public PersonaDatos() {
    }

    public void create(Persona d) {
        try {
            id = id + 1;
            d.setId(id);
            System.out.println("ID:" + id);
            listaPersonas.add(d);
            System.out.println("Elemento: "+listaPersonas.get(0).getId());
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void delete(int id){
        try {
            for (Persona d : listaPersonas) {
                if (id == d.getId()) {
                    listaPersonas.remove(d);
                    System.out.println("Eliminado");
                }
            }
        }catch (Exception e){
            System.out.printf("ERROR"+e.getMessage());
        }
    }
   /* public void Actualizar(String name, String sexo, String ap_mom, String ap_dad, String fecha,String correo,String direccion, int dni) {
        for (Persona d : listaPersonas) {
            if (id == d.getId()) {
                System.out.println("La ID se actualizo correctamente");
            }else{
                System.out.println("¡Error en la actualización!");
            }
        }
    }*/

    public void deleete(int id) {
        int indice = 0;
        indice = listaPersonas.lastIndexOf(id);
        if (indice == this.id) {
            listaPersonas.remove(indice);
            System.out.println("ID eliminado: " + indice);
        } else {
            System.out.println("La ID no existe " + indice);
        }
    }

    public void ActualizarP(Persona p) {
        int indice = listaPersonas.indexOf(p)+1;
        System.out.println("Elemento: "+p.getId());
        System.out.println("Valor"+indice);
        if (indice >= 0)  {
            listaPersonas.set(indice,p);
            System.out.println("ID Actualizado: "+indice);
        } else {
            System.out.println("La ID no existe: "+indice);
        }
    }

   /*private  int edad;

     public void edadP (){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el año de su nacimiento");
        int annoy = teclado.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = teclado.nextInt();
        System.out.println("Ingrese el dia de su nacimiento");
        int dia = teclado.nextInt();

        Calendar FechaN = new GregorianCalendar(annoy, mes , dia);
        Calendar fechaHoy = Calendar.getInstance();

        int anoNac = FechaN.get(Calendar.YEAR);
        int anoHoy = fechaHoy.get(Calendar.YEAR);
        edad = anoHoy - anoNac;

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }*/
}


