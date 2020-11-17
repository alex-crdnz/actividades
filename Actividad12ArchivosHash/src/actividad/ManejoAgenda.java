package actividad;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class ManejoAgenda {
    //metodo para mostrar la agenda
    public String list(HashMap<String,String> hashMap) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String llave = entry.getKey();
            String valor = entry.getValue();
            result.append("Numero: ").append(llave).append("   Nombre: ").append(valor).append("\n");
        }
        return result.toString();
    }
    //metodo para crear contacto
    public String create(String numero,String nombre) throws IOException {
        AddressBook addressBook = new AddressBook();
        addressBook.save(numero,nombre,true);
        return "Se creo correctamente el contacto "+nombre;
    }
    //metodo para borrar contacto
    public String delete(String contacto,HashMap<String,String> hashMap) throws IOException {
        AddressBook addressBook = new AddressBook();
        addressBook.save(contacto,null,false);
        return "Se elimino correctamente el contacto "+contacto;
    }
}
