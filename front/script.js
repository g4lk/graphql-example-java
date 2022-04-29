const showHome = (ev) => {
    ev.preventDefault();
    
    let h1= document.createElement('H1');
    h1.innerHTML = 'Aplicación de prueba de graphql con Spring boot y vanilla graphql'
    const div = createDiv('about-container')
}

const createDiv = (id) => {
    let div= document.createElement("div");
    div.setAttribute('id', id);
    return div;
}


document.querySelector("a[name='home']").addEventListener("click", showHome);