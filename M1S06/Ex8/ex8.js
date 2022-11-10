const generateUsers = async (num) => {
    const response = await fetch(`https://randomuser.me/api/?results=${num}`);
    const data = await response.json();
    for (const user of data.results) {
        const outerDiv = document.createElement('div');
        outerDiv.classList = 'user';
        const img = document.createElement('img');
        img.src = user.picture.large;
        const innerDiv = document.createElement('div');
        const name = document.createElement('p');
        name.innerText = `${user.name.title} ${user.name.first} ${user.name.last}`;
        const email = document.createElement('p');
        email.innerText = user.email;
        const address = document.createElement('p');
        address.innerText = `${user.location.street.name} - ${user.location.street.number} ${user.location.city} - ${user.location.state} - ${user.location.country}`;
        innerDiv.appendChild(name);
        innerDiv.appendChild(email);
        innerDiv.appendChild(address);
        outerDiv.appendChild(img);
        outerDiv.appendChild(innerDiv);
        document.getElementsByTagName('main')[0].appendChild(outerDiv);
    }
}

document.getElementsByTagName('form')[0]
.addEventListener('submit', (event) => {
    event.preventDefault();
    generateUsers(parseInt(document.getElementById('input').value))
})