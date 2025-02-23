```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Return a default value instead of null
  }
  return a + b
}

println myMethod(1, 2) // Output: 3
println myMethod(null, 2) // Output: 2
println myMethod(1, null) // Output: 1
println myMethod(null, null) // Output: 0

// Alternative solution using the Elvis operator
def myMethodElvis(a, b) {
  return (a ?: 0) + (b ?: 0) 
}
println myMethodElvis(1,2) // Output: 3
println myMethodElvis(null,2) // Output: 2
println myMethodElvis(1, null) // Output: 1
println myMethodElvis(null, null) // Output: 0
```