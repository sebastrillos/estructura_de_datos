import java.time.LocalDateTime;
import java.net.URL;
import java.net.MalformedURLException;

public class Pagina {
    private String nombre;
    private URL url;
    private LocalDateTime fechaHora;

    public Pagina(String nombre, String urlTexto)  throws MalformedURLException{
        this.setNombre(nombre);
        this.url = new URL(urlTexto);
        this.fechaHora = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
