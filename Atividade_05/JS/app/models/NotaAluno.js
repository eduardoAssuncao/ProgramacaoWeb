class NotaAluno {

    constructor(nome, nota1, nota2, frequencia, provaFinal, media, situacao) {
        this._nome = nome;
        this._nota1 = parseInt(nota1);
        this._nota2 = parseInt(nota2);
        this._frequencia = frequencia;
        this._provaFinal = parseInt(provaFinal);
        this._media = media;
        this._situacao = situacao;

        //Object.freeze(this );
    }

    get nome() {
        return this._nome;
    }

    get nota1() {
        return this._nota1;
    }

    get nota2() {
        return this._nota2;
    }

    get frequencia() {
        return this._frequencia;
    }

    get provaFinal() {
        return this._provaFinal;
    }

    get media() {
        this._media = ((this.nota1 + this._nota2)/2);
        if(this._media >= 70){
            return this._media;
        }
        else{
            this._media = (this._media + this._provaFinal)/2;
            return this._media;
        }
    }

    get situacao() {
        if(this._media >= 70 && this._frequencia >= 75){
            return 'Aprovado';
        }else{
            return 'Reprovado';
        }
    }
}