
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Empresa;


public class SingletonEmpresa {

    private static final SingletonEmpresa INSTANCIA = new SingletonEmpresa();
    
    private ArrayList<Empresa> empresas;

    private SingletonEmpresa() {
        empresas = leerEmpresa();
    }

    public static SingletonEmpresa getINSTANCIA() {
        return INSTANCIA;
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }
    
        public void escribirEmpresa() {
        try {
            FileOutputStream archivo
                   = new FileOutputStream("empresas.dat");
            ObjectOutputStream escritor
                   = new ObjectOutputStream(archivo);
            escritor.writeObject(empresas);
        } catch (IOException ex) {
//           ex.printStackTrace();
        }
    }
    
    public ArrayList<Empresa> leerEmpresa() {
        try {
            FileInputStream archivo
                    = new FileInputStream("empresas.dat");
            ObjectInputStream lector
                    = new ObjectInputStream(archivo);
            return (ArrayList<Empresa>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
//            ex.printStackTrace();
            return new ArrayList<>();
        }
    }
}
