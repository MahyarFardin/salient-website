const home= document.querySelector(".home");
const about= document.querySelector(".about");
const features= document.querySelector(".features");
const team= document.querySelector(".team");
const contact= document.querySelector(".contact");
const resume= document.querySelector(".resume");

var last=home;

console.log()

home.addEventListener("click",() => {
    console.log("clicked");
    home.classList.add("active");
    last.classList.remove("active");
    last=home;
});

about.addEventListener("click",() => {
    about.classList.add("active");
    last.classList.remove("active");
    last=about;
});

features.addEventListener("click",() => {
    features.classList.add("active");
    last.classList.remove("active");
    last=features;
});

team.addEventListener("click",() => {
    team.classList.add("active");
    last.classList.remove("active");
    last=team;
});

contact.addEventListener("click",() => {
    contact.classList.add("active");
    last.classList.remove("active");
    last=contact;
});

resume.addEventListener("click",() => {
    resume.classList.add("active");
    last.classList.remove("active");
    last=resume;
});