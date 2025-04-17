function getDayName(dateString) {
    const date =new Date(dateString);
    let dayName = date.getDay();
    let days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
    return days[dayName];
}