const localTime = () => {
    const date = new Date();
    let hour = date.getHours();
    if (hour < 10) hour = '0' + hour;
    let minute = date.getMinutes();
    if (minute < 10) minute = '0' + minute;
    let second = date.getSeconds();
    if (second < 10) second = '0' + second;
    console.log(`${hour}:${minute}:${second}`);
}

setInterval(localTime, 2000);