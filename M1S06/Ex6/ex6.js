const avgAge = async (country_id, name) => {
    document.getElementById('nome').innerText = name;
    document.getElementById('pais').innerText = country_id; 
    const response = await fetch(`https://api.agify.io/?country_id=${country_id}&name=${name}`);
     const data = await response.json();
     document.getElementsByTagName('p')[0].innerText = `Para ${data.name}, a idade média é ${data.age} anos.`
}
avgAge('BR', 'lucas');