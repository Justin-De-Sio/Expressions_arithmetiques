public class NoeudInterne extends Expression {

    private Expression premierOperande, deuxiemOperande;
    private char operateurBinaire;

    public NoeudInterne(Expression premierOperande, Expression deuxiemOperande, char operateurBinaire) {
        this.premierOperande = premierOperande;
        this.deuxiemOperande = deuxiemOperande;
        this.operateurBinaire = operateurBinaire;
    }

    @Override
    public double calculerValeur() {
        if (operateurBinaire == '+') {
            return premierOperande.calculerValeur() + deuxiemOperande.calculerValeur();
        } else if (operateurBinaire == '-') {
            return premierOperande.calculerValeur() - deuxiemOperande.calculerValeur();
        } else if (operateurBinaire == '*') {
            return premierOperande.calculerValeur() * deuxiemOperande.calculerValeur();
        } else if (operateurBinaire == '/') {
            return premierOperande.calculerValeur() / deuxiemOperande.calculerValeur();
        } else if (operateurBinaire == '%') {
            return premierOperande.calculerValeur() % deuxiemOperande.calculerValeur();
        }

        return 0;
    }
}
