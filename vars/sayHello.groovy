def call(String name, String Date) {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    sh "echo Hello, ${name}. today is ${Date}"
}