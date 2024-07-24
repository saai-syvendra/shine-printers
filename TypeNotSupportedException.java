import java.lang.Exception;

class TypeNotSupportedException extends Exception {
    public TypeNotSupportedException(String e) {
        super(e);
    }
}