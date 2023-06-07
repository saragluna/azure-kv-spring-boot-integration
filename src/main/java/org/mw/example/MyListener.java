package org.mw.example;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 *
 */
public class MyListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        if (System.getenv("MSI_ENDPOINT") == null) {
            System.out.println("Not in the managed identity env");
        } else {
            System.out.println("In the managed identity env");
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
//        URL obj = null;
//        try {
//            obj = new URL("http://169.254.130.6:8081/msi/token?resource=https%3A%2F%2Fvault.azure.net&api-version=2019-08-01");
//            int i = 0;
//            while (i++ < 5) {
//                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//                con.setRequestMethod("GET");
//                int responseCode = con.getResponseCode();
//                System.out.println("GET Response Code :: " + responseCode);
//            }
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        } catch (ProtocolException e) {
//            throw new RuntimeException(e);
//        } catch (ConnectException e) {
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
