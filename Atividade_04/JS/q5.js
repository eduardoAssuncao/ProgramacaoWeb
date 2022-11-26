const form = document.querySelector("form");
// Use insert() function to insert the number in textview.  
function inserir(num){  
    document.form.textview.value = document.form.textview.value + num;  
}  
  
// Use equal() function to return the result based on passed values.  
function igual()  {  
    var exp = document.form.textview.value;  
        if(exp)  
        {  
            document.form.textview.value = eval(exp)  
        }  
}  
  
/* Here, we create a backspace() function to remove the number at the end of the numeric series in textview. */  
function backspace()  {  
    var exp = document.form.textview.value;  
    document.form.textview.value = exp.substring(0, exp.length - 1); /* remove the element from total length ? 1 */  
}  

function apagar(){
    document.getElementById('text-view').value = '';
}