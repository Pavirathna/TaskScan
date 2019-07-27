package model2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeSchedular {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<3;i++) {
            Thread.sleep ( 10000 );
            DateFormat df = new SimpleDateFormat ( "dd/MM/yy HH:mm:ss" );
            Date dateobj = new Date ();
            System.out.println ( df.format ( dateobj ) );
        }
    }
}
