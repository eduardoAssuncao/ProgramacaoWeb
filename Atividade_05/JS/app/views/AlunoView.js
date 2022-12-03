class AlunoView extends View {

    constructor(elemento) {
        super(elemento );
    }

    _template(aluno ) {
        return `
        <table class="table table-hover table-borderend text-white">
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
                        <td>${nota.nome}</td>
                        <td>${nota.nota1}</td>
                        <td>${nota.nota2}</td>
                        <td>${nota.frequencia}%</td>
                        <td>${nota.provaFinal}</td>
                        <td>${nota.media}</td>
                        <td>${nota.situacao}</td>
                    </tr>

                `).join('')}
            </tbody>

            <tfoot>
                <tr>    
                    <td colspan="3">Total Aprovados</td>
                    <td>${(aluno.getNotas().reduce((total, nota) =>
                        total + nota.aprovados, 0.0))}</td>    
                </tr>
                <tr>
                    <td colspan="3">Total Reprovados</td>
                    <td>${(aluno.getNotas().reduce((total, nota) =>
                        total + nota.reprovados, 0.0))}</td>
                </tr>

            </tfoot>
        
        </table>
        `;
    }
}