class NotaAluno {

    constructor(nome, nota1, nota2, frequencia, provaFinal) {
        this._nome = nome;
        this._nota1 = nota1;
        this._nota2 = nota2;
        this._frequencia = frequencia;
        this._provaFinal = provaFinal;

        //Object.freeze(this );
    }

    getMedia() {
        parseInt(this._nota1, this._nota2, this._provaFinal);
        let mediaParcial = ((this.nota1 + this._nota2)/2);
        if(mediaParcial >= 70){
            return (this._nota1 + this._nota2)/2;
        }
        else{
            return (this._nota1 + this._nota2 + this._provaFinal)/3;
        }
    }

    get nome() {
        return this._nome;
    }

    get nota1() {
        return thihs._nota1;
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
}