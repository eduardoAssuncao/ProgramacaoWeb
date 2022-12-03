class AlunoController {
    constructor() {
        let $ = document.querySelector.bind(document);

        this._inputNome = $('#nome');
        this._inputNota1 = $('#nota1');
        this._inputNota2 = $('#nota2');
        this._inputFrequencia = $('#frequencia');
        this._inputNotaFinal = $('#final');

        this._aluno = new Aluno();

        this._alunoView
    }
}