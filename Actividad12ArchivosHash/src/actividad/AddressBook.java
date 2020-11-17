package actividad;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class AddressBook {
    //hash de la agenda
    public HashMap<String,String> directorio = new HashMap<>();
    public String load() throws IOException {
        //variable de las llaves y valores
        StringBuilder key = new StringBuilder();
        StringBuilder value = new StringBuilder();
        boolean llenado = true;
        //crea el txt si no esta
        int aux=1;
        String result = "Se accedio correctamente a la agenda";
        File file = new File("Contactos.txt");
        if (!file.exists()){
            file.createNewFile();
            result = "Se creo una nueva agenda";
        }
        //leer el txt y pasa el contenido a la hashmap
        FileReader leer = null;
        try {
            leer = new FileReader("Contactos.txt");
            while (aux!=-1){
                aux = leer.read();
                if (aux!=-1) {
                    if ((char)aux=='\n'){
                        if (llenado) {
                            llenado = false;
                        }
                        else {
                            directorio.put(key.toString(), value.toString());
                            key.setLength(0);
                            value.setLength(0);
                            llenado = true;
                        }
                    }
                    else {
                        if (llenado)
                            key.append(((char) aux));
                        else
                            value.append(((char) aux));
                    }
                }
            }
            return result;
        } catch (IOException e) {
            return "No se pudo acceder a laa agenda";
        }finally {
            assert leer != null;
            leer.close();
        }

    }
    public void save(String llave,String valor,boolean isnew) throws IOException {
        File file = new File("Contactos.txt");
        FileWriter fileWriter = null;
        //ingresa el valor y la llave al txt
        if (isnew){
            try {
                fileWriter = new FileWriter (file.getAbsoluteFile(),true);
                for (int cont = 0; cont<llave.length();cont++){
                    fileWriter.append(llave.charAt(cont));
                    if (cont==llave.length()-1)
                        fileWriter.append("\n");
                }
                for (int cont = 0; cont<valor.length();cont++){
                    fileWriter.append(valor.charAt(cont));
                    if (cont==valor.length()-1)
                        fileWriter.append("\n");
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,"No se pudo crear el contacto");
            }finally {
                assert fileWriter != null;
                fileWriter.close();
            }
        }
        else {
            //elimina el txt
            try {
                valor = directorio.get(llave);
                fileWriter = new FileWriter (file.getAbsoluteFile(),false);
                fileWriter.write("");
                Set <String> keyset = directorio.keySet();
                Collection<String> values = directorio.values();
                ArrayList<String> llaves = new ArrayList<String>(keyset);
                ArrayList<String> valores = new ArrayList<String>(values);

                for (int cont = 0;cont<llaves.size();cont++){
                    fileWriter = new FileWriter (file.getAbsoluteFile(),true);
                    if (!llaves.get(cont).equals(llave)) {
                        for (int cont2 = 0; cont2 < llaves.get(cont).length(); cont2++) {
                            fileWriter.append(llaves.get(cont).charAt(cont2));
                            if (cont2 == llaves.get(cont).length() - 1)
                                fileWriter.append("\n");
                        }
                    }
                    if (!valores.get(cont).equals(valor)) {
                        for (int cont2 = 0; cont2 < valores.get(cont).length(); cont2++) {
                            fileWriter.append(valores.get(cont).charAt(cont2));
                            if (cont2 == valores.get(cont).length() - 1)
                                fileWriter.append("\n");
                        }
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,"No se pudo crear el contacto");
            }finally {
                assert fileWriter != null;
                fileWriter.close();
            }

        }
    }
}
