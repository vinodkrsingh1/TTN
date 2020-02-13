var initobj = {
    id:1,
    name:"vinod",
    department:"BigData"
}
var copyobj = {}

for(key in initobj){
    copyobj[key] = initobj[key]
}
console.log('copied arr: ',copyobj)