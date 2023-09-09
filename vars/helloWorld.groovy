def call(Map config = [:]) {
  sh "echo Hello ${config.name}. Your surname is ${config.surname}."
}
