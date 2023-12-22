console.log("JS09 NPM");

const url = "https://fakestoreapi.com/users"

// ======= Peticion Get usando api Fetch, con async await, usando excepciones (try catch) =========
const getUsersUsingFetch = async (url) => {
    // realizar la solicitud HTTP get, usando la API FETCH
    try {
        const response = await fetch(url);
        //convertirlo a objeto
        const user = await response.json();
        console.log("GET Fetch", user);

    } catch (error) {
        console.log(error);
    }
}
getUsersUsingFetch(url);

// ======= Peticion Get usando api Fetch Con Then, chatch =============
const getUsersUsingFetch2 = (url) => {
    // realizar la solicitud HTTP get, usando la API FETCH
    fetch(url)
        .then((response) => {
            //convertirlo a objeto
            return response.json();

        })
        .then(data => {
            console.log("GET Fetch2", data);
            // Hacer algo con los datos, como mostrarlos en la página
        })
        .catch((error) => {
            console.warn(error);
        })
}
getUsersUsingFetch2(url);

// ========= Peticion Get usando api Axios =================
const getUsersUsingAxios = async (url) => {
    try {
        const user = await axios.get(url);
        console.log("GET Axios", user.data);

    } catch (error) {
        console.log(error);
    }
}
getUsersUsingAxios(url);

// ========== Peticion POST usando api axios ================
const postUsingAxios = async () => {
    const url = "https://reqres.in/api/users";
    const user = {
        name: "Aldo",
        job: "Developer Ch35"
    }

    const response = await axios.post(url, user);
    console.log("POST Axios", response.data);
}
postUsingAxios();

// ============ Peticion POST usando api fetch =================
const postUsingFetch = async () => {
    const url = "https://reqres.in/api/users";
    const user = {
        name: "Aldo",
        job: "Developer Ch35"
    }

    const response = await fetch(url, {
        method: "POST", // *GET, POST, PUT, DELETE, etc.
        headers: {
            "Content-Type": "application/json",

        },
        body: JSON.stringify(user), // body data type must match "Content-Type" header
    });
    const newUser = await response.json();
    console.log(" POST Fetch", newUser);
}
postUsingFetch();

