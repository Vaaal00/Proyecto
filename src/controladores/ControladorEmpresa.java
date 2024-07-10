
package controladores;

import excepciones.EmpresaEx;
import java.util.ArrayList;
import modelo.Empresa;
import singleton.SingletonEmpresa;


public class ControladorEmpresa {

    private ArrayList<Empresa> empresas;

    public ControladorEmpresa() {
        empresas = SingletonEmpresa.getINSTANCIA().getEmpresas();             
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }
    
    public Empresa buscarEmpresa(int nit) {
        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).getNit()== nit) {
                return empresas.get(i);
            }
        }
        return null;
    }
    
    public void agregarEmpresa(Empresa empresa) 
            throws EmpresaEx {                   
        Empresa aux = buscarEmpresa(empresa.getNit());
        if (aux == null) {
            empresas.add(empresa);
            SingletonEmpresa.getINSTANCIA().escribirEmpresa();
        }else{
            throw new EmpresaEx();
        }
    }
    
    public boolean editarEmpresa (Empresa empresa) {
        Empresa aux = buscarEmpresa(empresa.getNit());
        if (aux != null) {
            aux.setDireccion(empresa.getDireccion());
            aux.setEmail(empresa.getEmail());
            aux.setNombre(empresa.getNombre());
            aux.setTelefono(empresa.getTelefono());
            SingletonEmpresa.getINSTANCIA().escribirEmpresa();
            return true;
        }
        return false;
    }
    
    public boolean eliminarEmpresa(int nit) {
        for (int i = 0; i < empresas.size(); i++) {
            if (empresas.get(i).getNit()== nit) {
                empresas.remove(i);
                SingletonEmpresa.getINSTANCIA().escribirEmpresa();
                return true;
            }
        }
        return false;
    }
    
}
