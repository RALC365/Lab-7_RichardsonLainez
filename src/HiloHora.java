
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class HiloHora implements Runnable {
    int segundos;
    boolean avanza;
    public HiloHora(int segundos) {
        this.segundos = segundos;
    }        

    @Override
    public void run() {
        avanza = false;
        while(true){
            Date h;
            DateFormat f;
            do {
            h=new Date();
            f=new SimpleDateFormat("s");
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                
            }
            } while (h.getSeconds() == segundos);
            avanza = true;
            
        }        
    }
    
}
