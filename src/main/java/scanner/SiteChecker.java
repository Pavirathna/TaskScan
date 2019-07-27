package scanner;
import java.net.URL;
import java.net.URLConnection;

public class SiteChecker extends TimeScheduler {

        public static void main(String[] args) throws InterruptedException {
           // Scanner sc = new Scanner ( System.in );
            timeSchedule ();
           sitecheck ();
        }
            public static void sitecheck()
            {
                try {
                    // System.out.println ("eg:http://google.com\n Enter:" );
                    //String site=sc.next ();
                    //  URL obj = new URL(site);
                    URL obj = new URL ( "http://tamilrockers.co.com/" );

                    URLConnection conn = obj.openConnection ();
                    System.out.println ( "\nGet Response Header By Key ...\n" );
                    String server = conn.getHeaderField ( "Server" );
                    if (server == null) {
                        System.out.println ( "Key 'Server' is not found!" );
                        SendMail sm = new SendMail ();
                        sm.sendMail ();

                    } else {
                        System.out.println ( "Server - " + server );
                    }

                    System.out.println ( "\n Done" );

                } catch (Exception e) {
                    e.printStackTrace ();
                }
            }

        }


