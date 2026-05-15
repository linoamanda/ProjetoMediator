public abstract class Usuario {
    protected String nome;
    protected Mediator mediator;

    public Usuario(String nome, Mediator mediator) {
        this.nome = nome;
        this.mediator = mediator;
    }

    public String getNome() {
        return nome;
    }

    public void enviar_mensagem(String mensagem) {
        mediator.enviar_mensagem_grupo(mensagem, this);
    }

    public abstract void receber_mensagem(String mensagem, String remetente);
}

public class UsuarioConcreto extends Usuario {
    public UsuarioConcreto(String nome, Mediator mediator) {
        super(nome, mediator);
    }

    @Override
    public void receber_mensagem(String mensagem, String remetente) {
        System.out.println("[" + nome + "] recebeu mensagem de [" + remetente + "]: " + mensagem);
    }
    @Override
    public void enviar_mensagem(String mensagem) {
        System.out.println("[" + nome + "] enviou mensagem: " + mensagem);
        super.enviar_mensagem(mensagem);
    }
}