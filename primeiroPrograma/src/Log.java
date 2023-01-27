
public class Log {

    public void debug ( String message ){
        print ( "DEBUG", message);
    }

    public void info ( String message){
        print ( "INFO", message );
    }

    public void warning ( String message){
        print ( "WARNING", message );
    }

    public void error ( String message ){
        print ( "ERROR", message );
    }

    public void fatal ( String message ){
        print ("FATAL", message);
        System.exit( 0 );
    }

    private void print (String message, String severity ){
        System.out.println(severity + ": " + message);
    }

    
}