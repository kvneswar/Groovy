if (true){
  println 'Hey It\'s true'
}

if(!false){
  println 'Hey It\'s false'
}

def var1 = null
if(var1){
  println "Var1 has a value"
}

def var2 = ''
if(var2){
  println "Var2 has a value"
}

println 'While Begin'
def var3 = 1
while (var3 <= 10){
  println var3
  var3 ++
}
println 'While End'

println 'For begin'
def var4 = [1, 2, 3, 4, 5]
for(loopVar in var4){
  println loopVar
}
println 'For End'

println 'Closure Start'
def var5 = [1, 2, 3, 4, 5]
var5.each {
  println it
}
println 'Closure End'

println 'Switch Start'
def var6 = 11
switch(var6){
  case 1:
    println 'It\'s 1'
    break;

  case 10:
    println 'It\'s 10'
    break;

  default:
    println 'It\' s Default'
}
println 'Switch End'

// for, while, closure, switch
