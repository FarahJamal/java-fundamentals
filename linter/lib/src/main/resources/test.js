let instruction = alert("Hello and welcome to potters head info collect. We need to collect some information from you before you can access the site.")
let name = prompt("What\'s your name?")
if (name != null){
    alert("Hi "+ name +" welcome to my website")};
let potterHead = prompt('Are you a Potter head?'); // declare var confirm to collect user input
if(potterHead == 'yes'){
    alert('Hola! Youpee you are Potter head!');
}
else{
    alert('No Problem you can be a Potter Head in the future if you watch or read any thing releated :D');

}
let fav = prompt(" Enter your Faviroute charachter.:")

alert('Wow! your faviroute char is'+fav)
let worst = prompt('Enter the most charachter you hate');






console.log(name);
console.log(potterHead);
console.log(fav);
console.log(worst);



if(name){
    document.getElementById('name').innerText = name
}
if(potterHead){
    document.getElementById('potterHead').innerText = potterHead
}
if(fav)
    document.getElementById('fav').innerText = fav
}
if(worst){
    document.getElementById('worst').innerText = worst
