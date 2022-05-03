const showHome = (ev) => {
    ev = ev || window.event;
    ev.preventDefault();
    
    changeActive('home');
    removeContainer();
    let h1= document.createElement('H1');
    h1.innerHTML = 'Aplicación de prueba de graphql con Spring boot y vanilla graphql';
    const div = createDiv('about-container');
    div.appendChild(h1);
    document.body.appendChild(div)
}

const showSpeakers = (ev) => {
    ev.preventDefault();
    
    changeActive('speakers');
    removeContainer();
    const div = createDiv('speaker-container');
    addSpeakers(div)
    document.body.appendChild(div)
}

const showTalks = (ev) => {
    ev.preventDefault();
    
    changeActive('talks');
    removeContainer();
    const div = createDiv('talk-container');
    addTalks(div)
    document.body.appendChild(div)
}

const createDiv = (id) => {
    const div= document.createElement("div");
    div.setAttribute('id', id);
    return div;
}

const changeActive = (id) => {
    const e = document.querySelector(".active");
    if (e.id !== id) {
        e.classList.remove("active")
        document.getElementById(id).classList.add("active");
    }
}

const addSpeakers = (div) => {
    const options = {
        method: "post",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify({
          query: getSpeakersQuery()
        })
      };
    
    fetch(`https://8080-g4lk-graphqlexampleja-m1qd6f9nf71.ws-eu43.gitpod.io/graphql`, options)
    .then(res => res.json())
    .then((responseJson) => {
        renderSpeakers(responseJson,div);
    });
    
}

const addTalks = (div) => {
    const options = {
        method: "post",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify({
          query: getTalksQuery()
        })
      };
    
    fetch(`https://8080-g4lk-graphqlexampleja-m1qd6f9nf71.ws-eu43.gitpod.io/graphql`, options)
    .then(res => res.json())
    .then((responseJson) => {
        renderTalks(responseJson,div);
    });
}

const getTalksQuery = () => `{ talks { name description type speaker { name }} }`;
const getSpeakersQuery = () => `{ speakers { name description talks { name }} }`;

const removeContainer = () => {
    const boxes = document.querySelectorAll('div');
    boxes.forEach(box => {
        box.remove();
    });
}

const renderTalks = ({data}, div) => {
  

  const talkFragment = document.createDocumentFragment();
  data.talks.forEach((talk) => {
    const talkPre = document.createElement('pre');
    const talkCode = document.createElement('code');
    talkCode.textContent = JSON.stringify(talk,null,2);
    talkPre.appendChild(talkCode);
    talkFragment.appendChild(talkPre);
  });

  //talkFragment.appendChild(talksList);
  div.appendChild(talkFragment);
  document.body.appendChild(div);
}

const renderSpeakers = ({data}, div) => {
    const speakerFragment = document.createDocumentFragment();
    data.speakers.forEach((speaker) => {
        const speakerPre = document.createElement('pre');
        const speakerCode = document.createElement('code');
        speakerCode.textContent = JSON.stringify(speaker,null,2);
        speakerPre.appendChild(speakerCode);
        speakerFragment.appendChild(speakerPre);
    });

  
    div.appendChild(speakerFragment);
    document.body.appendChild(div);
}
