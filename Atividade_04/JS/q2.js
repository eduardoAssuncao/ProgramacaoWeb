const form = document.querySelector('.form');

function GenerateTable() {

    let valuer1;
    let valuer2;
    let mult;
    let div;
    let sum;
    let mod;

    valuer1 = form.querySelector("#valor1").value;
    valuer2 = form.querySelector("#valor2").value;
    
    sum = parseInt(valuer1) + parseInt(valuer2);
    mult = valuer1 * valuer2;
    div = valuer1 / valuer2;
    mod = valuer1 % valuer2;
    //Build an array containing Customer records.
    var customers = new Array();
    customers.push(["Valuer 01", "Operation", "Valuer 02", "Result"]);
    customers.push([valuer1, "+", valuer2, sum]);
    customers.push([valuer1, "*", valuer2, mult]);
    customers.push([valuer1, "/", valuer2, div]);
    customers.push([valuer1, "%", valuer2, mod]);

    //Create a HTML Table element.
    var table = document.createElement("TABLE");
    table.border = "1";

    //Get the count of columns.
    var columnCount = customers[0].length;

    //Add the header row.
    var row = table.insertRow(-1);
    for (var i = 0; i < columnCount; i++) {
        var headerCell = document.createElement("TH");
        headerCell.innerHTML = customers[0][i];
        row.appendChild(headerCell);
    }

    //Add the data rows.
    for (var i = 1; i < customers.length; i++) {
        row = table.insertRow(-1);
        for (var j = 0; j < columnCount; j++) {
            var cell = row.insertCell(-1);
            cell.innerHTML = customers[i][j];
        }
    }

    var dvTable = document.getElementById("dvTable");
    dvTable.innerHTML = "";
    dvTable.appendChild(table);
}

/*function adicionar(){

    let text = document.querySelector("#texto").value;
    let list = document.querySelector("#lista").innerHTML;

    list += "<li>" +text+ "</li>"

    document.querySelector("#lista").innerHTML = list;
}*/

