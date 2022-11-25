const form = document.querySelector('.form')

let quantidade;
let codigo;

let cachorroQuente = {
    codigo: 100, preco: 5.20
};
let bauruSimples = {
    codigo: 101, preco: 9.30
};
let bauruComOvo = {
    codigo: 102, preco: 11.50
};
let hamburguer = {
    codigo: 103, preco: 15.20
};
let cheeseburguer = {
    codigo: 104, preco: 16.30
};
let refrigerante = {
    codigo: 105, preco: 5.00
};

form.addEventListener('submit', function (event){
    event.preventDefault();
    quantidade = form.querySelector('#qtd').value
    codigo = form.querySelector('#codigo').value
    console.log(codigo);
    switch(codigo) {
        case '100':
        alert("Valor da compra: R$" + (cachorroQuente.preco * quantidade) + "reais");
        break;
        case '101':
        alert("Valor da compra: R$" + (bauruSimples.preco * quantidade) + "reais");
        break;
        case '102':
        alert("Valor da compra: R$" + (bauruComOvo.preco * quantidade) + "reais");
        break;
        case '103':
        alert("Valor da compra: R$" + (hamburguer.preco * quantidade) + "reais");
        break;
        case '104':
        alert("Valor da compra: R$" + (cheeseburguer.preco * quantidade) + "reais");
        break;
        case '105':
        alert("Valor da compra: R$" + (refrigerante.preco * quantidade) + "reais");
        break;
        default:
        alert("Produto não encontrado!");
    }
    
});
