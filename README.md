# Current files

  - Converted from firebase-admin@^4.1.2 transpiled by ts2kt@0.0.12
  - And some tweak...

# Make jar

```
$ gradle jar
```

# Use


```gradle
dependencies {
    testCompile "org.jetbrains.kotlin:kotlin-test-js:$kotlin_version"
    compileOnly files("typings/firebase-admin-kotlin-type-declaration.jar")
}
```
