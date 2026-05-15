import java.util.ArrayList;
import java.util.List;

public class Grupo implements Mediator {
    private List<Usuario> membros;

    public Grupo() {
        this.membros = new ArrayList<>();
    }

    @Override
    public void enviar_mensagem_grupo(String mensagem, Usuario membro) {
        for (Usuario m : membros) {
            if (m != membro) {
                m.receber_mensagem(mensagem);
            }
        }
    }

    @Override
    public void adicionar_membro(Usuario membro) {
        membros.add(membro);
    }
}