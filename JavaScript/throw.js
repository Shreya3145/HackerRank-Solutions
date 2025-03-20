function isPositive(a) {
    try {
        if (a < 0) 
            throw new Error("Negative Error");
         else if (a === 0) 
            throw new Error("Zero Error");
        else 
            return "YES";
    } catch (e) {
        return e.message;
    }
    
}