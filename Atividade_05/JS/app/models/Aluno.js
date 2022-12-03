class Aluno{
    constructor() {
        this._notas = [];
    }

    adiciona (nota ) {
        this._notas.push(nota );
    }

    getNotas() {
        return [].concat(this._notas );
    }
}
