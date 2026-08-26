document
  .getElementById("formRegister")
  .addEventListener("submit", async function (event) {
    event.preventDefault();

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("inputPassword").value;

    const messageDiv = document.getElementById("message");

    const data = {
      name: name,
      email: email,
      password: password,
    };

    try {
      const response = await fetch("http://localhost:8080/api/clients", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
      });

      if (response.ok) {
        const responseText = await response.text();
        messageDiv.className = "alert alert-success mt-3";
        messageDiv.textContent = responseText;
        messageDiv.classList.remove("d-none");
        document.getElementById("formRegister").reset();
      } else {
        throw new Error("Error processor request of server.");
      }
    } catch (error) {
      messageDiv.className = "alert alert-danger mt-3";
      messageDiv.textContent = "Error of conection with server.";
      messageDiv.classList.remove("d-none");
    }
  });
