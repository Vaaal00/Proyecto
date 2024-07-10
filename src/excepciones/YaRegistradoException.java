package excepciones;


public class YaRegistradoException extends Exception{

    public YaRegistradoException() {
        super("¡Ya se encuentra registrada la cedula!");
    }
    
}
