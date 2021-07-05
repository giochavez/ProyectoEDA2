import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AcercamientoPolifase {
    public static void main(String[] args) throws Exception {
        File F0 = new File("F0.txt");
        if(!F0.exists()){
            try {
                F0.createNewFile();
                System.out.println("El archivo " + F0.getName() + " ha sido creado");
            } catch (Exception e) {
                System.err.println("Ya existe el archivo");
            }
        }


        FileReader fr;  //métodos de lectura
        BufferedReader br;

        List<ArrayList<Integer>> datos = new ArrayList<ArrayList<Integer>>();

        try {
            fr = new FileReader(F0);
            br = new BufferedReader(fr);

            String linea;
            while((linea = br.readLine()) != null){
                String [] datosDeLinea = linea.split(",");
                ArrayList<String> datosAuxiliar = new ArrayList<String>();
                ArrayList<Integer> listita = new ArrayList<Integer>();
                for(String dato : datosDeLinea){
                    datosAuxiliar.add(dato);
                }
                for(String num : datosAuxiliar){    //transformar strings a enteros
                    listita.add(Integer.valueOf(num));
                }
                datos.add(listita);
            }
            System.out.println(datos);
        } catch (Exception e) {
            //TODO: handle exception
        }
        AuxPolifase.crearArchivos(datos);
        AuxPolifase.ConcatenarAuxiliares(datos);
    }
}
