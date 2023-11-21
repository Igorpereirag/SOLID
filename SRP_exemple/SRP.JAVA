// Exemplo sem SRP
public class Pedido {
    private Produto produto;
    private Cliente cliente;

    public void processarPedido() {
        // Lógica para processar o pedido, incluindo cálculos, validações, etc.
    }

    public void enviarEmailConfirmacao() {
        // Lógica para enviar e-mail de confirmação do pedido.
    }
}

// Exemplo com SRP
public class Pedido {
    private Produto produto;
    private Cliente cliente;

    public void processarPedido() {
        // Lógica para processar o pedido, incluindo cálculos, validações, etc.
    }
}

public class NotificadorEmail {
    public void enviarEmailConfirmacao() {
        // Lógica para enviar e-mail de confirmação do pedido.
    }
}
