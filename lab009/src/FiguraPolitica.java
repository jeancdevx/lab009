
import java.util.ArrayList;
import java.util.List;

public class FiguraPolitica implements Subject {

    List<Observer> followers;
    String nombre;
    String usuario;

    public FiguraPolitica(String nombre, String usuario) {
        this.followers = new ArrayList<>();
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void tweet(String tweet) {
        System.out.println("Nombre " + nombre + ", Tweet: " + tweet);

        notifySubscribers(tweet);

        System.out.println("");
    }

    @Override
    public void addSubscriber(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        followers.remove(observer);
    }

    @Override
    public void notifySubscribers(String tweet) {
        for (Observer follower : followers) {
            follower.update(usuario, tweet);
        }
    }
}
