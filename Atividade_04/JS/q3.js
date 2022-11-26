const form = document.querySelector(".form");
let p = document.createElement("p");

let text;
let symb = '/';

function Convert(){
    text = form.querySelector("#date").value;

    let splits = text.split('/', '3');
    let convertValor = splits[1];
    parseInt(convertValor);

    switch (convertValor){
        case '01':
            p.innerHTML = splits[0] + ' de janeiro de ' + splits[2];
            document. getElementById('info-date').appendChild(p);
        break;

        case '02':
            p.innerHTML = splits[0] + ' de fevereiro de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;

        case '03':
            p.innerHTML = splits[0] + ' de março de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;

        case '04':
            p.innerHTML = splits[0] + ' de abril de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;

        case '05':
            p.innerHTML = splits[0] + ' de maio de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;

        case '06':
            p.innerHTML = splits[0] + ' de junho de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;  
        
        case '07':
            p.innerHTML = splits[0] + ' de julho de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;

        case '08':
            p.innerHTML = splits[0] + ' de agosto de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;

        case '09':
            p.innerHTML = splits[0] + ' de setembro de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;

        case '10':
            p.innerHTML = splits[0] + ' de outubro de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;

        case '11':
            p.innerHTML = splits[0] + ' de novembro de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;

        case '12':
            p.innerHTML = splits[0] + ' de dezembro de ' + splits[2];
            document.getElementById('info-date').appendChild(p);
        break;
    }
    //alert(splits[0]);
}
