class NotificacaoView extends View {

    constructor(elemento ) {
        super(elemento );
    }

    _template(notificacao ) {
        return notificacao.texto ?
            `<p class="alert alert-info">${notificacao.texto}</p>`
            :'<p></p>';
    }
}