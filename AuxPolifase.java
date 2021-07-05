import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class AuxPolifase {
    public static void crearArchivos(List<ArrayList<Integer>> datos){
        PrintWriter fileOut;
        int n = 4;
        List<Integer> lista2 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            lista2.add(datos.get(0).get(i));
        }
        System.out.println(lista2);
        datos.get(0).removeAll(lista2);
        System.out.println(datos);
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++){
            str.append(Integer.toString(lista2.get(i)));
            if(i==n-1){
                break;
            }
            str.append(",");
        }

        System.out.println(str);
        try {
            fileOut = new PrintWriter("F1.txt");
            fileOut.println(str);
            fileOut.close();
        } catch (Exception e) {
            //TODO: handle exception
        }


        lista2 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            lista2.add(datos.get(0).get(i));
        }
        System.out.println(lista2);
        datos.get(0).removeAll(lista2);
        System.out.println(datos);
        str = new StringBuilder();
        for(int i=0;i<n;i++){
            str.append(Integer.toString(lista2.get(i)));
            if(i==n-1){
                break;
            }
            str.append(",");
        }

        System.out.println(str);
        try {
            fileOut = new PrintWriter("F2.txt");
            fileOut.println(str);
            fileOut.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public static void ConcatenarAuxiliares(List<ArrayList<Integer>> datos){
        PrintWriter fileOut;

        FileReader fr;  //métodos de lectura
        BufferedReader br;

        int n;
        while(!datos.get(0).isEmpty()){
            StringBuilder str = new StringBuilder();
            File F1 = new File("F1.txt");
            if(F1.exists()){
                try {
                    fr = new FileReader(F1);
                    br = new BufferedReader(fr);

                    String linea;
                    linea = br.readLine();
                    str.append(linea);
                    str.append(",");

                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
            List<Integer> lista2 = new ArrayList<Integer>();
            if(datos.get(0).size()>=4){
                n = 4;
            }
            else{
                n = datos.get(0).size();
            }
            for(int i=0;i<n;i++){
                lista2.add(datos.get(0).get(i));
            }
            System.out.println(lista2);
            datos.get(0).removeAll(lista2);
            System.out.println(datos);
            for(int i=0;i<n;i++){
                str.append(Integer.toString(lista2.get(i)));
                if(i==n-1){
                    break;
                }
                str.append(",");
            }
            System.out.println(str);
            if(F1.exists()){
                try {
                    fileOut = new PrintWriter(F1);
                    fileOut.println(str);
                    fileOut.close();

                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
            str = new StringBuilder();
            File F2 = new File("F2.txt");
            if(F2.exists()){
                try {
                    fr = new FileReader(F2);
                    br = new BufferedReader(fr);

                    String linea;
                    linea = br.readLine();
                    str.append(linea);
                    str.append(",");

                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
            lista2 = new ArrayList<Integer>();
            if(datos.get(0).size()>=4){
                n = 4;
            }
            else{
                n = datos.get(0).size();
            }
            for(int i=0;i<n;i++){
                lista2.add(datos.get(0).get(i));
            }
            System.out.println(lista2);
            datos.get(0).removeAll(lista2);
            System.out.println(datos);
            for(int i=0;i<n;i++){
                str.append(Integer.toString(lista2.get(i)));
                if(i==n-1){
                    break;
                }
                str.append(",");
            }
            System.out.println(str);
            if(F2.exists()){
                try {
                    fileOut = new PrintWriter(F2);
                    fileOut.println(str);
                    fileOut.close();

                } catch (Exception e) {
                    //TODO: handle exception
                }
            }
        }
    }
}
