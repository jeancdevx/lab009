
public class TwitterDemo {

    public static void main(String[] args) {
        FiguraPolitica pCastillo = new FiguraPolitica("Pedro Castillo", "@pCastillo");
        FiguraPolitica kFujimori = new FiguraPolitica("Keiko Fujimori", "@kFujimori");

        Seguidor juan = new Seguidor("Juan");
        Seguidor victor = new Seguidor("Victor");
        Seguidor raquel = new Seguidor("Raquel");
        Seguidor miguel = new Seguidor("Miguel");
        Seguidor katy = new Seguidor("Katy");

        pCastillo.addSubscriber(juan);
        pCastillo.addSubscriber(victor);
        pCastillo.addSubscriber(raquel);
        pCastillo.addSubscriber(miguel);
        pCastillo.addSubscriber(katy);

        kFujimori.addSubscriber(juan);
        kFujimori.addSubscriber(victor);
        kFujimori.addSubscriber(raquel);
        kFujimori.addSubscriber(miguel);
        kFujimori.addSubscriber(katy);

        pCastillo.tweet("Hola amigos!");
        kFujimori.tweet("Soy inocente!");

        pCastillo.removeSubscriber(raquel);

        pCastillo.tweet("Permanzcan en casa, seguros!");

        kFujimori.removeSubscriber(juan);

        kFujimori.tweet("Fraude en las elecciones!");
    }
}
