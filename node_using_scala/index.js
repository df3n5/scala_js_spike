// This exports a function testScalaObject.testScalaFunc
var scalaModule = require('./scala-js-spike-fastopt.js')

console.log(Object.keys(scalaModule))

console.log(scalaModule.testScalaObj.testScalaFunc('stringFromOrigJs'))
