class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        if (s.length % 2 !== 0) {
            return false
        }
        let bracketMap = {
            '}' : '{',
            ')' : '(',
            ']' : '[' 
          }

    let stack = [];
    for(let i=0; i < s.length; i++) {
        if(s[i] === '{' || s[i] === '[' || s[i] === '(') {
            stack.push(s[i]);
        }
        else if (s[i] === ')' || s[i] === '}' || s[i] === ']') {
            if(stack.length === 0 || stack.pop() !== bracketMap[s[i]]){
                return false;
            } 
        }
    }

    return stack.length === 0;
  }
}
