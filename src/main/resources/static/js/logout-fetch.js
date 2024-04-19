const btn_logout = document.getElementById('logout-button');
btn_logout.addEventListener('click', () => {
    fetch(back_end_server_url + '/api/token', {
        headers: {
            'Authorization' : auth
        },
        method: "DELETE"
    })
        .then(response => {
            if (response.ok) {
                sessionStorage.setItem("JWT", "logout")
                window.location.href = '/views/login';
            }
            else response.json().then(error => alert(error.message));
        })
})
