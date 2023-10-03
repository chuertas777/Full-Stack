function calcularRadioCirculo() {

    let radio = document.getElementById("txtRadio").value;
    let reslt = Math.PI * (Math.pow(radio, 2));
    
    document.getElementById("valueRadio").innerHTML = reslt;
 
}

