const form = document.querySelector("form");
 
function inserir(num){  
    document.form.textview.value = document.form.textview.value + num;  
}  
  

function igual()  {  
    var exp = document.form.textview.value;  
        if(exp)  
        {  
            document.form.textview.value = eval(exp)  
        }  
}  
  

function backspace()  {  
    var exp = document.form.textview.value;  
    document.form.textview.value = exp.substring(0, exp.length - 1);  
}  

function apagar(){
    document.getElementById('text-view').value = '';
}