const form = document.querySelector('.form');

function calcular(){
    
    let sucoPrice =   4.00;
    let refrigerantePrice = 2.50;
    let aguaPrice = 1.50;
    let boloPrice = 3.40;
    let pastelPrice = 3.00;
    let tortaPrice = 4.00;
    let buyPrice = null;

    let name = form.querySelector('#client').value;

    let option = document.getElementsByName('optratio');
    let option_value;
    for(let i = 0; i < option.length; i++){
        if(option[i].checked){
            switch(option[i].value){
                case 'Suco':
                    buyPrice = sucoPrice;
                break;

                case 'Refrigerante':
                    buyPrice = refrigerantePrice;
                break;

                case 'Água':
                    buyPrice = aguaPrice;
                break;
            }

            option_value = option[i].value;
        }
    }

    let option2 = document.getElementsByName('option');
    let option2_value = [];
    for(let i = 0; i < option2.length; i++){
        if(option2[i].checked){
            switch(option2[i].value){
                case 'Bolo':
                    buyPrice += boloPrice;
                break;

                case 'Pastel':
                    buyPrice += pastelPrice;
                break;

                case 'Torta':
                    buyPrice += tortaPrice;
                break;
            }

            option2_value.push(option2[i].value);
        }
    }

    alert("Nome do cliente: " + name + "\nBebida: " + option_value + "\nDoces e Salgados: " + option2_value + "\nValor: R$" + buyPrice);
}