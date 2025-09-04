const form = document.getElementById("usuarioForm");
const resposta = document.getElementById("resposta");

form.addEventListener("submit", function(event) {
    event.preventDefault(); // evita recarregar a página

    const nome = document.getElementById("nome").value;
    const idade = parseInt(document.getElementById("idade").value);

    fetch("http://localhost:8080/usuarios", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ nome: nome, idade: idade })
    })
    .then(response => response.json())
    .then(data => {
        resposta.textContent = JSON.stringify(data, null, 2);
    })
    .catch(error => {
        resposta.textContent = "Erro: " + error;
    });
});
