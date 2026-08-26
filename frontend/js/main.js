document
  .getElementById("formRegister")
  .addEventListener("submit", async function (event) {
    event.preventDefault();

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
<<<<<<< HEAD
<<<<<<< HEAD
    const password = document.getElementById("inputPassword").value;
=======
>>>>>>> 984f4764b48fbc07fed2e1177b809cda2717b5df
=======
>>>>>>> 984f4764b48fbc07fed2e1177b809cda2717b5df

    const messageDiv = document.getElementById("message");

    const data = {
      name: name,
      email: email,
<<<<<<< HEAD
<<<<<<< HEAD
      password: password,
=======
>>>>>>> 984f4764b48fbc07fed2e1177b809cda2717b5df
=======
>>>>>>> 984f4764b48fbc07fed2e1177b809cda2717b5df
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
