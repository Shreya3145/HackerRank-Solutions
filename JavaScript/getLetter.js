function getLetter(s) {
    let letter = s.charAt(0);
    
    switch(letter){
        case ( 'a' || 'e' || 'o' || 'i' || 'u'):
        letter = 'A';
        break;
        
        case ('b' || 'c' || 'd' || 'f' || 'g'):
        letter = 'B';
        break;
        
        case ('h' || 'j' || 'k' || 'l' || 'm'):
        letter = 'C';
        break;
        
        default:
        letter = 'D';
        break;
        
    }
    
    return letter;
}
