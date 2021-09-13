package Casinos;

public interface ImpotsFonciers {

    public double payerImpots();

    public default double evaluationMunicipale() {
        return 1;

    }

}
