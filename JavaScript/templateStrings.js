function sides(literals, ...expressions) {
  let [A, P] = expressions;
  let s1 = (P + Math.sqrt(P * P - 16 * A)) / 4;
  let s2 = (P - Math.sqrt(P * P - 16 * A)) / 4;

  return [s1, s2].sort((a, b) => a - b);
}
