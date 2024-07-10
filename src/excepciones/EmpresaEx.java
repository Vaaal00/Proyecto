
package excepciones;


public class EmpresaEx extends Exception {

    public EmpresaEx() {
        super("La empresa ya se encuentra registrada");
    }

}
