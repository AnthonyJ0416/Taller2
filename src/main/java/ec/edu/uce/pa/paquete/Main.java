package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private VideoService videoService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("\nINICIANDO PLATAFORMA DE STREAMING \n");

        Video video = new Video(
            "Tutorial Quaerkus Interceptores",
            "AnthonyJTutoriales",
            60,
            "anthonyjoseph0416@gmail.com"
        );
        video.setResolucion("480p 240fps");

        this.videoService.publicar(video, "Programacion");

        return 0;
    }
}