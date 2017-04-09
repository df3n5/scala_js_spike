// This exports a function testScalaObject.testScalaFunc
var scalaModule = require('./spike-opt.js')

console.log(Object.keys(scalaModule))

console.log(scalaModule.testScalaObj.testScalaFunc('stringFromOrigJs'))
