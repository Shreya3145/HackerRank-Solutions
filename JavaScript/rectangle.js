function Rectangle(a, b) {
    let obj = {
    length: a, 
    width:b, 
    perimeter: perimeter(a, b), 
    area: area(a, b)
}; 
return obj
}
function perimeter(a, b)
{
         return 2 * (a+b); 
}
function area(a, b){ 
        return a*b;
    }