class Polygon {
  constructor(arr) {
    this.arr = arr;
  }
  perimeter() {
    if (this.arr[0] == this.arr[1]) {
      return 4 * this.arr[0];
    } else if (this.arr[0] == this.arr[2]) {
      return 2 * (this.arr[0] + this.arr[1]);
    } else {
      return (
        this.arr[0] + this.arr[1] + this.arr[2] + this.arr[3] + this.arr[4]
      );
    }
  }
}

const rectangle = new Polygon([10, 20, 10, 20]);
const square = new Polygon([10, 10, 10, 10]);
const pentagon = new Polygon([10, 20, 30, 40, 43]);

console.log(rectangle.perimeter());
console.log(square.perimeter());
console.log(pentagon.perimeter());
