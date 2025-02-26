/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    yield 0
    yield 1
    let i=0
    let j=1
    while(true){
        let k=i+j
        yield k
        i=j
        j=k
    
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */