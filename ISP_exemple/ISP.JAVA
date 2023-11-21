public interface Impressora {
    void imprimir();
}

public class ImpressoraLaser implements Impressora {
    @Override
    public void imprimir() {
        // Lógica para imprimir usando impressora a laser
        System.out.println("Imprimindo usando impressora a laser");
    }
}


