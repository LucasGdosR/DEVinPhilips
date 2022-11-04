import Usuario from "./Usuario.js";

const usuario = new Usuario("lucas", "lucas@philips.com", "senha");

const form = document.getElementsByTagName("form");

form[0].addEventListener("submit", autenticar);

function autenticar(event) {
    event.preventDefault();
    const email = event.target.email.value;
    const password = event.target.password.value;
    if (usuario.autenticar(email, password)) alert("Autenticação realizada com sucesso.");
    else alert("Credenciais inválidas.");
}