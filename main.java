public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();

        Usuario usuario1 = new UsuarioConcreto("Alice", grupo);
        Usuario usuario2 = new UsuarioConcreto("Bob", grupo);
        Usuario usuario3 = new UsuarioConcreto("Charlie", grupo);

        grupo.adicionar_membro(usuario1);
        grupo.adicionar_membro(usuario2);
        grupo.adicionar_membro(usuario3);

        usuario1.enviar_mensagem("Olá, pessoal!");
        usuario2.enviar_mensagem("Oi, Alice!");
        usuario3.enviar_mensagem("Olá, Alice e Bob!");
    }
}