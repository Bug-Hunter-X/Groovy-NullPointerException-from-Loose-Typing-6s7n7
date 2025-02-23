```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null
  }
  return a + b
}

println myMethod(1, 2) //Output: 3
println myMethod(null, 2) // Output: null
println myMethod(1, null) // Output: null
println myMethod(null, null) //Output: null
```