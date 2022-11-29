document.forms[0].onsubmit = function () {
    formluario = true;
    var nome = document.getElementById("nome");
    var assunto = document.getElementById("assunto");
    var texto = document.getElementById("texto");
    var telefone = document.getElementById("telefone");

    //verifica o email 
    email = document.getElementById("email");
    usuario = email.value.substring(0, email.value.indexOf("@"));
    dominio = email.value.substring(email.value.indexOf("@")+ 1, email.value.length);
    

    if (nome.value.length <= 0 || nome.value.length > 20) {
        document.querySelector("#msgNome").innerHTML = "Nome não pode estar em branco e deve ter menos de 20 caracteres";
        document.querySelector("#nome").classList.add("border-danger");
        formluario = false;
    } else {
        document.querySelector("#msgNome").innerHTML = "";
        document.querySelector("#nome").classList.remove("border-danger");

    }
    if (telefone.value.length != 11) {
        document.querySelector("#msgTelefone").innerHTML = "Telefone deve ter 11 números";
        document.querySelector("#telefone").classList.add("border-danger");
        formluario = false;
    } else {
        document.querySelector("#msgTelefone").innerHTML = "";
        document.querySelector("#telefone").classList.remove("border-danger");

    }
    if (assunto.value.length <= 0 || assunto.value.length > 60) {

        document.querySelector("#msgAssunto").innerHTML = "Assunto deve ter menos que 60 caracteres e não pode estar em branco";
        document.querySelector("#assunto").classList.add("border-danger");
        formluario = false;

    } else {
        document.querySelector("#msgAssunto").innerHTML = "";
        document.querySelector("#assunto").classList.remove("border-danger");


    }
    if (texto.value.length <= 0 || texto.value.length > 300) {

        document.querySelector("#msgTexto").innerHTML = "Seu texto deve ter menos que 300 caracteres e não pode estar em branco";
        document.querySelector("#texto").classList.add("border-danger");
        formluario = false;

    } else {

        document.querySelector("#msgTexto").innerHTML = "";
        document.querySelector("#texto").classList.remove("border-danger");

    }
    if ((usuario.length >= 1) &&
        (dominio.length >= 3) &&
        (usuario.search("@") == -1) &&
        (dominio.search("@") == -1) &&
        (usuario.search(" ") == -1) &&
        (dominio.search(" ") == -1) &&
        (dominio.search(".") != -1) &&
        (dominio.indexOf(".") >= 1) &&
        (dominio.lastIndexOf(".") < dominio.length - 1)) {

            document.querySelector("#msgEmail").innerHTML = "";
            document.querySelector("#email").classList.remove("border-danger");
    }
    else {
        document.querySelector("#msgEmail").innerHTML = "Email Invalido";
        document.querySelector("#email").classList.add("border-danger");
        formluario = false;
    }

    return formluario;
}
