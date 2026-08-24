document
  .getElementById("formRegister")
  .addEventListener("submit", async function (event) {
    event.preventDefault();

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const mensageDiv = document.getElementById("mensage");

    const data = {
      name: name,
      email: email,
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
        mensageDiv.className = "alert alert-success mt-3";
        mensageDiv.textContent = responseText;
        mensageDiv.classList.remove("d-none");
        document.getElementById("formRegister").reset();
      } else {
        throw new Error("Error processor request of server.");
      }
    } catch (error) {
      mensageDiv.className = "alert alert-danger mt-3";
      mensageDiv.textContent = "Error of conection with server.";
      mensageDiv.classList.remove("d-none");
    }
  });
