public class Circle extends Shape implements Perimetravel {
    // ... (código existente)

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

public class Square extends Shape implements Perimetravel {
    // ... (código existente)

    @Override
    double calcularPerimetro() {
        return 4 * lado;
    }
}
