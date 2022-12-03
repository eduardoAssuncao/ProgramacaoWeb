class AlunoController {
    constructor() {
        let $ = document.querySelector.bind(document);

        this._inputNome = $('#nome');
        this._inputNota1 = $('#nota1');
        this._inputNota2 = $('#nota2');
        this._inputFrequencia = $('#frequencia');
        this._inputNotaFinal = $('#final');

        this._aluno = new Aluno();

        this._alunoView = new AlunoView($('#js-notaAlunosView'));

        this._alunoView.update(this._aluno);

        this._notaAluno = new NotaAluno();

        
    }

    adiciona(event ) {

        event.preventDefault();

        let nota = this._criarNotaAluno();
        this._aluno.adiciona(nota );
        this._alunoView.update(this._aluno);

        this._limpaFormulario();


    }

    _criarNotaAluno() {
        return new NotaAluno(
            this._inputNome.value,
            this._inputNota1.value,
            this._inputNota2.value,
            this._inputFrequencia.value,
            this._inputNotaFinal.value
        );
    }

    _limpaFormulario() {
        this._inputNome.value = '';
        this._inputNota1.value = '';
        this._inputNota2.value = '';
        this._inputFrequencia.value = '';
        this._inputNotaFinal.value = '';

        this._inputNome.focus();
    }
}