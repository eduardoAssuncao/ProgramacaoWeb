class NotaAluno {

    constructor(nome, nota1, nota2, frequencia, provaFinal, media, situacao) {
        this._nome = nome;
        this._nota1 = nota1;
        this._nota2 = nota2;
        this._frequencia = frequencia;
        this._provaFinal = provaFinal;
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
        parseInt(this._nota1, this._nota2, this._provaFinal);
        let mediaParcial = ((this.nota1 + this._nota2)/2);
        if(mediaParcial >= 70){
            this._media = (this._nota1 + this._nota2)/2;
            return this._media;
        }
        else{
            this._media = (this._nota1 + this._nota2 + this._provaFinal)/3;
            return this._media;
        }
    }

    get situacao() {
        if(this._media >= 70){
            return 'Aprovado';
        }else{
            return 'Reprovado';
        }
    }
}