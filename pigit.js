function pigIt(str){
  var words = str.split(' ')
var backward = words.map(function(word){
        
        if(word.length==1 && word.charAt(0)!="O"&& word.charAt(0)!="o")
        return word.charAt(0)
        else
        return word.substr(1) + word.charAt(0) + 'ay'
  })
  return backward.join(' ')
}
