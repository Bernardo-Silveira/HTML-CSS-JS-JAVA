document
  .getElementById("formRegister")
  .addEventListener("submit", async function (event) {
    event.preventDefault();

    const data = {
      name: document.getElementById("name").value.trim(),
      email: document.getElementById("email").value.trim(),
      password: document.getElementById("inputPassword").value,
    };

    const messageDiv = document.getElementById("message");

    try {
      const response = await fetch("http://localhost:8080/api/clients", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
      });

      const responseBody = await response.text();
      let responseData = null;

      try {
        responseData = responseBody ? JSON.parse(responseBody) : null;
      } catch {
        responseData = null;
      }

      if (!response.ok) {
        const errorMessage =
          responseData?.message ||
          responseData?.error ||
          "Could not register the client.";
        throw new Error(errorMessage);
      }

      messageDiv.className = "alert alert-success mt-3";
      messageDiv.textContent = "Client registered successfully.";
      messageDiv.classList.remove("d-none");
      document.getElementById("formRegister").reset();
    } catch (error) {
      messageDiv.className = "alert alert-danger mt-3";
      messageDiv.textContent =
        error instanceof TypeError
          ? "Could not connect to the server."
          : error.message;
      messageDiv.classList.remove("d-none");
    }
  });
