public class Seguidor implements Observer {

    String nombre;

    public Seguidor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String user, String tweet) {
        System.out.println(
                "'" + nombre + "'" + " notificacion recibida del usuario: '" + user + "', Tweet: " + tweet);
    }
}
