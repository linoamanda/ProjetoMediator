interface Mediator{
    void enviar_mensagem_grupo(String mensagem, Usuario membro);
    void adicionar_membro(Usuario membro);
}