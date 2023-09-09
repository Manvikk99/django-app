def call() {
  sh "echo Hello ${config.name}. Your surname is ${config.surname}."
}
