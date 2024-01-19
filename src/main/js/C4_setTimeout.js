for (var i = 0; i < 5; i++) {
  setTimeout(function () {
    console.log(i);
  }, i * 1000);
}

// 5

console.log('I');
setTimeout(() => {
  console.log('love');
}, 0);
console.log('Javascript!');

// I
// Javascript!
// love