package excepciones;


public class YaRegistradoException extends RuntimeException{

    public YaRegistradoException() {
        super("¡Ya se encuentra registrada la cedula!");
    }
    
}
