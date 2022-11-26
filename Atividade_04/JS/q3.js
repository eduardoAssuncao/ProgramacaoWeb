const form = document.querySelector(".form");
let p = document.createElement("p");

let text;

function Convert(){
    text = form.querySelector("#date").value;

    let splits = text.split('-', '3');
    let convertValor = splits[1];
    parseInt(convertValor);

    switch (convertValor){
        case '01':
            p.innerHTML = splits[2] + ' de janeiro de ' + splits[0];
            document. getElementById('info-date').appendChild(p);
        break;

        case '02':
            p.innerHTML = splits[2] + ' de fevereiro de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;

        case '03':
            p.innerHTML = splits[2] + ' de março de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;

        case '04':
            p.innerHTML = splits[2] + ' de abril de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;

        case '05':
            p.innerHTML = splits[2] + ' de maio de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;

        case '06':
            p.innerHTML = splits[2] + ' de junho de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;  
        
        case '07':
            p.innerHTML = splits[2] + ' de julho de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;

        case '08':
            p.innerHTML = splits[2] + ' de agosto de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;

        case '09':
            p.innerHTML = splits[2] + ' de setembro de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;

        case '10':
            p.innerHTML = splits[2] + ' de outubro de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;

        case '11':
            p.innerHTML = splits[2] + ' de novembro de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;

        case '12':
            p.innerHTML = splits[2] + ' de dezembro de ' + splits[0];
            document.getElementById('info-date').appendChild(p);
        break;
    }
}
