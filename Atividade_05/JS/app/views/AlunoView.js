class AlunoView extends View {

    constructor(elemento) {
        super(elemento );
    }

    _template(aluno ) {
        return `
        <table class="table table-hover table-borderend">
            <thread>
                <tr>
                    <TH>NOME</TH>
                    <TH>NOTA 01</TH>
                    <TH>NOTA 02</TH>
                    <TH>FREQUÊNCIA</TH>
                    <TH>NOTA FINAL</TH>
                    <TH>MÉDIA FINAL</TH>
                    <TH>SITUAÇÃO</TH>
                </tr>
            </thread>

            <tbody>
                ${aluno.getNotas().map(nota => `

                    <tr>
                        <td>$${nota.nome}</td>
                        <td>$${nota.nota1}</td>
                        <td>$${nota.nota2}</td>
                        <td>$${nota.nome}</td>
                        <td>$${nota.nome}</td>
                        <td>$${nota.nome}</td>
                        <td>$${nota.nome}</td>
                    </tr>

                `)}
        `;
    }
}