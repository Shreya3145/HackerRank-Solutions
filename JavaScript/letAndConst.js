function main() {
    // Write your code here. Read input using 'readLine()' and print output using 'console.log()'.
    const PI = Math.PI;
    let radius = readLine();
    let area = PI * radius * radius ;
    let perimeter = 2 * PI * radius;
    // Print the area of the circle:
    console.log(area);
    // Print the perimeter of the circle:
    console.log(perimeter);
}