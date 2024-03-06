/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    if(functions.length === 0){
        return function(x) {
            return x;
        }
    }else{
        return function(x){
            let res = functions[functions.length - 1](x)
            for(let fun = functions.length - 2; fun >= 0; fun--){
                res = functions[fun](res)
            }
            return res
        }
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */