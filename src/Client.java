public class Client {
    public static void main(String[] args) {
        Nombre nombre = new Nombre(5);
        Nombre nombre1 = new  Nombre(2);

        NoeudInterne noeudInterne = new NoeudInterne(nombre,nombre1 , '+');
        NoeudInterne noeudInterne1 = new NoeudInterne(noeudInterne,nombre1,'*');

        System.out.println(noeudInterne1.calculerValeur());
    }
}
