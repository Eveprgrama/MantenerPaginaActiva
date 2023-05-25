
package com.proyecto.activarpagina.entity;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jsoup.Jsoup;


public class KeepWebsiteActive {
            public static void main(String[] args) {
        String url = "https://frontendevelynp.web.app/index";

        while (true) {
            try {
                // Realiza una solicitud GET a la página web
                Jsoup.connect(url).get();

                // Imprime un mensaje para indicar que la solicitud se realizó correctamente
                System.out.println("Solicitud GET realizada a " + url);

                // Espera un tiempo determinado (5 minutos) para que la página cargue adecuadamente
                System.out.println("Esperando 5 minutos para que la página cargue...");
                TimeUnit.MINUTES.sleep(5);

                // Espera un tiempo adicional (2 minutos) antes de realizar la próxima solicitud
                System.out.println("Esperando 2 minutos adicionales antes de la próxima solicitud...");
                TimeUnit.MINUTES.sleep(2);
            } catch (IOException e) {
                System.err.println("Error al realizar la solicitud GET a " + url);
            } catch (InterruptedException e) {
                System.err.println("Error en la espera entre solicitudes");
            }
        }
    }
}
