var dn = "CN=Ivanov,Ivan,Ivanovich,ADDR=Russia, Tatarstan rep., Kazan city, Br. Kasimovykh str.,bld. 45,OU=Development,DC=cbr,DC=ru";

function parse(source) {
  const sourceArr = source.split('=');
  // ['CN', 'Ivanov,Ivan,Ivanovich,ADDR', 'Russia, Tatarstan rep., Kazan city, Br. Kasimovykh str.,bld. 45,OU']
  let result = [];
  const first = {};

  first[sourceArr[0]] = '';
  result.push(first);
  // TODO поставить первый ключ
  for (let i = 1; i < sourceArr.length; i++ ) {
    // TODO разбить по запятой, вся "левая" часть - значение на i - 1, "правая" - ключ на i
    const tempArr = sourceArr[i].split(',');
    // [Ivanov,Ivan,Ivanovich,ADDR]
    const currentKey = tempArr[tempArr.length - 1];
    const previosValue = tempArr.splice(0,tempArr.length - 1).join(',');
    result[i-1][Object.keys(result[i-1])[0]] = previosValue;

    const next = {};
    next[currentKey] = '';
    result.push(next);
  }

  const last = result[result.length - 1];
  const lastValue = Object.keys(last)[0];
  result[result.length - 2][Object.keys(result[result.length - 2])[0]] = lastValue;
  result = result.splice(0, result.length - 1);


  return result;
}

/*
[
    {
        "CN": "Ivanov,Ivan,Ivanovich"
    },
    {
        "ADDR": "Russia, Tatarstan rep., Kazan city, Br. Kasimovykh str.,bld. 45"
    },
    {
        "OU": "Development"
    },
    {
        "DC": "cbr"
    },
    {
        "DC": "ru"
    }
]
*/
